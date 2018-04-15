package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	// take in 1 object that has all the properties we want to look at.
	// This is just like Javascript
	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {

		System.out.println(search.getDurationFrom());
		System.out.println(search.getDurationTo());
		System.out.println(search.getSearchType());

		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setId("2345");
		activity.setDescription("Swimming");
		activity.setDuration(55);

		activities.add(activity);
		return activities;
	}

	// in this method we pass everything as params. It's easier to just pass 1
	// object and pull information off that object like how we do in
	// findByConstraints. This is just like Javascript
	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		// select * from activities where description is in some list and duration >
		// param and duration < param

		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setId("2345");
		activity.setDescription("Swimming");
		activity.setDuration(55);

		activities.add(activity);
		return activities;
	}

	@Override
	public void create(Activity activity) {
		// should issue an insert statement to the db
	}

	@Override
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

	@Override
	public Activity findActivity(String activityId) {
		if (activityId.equals("7777")) {
			return null;
		}

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

	@Override
	public Activity update(Activity activity) {
		// search the database to see if we have an activity with that id already
		// select * from Activity where id = ?
		// if resultSet size == 0
		// insert into Activity table
		// else
		// update the Activity table
		return activity;
	}

	@Override
	public void delete(String activityId) {
		// delete from activity where activityId = parameter we passed in

	}

}
