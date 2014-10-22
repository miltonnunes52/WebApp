package com.mkyong;

import java.io.Serializable;
import java.util.List;

import com.mkyong.customer.bo.MidlevelInformationBoInt;
import com.mkyong.customer.model.MidlevelInformation;
import com.mkyong.customer.model.SensingDataId;

public class TableBean implements Serializable {

	private MidlevelInformationBoInt midlevelInformationBoInt;

	public MidlevelInformationBoInt getMidlevelInformationBoInt() {
		return midlevelInformationBoInt;
	}

	public void setMidlevelInformationBoInt(
			MidlevelInformationBoInt midlevelInformationBoInt) {
		this.midlevelInformationBoInt = midlevelInformationBoInt;
	}

	public List<MidlevelInformation> getTable(SensingDataId idsensing,
			String metrica) {
		List<MidlevelInformation> list = midlevelInformationBoInt
				.getMidLevelByIDSensing(idsensing.getIdSensing(),
						idsensing.getSensorNodeIdSensorNode(),
						Integer.parseInt(metrica));
		return list;
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
}
