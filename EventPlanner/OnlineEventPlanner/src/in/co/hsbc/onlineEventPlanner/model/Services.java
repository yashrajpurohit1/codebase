/**
 * DOCUMENTATION--------------------------------------------------------------->
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ---------------------------------------------------------------------------------->
 */
package in.co.hsbc.onlineEventPlanner.model;

import java.util.Objects;

public class Services {
private String serviceName;
private int serviceAmount;


public Services() {
	super();
}
public Services(String name, int amount) {
	super();
	this.serviceName = name;
	this.serviceAmount = amount;
}


@Override
public String toString() {
	return "Services [name=" + serviceName + ", amount=" + serviceAmount + "]";
}
public String getName() {
	return serviceName;
}
public void setName(String name) {
	this.serviceName = name;
}
public int getAmount() {
	return serviceAmount;
}
public void setAmount(int amount) {
	this.serviceAmount = amount;
}
@Override
public int hashCode() {
	return Objects.hash(serviceAmount, serviceName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Services other = (Services) obj;
	return serviceAmount == other.serviceAmount && Objects.equals(serviceName, other.serviceName);
}


}
