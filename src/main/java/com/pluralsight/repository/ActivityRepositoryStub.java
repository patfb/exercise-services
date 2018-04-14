package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;

public class ActivityRepositoryStub implements ActivityRepository {

	public List<Activity> findAllActivites() {
		List<Activity> activities = new ArrayList<Activity>();
		Activity activity1 = new Activity();
		Activity activity2 = new Activity();

		activity1.setDescription("Swimming");
		activity1.setDuration(55);

		activity2.setDescription("Cycling");
		activity2.setDuration(120);

		activities.add(activity1);
		activities.add(activity2);

		return activities;

	}

}
