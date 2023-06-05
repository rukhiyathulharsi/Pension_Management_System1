package com.mongo.example.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pension")
public class Pension {
	
		
		private Integer adhaar;
		private String Name;
		private String DOB;
		private Integer pan;
		private double salaryEarned;
		private double allowance;
		private String pensionClassification;
		private String bankName;
		private Integer accountNo;
		private String BankType;
		
		
		public Integer getAdhaar() {
			return adhaar;
		}
		public void setAdhaar(Integer adhaar) {
			this.adhaar = adhaar;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public Integer getPan() {
			return pan;
		}
		public void setPan(Integer pan) {
			this.pan = pan;
		}
		public double getSalaryEarned() {
			return salaryEarned;
		}
		public void setSalaryEarned(double salaryEarned) {
			this.salaryEarned = salaryEarned;
		}
		public double getAllowance() {
			return allowance;
		}
		public void setAllowance(double allowance) {
			this.allowance = allowance;
		}
		public String getPensionClassification() {
			return pensionClassification;
		}
		public void setPensionClassification(String pensionClassification) {
			this.pensionClassification = pensionClassification;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public Integer getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(Integer accountNo) {
			this.accountNo = accountNo;
		}
		public String getBankType() {
			return BankType;
		}
		public void setBankType(String bankType) {
			BankType = bankType;
		}
		public Pension(Integer adhaar, String name, String dOB, Integer pan, double salaryEarned, double allowance,
				String pensionClassification, String bankName, Integer accountNo, String bankType) {
			super();
			this.adhaar = adhaar;
			Name = name;
			DOB = dOB;
			this.pan = pan;
			this.salaryEarned = salaryEarned;
			this.allowance = allowance;
			this.pensionClassification = pensionClassification;
			this.bankName = bankName;
			this.accountNo = accountNo;
			BankType = bankType;
		}
		public Pension() {
			super();
		}
		
		


}
