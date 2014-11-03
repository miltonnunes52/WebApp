package com.mkyong;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import com.mkyong.customer.bo.MidlevelInformationBoInt;
import com.mkyong.customer.bo.SensingDataValueBoInt;
import com.mkyong.customer.model.MidlevelInformation;
import com.mkyong.customer.model.SensingDataId;
import com.mkyong.customer.model.SensingDataValue;

public class TableBean implements Serializable {

	private MidlevelInformationBoInt midlevelInformationBoInt;

	private SensingDataValueBoInt sensingDataValueBoInt;

	public SensingDataValueBoInt getSensingDataValueBoInt() {
		return sensingDataValueBoInt;
	}

	public void setSensingDataValueBoInt(
			SensingDataValueBoInt sensingDataValueBoInt) {
		this.sensingDataValueBoInt = sensingDataValueBoInt;
	}

	public MidlevelInformationBoInt getMidlevelInformationBoInt() {
		return midlevelInformationBoInt;
	}

	public void setMidlevelInformationBoInt(
			MidlevelInformationBoInt midlevelInformationBoInt) {
		this.midlevelInformationBoInt = midlevelInformationBoInt;
	}

	public List<MidlevelInformation> getTable(SensingDataId idsensing,
			String metrica) {
		if (idsensing == null || (metrica.isEmpty() || metrica == null)) {
			System.out.println("something null");

			return new ArrayList<MidlevelInformation>();
		}
		List<MidlevelInformation> list = midlevelInformationBoInt
				.getMidLevelByIDSensing(idsensing.getIdSensing(),
						idsensing.getSensorNodeIdSensorNode(),
						Integer.parseInt(metrica));

		System.out.println("table size " + list.size());
		return list;
	}

	public boolean tableEmpty(SensingDataId idsensing, String metrica) {

		System.out.println(idsensing);
		System.out.println(metrica);

		List<MidlevelInformation> l = getTable(idsensing, metrica);
		System.out.println("tableempty size " + l.size());
		boolean t;
		if (l.size() == 0)
			t = true;
		else
			t = false;
		System.out.println("boolean " + t);

		return t;
	}

	public String getData(String data) {
		System.out.println(data);
		return data.split(",")[0];

	}

	public String getResult(String data) {
		System.out.println(data);
		return data.split(",")[1];

	}

	public String[] splitData(String data) {
		String[] list = data.split("\\r?\\n");
		return list;
	}

	public float calcAverage(SensingDataId idsensing, String metrica) {
		List<MidlevelInformation> list = getTable(idsensing, metrica);
		if (list.isEmpty()) {
			return 0;
		}
		float total = 0;
		int size = 0;
		for (MidlevelInformation m : list) {
			String reg = m.getDescription();
			String[] subreg = splitData(reg);
			for (String r : subreg) {
				size++;
				total = total + Float.parseFloat(getResult(r));
			}
		}

		return total / size;
	}

	public float stdDev(SensingDataId idsensing, String metrica) {
		List<MidlevelInformation> list = getTable(idsensing, metrica);
		if (list.isEmpty()) {
			return 0;
		}
		float average = calcAverage(idsensing, metrica);

		// calc variance
		float temp = 0;
		int size = 0;
		for (MidlevelInformation m : list) {
			String reg = m.getDescription();
			String[] subreg = splitData(reg);
			for (String r : subreg) {
				size++;
				temp += (average - Float.parseFloat(getResult(r)))
						* (average - Float.parseFloat(getResult(r)));
			}
		}
		float variance = temp / size;

		// calc stddev
		float stdDev = (float) Math.sqrt(variance);

		return stdDev;
	}

	public String getGraphValues(SensingDataId idsensing, String metrica) {
		List<MidlevelInformation> list = getTable(idsensing, metrica);
		if (list.isEmpty()) {

			return "";
		}

		String s = "";

		for (MidlevelInformation m : list) {
			String reg = m.getDescription();
			String[] subreg = splitData(reg);
			for (String r : subreg) {
				if (s.isEmpty())
					s = getResult(r);
				else
					s = s.concat(",").concat(getResult(r));
			}
		}
		System.out.println("getGraphValues " + s);

		return s;

	}

	public String getDaysOfWeek() {
		String days = "";
		Calendar cal = Calendar.getInstance();
		Locale locale = Locale.getDefault();

		cal.add(Calendar.DAY_OF_YEAR, -6);
		for (int i = 0; i < 7; i++) {
			if (days.isEmpty())

				days = days.concat(cal.getDisplayName(Calendar.DAY_OF_WEEK,
						Calendar.LONG, locale).split("-")[0]);
			else {
				days = days.concat(",");
				days = days.concat(cal.getDisplayName(Calendar.DAY_OF_WEEK,
						Calendar.LONG, locale).split("-")[0]);
			}
			cal.add(Calendar.DAY_OF_YEAR, +1);

		}

		return days;
	}

	public List<SensingDataValue> rawData(SensingDataId idsensing) {
		if (idsensing == null)
			return new ArrayList<SensingDataValue>();
		List<SensingDataValue> list = sensingDataValueBoInt
				.getValues(idsensing.getIdSensing(),
						idsensing.getSensorNodeIdSensorNode());

		return list;
	}
}
