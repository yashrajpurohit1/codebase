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

public class Quotation {
private int quotationId;
private int quotationAmount;
private int quotationVendorId;
private int quotationUserId;
private int quotationPlanRequestId;
private String quotationStatus;



public Quotation() {
	super();
}


public Quotation(int id, int amount, int vendorId, int userId, int planRequestId, String status) {
	super();
	this.quotationId = id;
	this.quotationAmount = amount;
	this.quotationVendorId = vendorId;
	this.quotationUserId = userId;
	this.quotationPlanRequestId = planRequestId;
	this.quotationStatus = status;
}


@Override
public String toString() {
	return "Quotation [id=" + quotationId + ", amount=" + quotationAmount + ", vendorId=" + quotationVendorId + ", userId=" + quotationUserId
			+ ", planRequestId=" + quotationPlanRequestId + ", status=" + quotationStatus + "]";
}


@Override
public int hashCode() {
	return Objects.hash(quotationAmount, quotationId, quotationPlanRequestId, quotationStatus, quotationUserId, quotationVendorId);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Quotation other = (Quotation) obj;
	return quotationAmount == other.quotationAmount && quotationId == other.quotationId && quotationPlanRequestId == other.quotationPlanRequestId
			&& Objects.equals(quotationStatus, other.quotationStatus) && quotationUserId == other.quotationUserId && quotationVendorId == other.quotationVendorId;
}


public int getId() {
	return quotationId;
}
public void setId(int id) {
	this.quotationId = id;
}
public int getAmount() {
	return quotationAmount;
}
public void setAmount(int amount) {
	this.quotationAmount = amount;
}
public int getVendorId() {
	return quotationVendorId;
}
public void setVendorId(int vendorId) {
	this.quotationVendorId = vendorId;
}
public int getUserId() {
	return quotationUserId;
}
public void setUserId(int userId) {
	this.quotationUserId = userId;
}
public int getPlanRequestId() {
	return quotationPlanRequestId;
}
public void setPlanRequestId(int planRequestId) {
	this.quotationPlanRequestId = planRequestId;
}
public String getStatus() {
	return quotationStatus;
}
public void setStatus(String status) {
	this.quotationStatus = status;
}
}
