package com.mkyong;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import com.mkyong.customer.bo.SensingDataBoInt;
import com.mkyong.customer.model.SensingData;
import com.mkyong.customer.model.SensingDataId;

public class SensingDataBean implements Serializable {

	private SensingDataBoInt sensingDataBoInt;

	private String id = null;
	private SensingDataId sensing = null;

	public SensingDataBoInt getSensingDataBoInt() {
		return sensingDataBoInt;
	}

	public void setSensingDataBoInt(SensingDataBoInt sensingDataBoInt) {
		this.sensingDataBoInt = sensingDataBoInt;
	}

	// public List<Metrics> getAll() {
	// return getSensingDataBoInt().getAll();
	//
	// }

	public int count() {
		return getSensingDataBoInt().count();
	}

	public List<SensingData> sensoresAtivos() {

		return getSensingDataBoInt().findActiveSensing();

	}

	public int countByUser(Integer user) {
		return getSensingDataBoInt().countByUser(user);
	}

	public int countBySensor(Integer sensor) {
		return getSensingDataBoInt().countBySensor(sensor);
	}

	public List<SensingData> getSensingData(Integer user, String type) {

		List<SensingData> list = getSensingDataBoInt()
				.getSensingDataByUserAndMetric(user, type);

		if (sensing == null && list.size() > 0) {
			Object o = list.get(0);
			SensingData sd = (SensingData) o;
			setSensing(sd.getId());
			setId(concatId());

		}

		return list;
	}

	public String concatId() {
		return String
				.valueOf(getSensing().getIdSensing())
				.concat(",")
				.concat(String
						.valueOf(getSensing().getSensorNodeIdSensorNode()));

	}

	public String concat(SensingDataId sd) {
		return String.valueOf(sd.getIdSensing()).concat(",")
				.concat(String.valueOf(sd.getSensorNodeIdSensorNode()));

	}

	public SensingDataId separateId() {
		String[] list = getId().split(",");
		SensingDataId newSensing = new SensingDataId(Integer.parseInt(list[0]),
				Integer.parseInt(list[1]));
		return newSensing;
	}

	public void valueChanged(ValueChangeEvent event) {
		System.out.println("sensing " + getSensing().getIdSensing() + ", "
				+ getSensing().getSensorNodeIdSensorNode());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		setSensing(separateId());
	}

	public SensingDataId getSensing() {
		return sensing;
	}

	public void setSensing(SensingDataId sensing) {
		this.sensing = sensing;
	}

	public SensingData getTimes(Integer user, String type) {
		List<SensingData> list = getSensingDataBoInt()
				.getSensingDataByUserAndMetric(user, type);
		if (list.isEmpty()) {
			return new SensingData();
		}
		return sensingDataBoInt.findById(sensing);
	}

	public String countDays(String type) {

		String total = "";

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DAY_OF_YEAR, -6);
		for (int i = 0; i < 7; i++) {
			if (total.isEmpty())
				total = total.concat(new Integer(sensingDataBoInt
						.countByTypeAndData(type,
								dateFormat.format(cal.getTime()))).toString());
			else {
				total = total.concat(",");
				total = total.concat(new Integer(sensingDataBoInt
						.countByTypeAndData(type,
								dateFormat.format(cal.getTime()))).toString());
			}
			cal.add(Calendar.DAY_OF_YEAR, +1);

		}

		System.out.println(type + " " + total);
		return total;
	}

	public String countDaysByUser(String type, Integer user) {

		String total = "";

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.DAY_OF_YEAR, -6);
		for (int i = 0; i < 7; i++) {
			if (total.isEmpty())
				total = total.concat(new Integer(sensingDataBoInt
						.countByTypeAndDataAndUser(type,
								dateFormat.format(cal.getTime()), user))
						.toString());
			else {
				total = total.concat(",");
				total = total.concat(new Integer(sensingDataBoInt
						.countByTypeAndDataAndUser(type,
								dateFormat.format(cal.getTime()), user))
						.toString());
			}
			cal.add(Calendar.DAY_OF_YEAR, +1);

		}

		System.out.println(type + " " + total);
		return total;
	}
}
