package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public void create(Activity activity) {
		// should issue an insert statement to the db
	}

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

	public Activity findActivity(String activityId) {
		Activity activity1 = new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);

		User user = new User();
		user.setId("5678");
		user.setName("Bryan");

		activity1.setUser(user);

		return activity1;
	}

}
