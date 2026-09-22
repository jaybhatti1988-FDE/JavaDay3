package com.overloading.operator.Insurancesystem.example.day3;



class  InsurancePremium  {
	
	double calculatePremium(int age) {
		double basePremium=2000; 
		if (age>50) {
			 basePremium +=1500;
		} else if(age>30){
			basePremium +=800;
		}
		return basePremium;
	}
	
	double calculatePremium(int age,String policyType) {
		
		double premium=calculatePremium(age);
		switch (policyType.toLowerCase()) {
		case "life":
			premium +=1000;
			break;
		case "medical":
			premium +=1200;
			break;	
		case "vehicle":
			premium +=1500;
			break;
		case "term":
			premium +=1700;
			break;	

		default:
			premium +=500;
		}
		return premium;
	}
	
	double calculatePremium(int age,String policyType,double coveragePremium) {
		double premium=calculatePremium(age,policyType);
		premium +=coveragePremium*0.02;
		return premium;
	}
	
	double calculatePremium(int age,double coveragePremium,boolean isSmoker) {
		double premium=calculatePremium(age);
		premium +=coveragePremium*0.02;
		if (isSmoker) {
			premium +=2000;
		}
		return premium;
	}
}

	

