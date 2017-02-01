package com.processcentric.goal.ws;

import javax.jws.WebService;

import com.businesslogic.goal.ws.BusinessLogicGoal;
import com.businesslogic.goal.ws.BusinessLogicServiceGoal;
import com.storageservice.bmi.ws.Bmi;
import com.storageservice.bmi.ws.BmiApi;
import com.storageservice.bmi.ws.StorageServiceBmi;
import com.storageservice.fitbit.ws.Goal;
import com.storageservice.fitbit.ws.LocalApiFitBitModel;
import com.storageservice.fitbit.ws.StorageServiceFitBit;
import com.storageservice.fitbit.ws.WeightGoal;
import com.storageservice.person.ws.LocalApiPersonModel;
import com.storageservice.person.ws.StorageServicePerson;
import com.storageservice.person.ws.Person;

@WebService(endpointInterface = "com.processcentric.goal.ws.ProcessCentricGoal", serviceName = "processCentricServiceGoal")
public class ProcessCentricGoalImpl implements ProcessCentricGoal {

	@Override
	public String checkWeight(int id, String access_token, String userId, String refresh) {
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();

		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();

		StorageServiceBmi bmiservice = new StorageServiceBmi();
		BmiApi bmis = bmiservice.getBmiApiImplPort();

		WeightGoal wg= fitbits.getWeightGoal(access_token, userId, refresh);
		Person p =  people.getPersonInformation(id);

		double startWeight=wg.getStartWeight();
		double height=fitbits.getWeightHeight(access_token, userId, refresh).getHeight();
		double weight=fitbits.getWeightHeight(access_token, userId, refresh).getWeight();

		com.storageservice.bmi.ws.Person pBmi=new com.storageservice.bmi.ws.Person();
		pBmi.setBirthdate(p.getBirthdate());
		pBmi.setFirstname(p.getFirstname());
		pBmi.setLastname(p.getLastname());
		pBmi.setGenre(p.getGenre());
		pBmi.setHeight(height);
		pBmi.setWeight(weight);
		pBmi.setIdPerson(p.getIdPerson());
	
		Bmi bmi = bmis.getBmiByIdPerson(p.getIdPerson());

		if (bmi == null) {
			bmi = bmis.calculateandSavebmi(pBmi, weight, height);
			System.out.println(bmi);
		}
		String status = bmi.getStatus();
		
		System.out.println(status);
		
		BusinessLogicServiceGoal businesslogicservice = new BusinessLogicServiceGoal();
		BusinessLogicGoal goals = businesslogicservice.getBusinessLogicGoalImplPort();
		
		return goals.changeWeightControl(p.getIdPerson(),access_token, userId, refresh, status, startWeight);
	}

	@Override
	public String checkSteps(int id, String access_token, String userId, String refresh) {
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		
		Person p =  people.getPersonInformation(id);
		Goal goal=fitbits.getDailyGoal(access_token, userId, refresh);
		
		int diffGoal=p.getNTotalGoal()-p.getNGoalAchieved();
		String lifeStyle = p.getLifeStyle();
		int diffSteps = goal.getMissingSteps();
		int steps=goal.getSteps();
		
		BusinessLogicServiceGoal businesslogicservice = new BusinessLogicServiceGoal();
		BusinessLogicGoal goals = businesslogicservice.getBusinessLogicGoalImplPort();
		
		return goals.changeStepsControl(p.getIdPerson(),access_token, userId, refresh,  diffGoal, lifeStyle,diffSteps, steps);
	}

	@Override
	public String checkCalories(int id, String access_token, String userId, String refresh) {
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		
		Person p =  people.getPersonInformation(id);
		Goal goal=fitbits.getDailyGoal(access_token, userId, refresh);
		
		int diffGoal=p.getNTotalGoal()-p.getNGoalAchieved();
		String lifeStyle = p.getLifeStyle();
		int diffCalories = goal.getMissingCalories();
		int calories=goal.getCaloriesOut();
		
		BusinessLogicServiceGoal businesslogicservice = new BusinessLogicServiceGoal();
		BusinessLogicGoal goals = businesslogicservice.getBusinessLogicGoalImplPort();	
		
		return goals.changeCaloriesControl(p.getIdPerson(),access_token, userId, refresh,  diffGoal, lifeStyle,diffCalories, calories);
	}

	@Override
	public String checkDistance(int id, String access_token, String userId, String refresh) {
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		
		Person p =  people.getPersonInformation(id);
		Goal goal=fitbits.getDailyGoal(access_token, userId, refresh);
		
		int diffGoal=p.getNTotalGoal()-p.getNGoalAchieved();
		String lifeStyle = p.getLifeStyle();
		double diffDistance = goal.getMissingDistance();
		double distance=goal.getDistance();
		
		BusinessLogicServiceGoal businesslogicservice = new BusinessLogicServiceGoal();
		BusinessLogicGoal goals = businesslogicservice.getBusinessLogicGoalImplPort();
		
		return goals.changeDistanceControl(p.getIdPerson(),access_token, userId, refresh,  diffGoal, lifeStyle,diffDistance, distance);
	}
	
}