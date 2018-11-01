package cn.ksdshpx.springmvc.beans;

/**
 * @author peng.x
 * @date 2018年11月1日 下午2:54:26
 */
public class Address {
	private String province;
	private String city;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + "]";
	}

}
