package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivites();

	Activity findActivity(String activityId);

	void create(Activity activity);

}