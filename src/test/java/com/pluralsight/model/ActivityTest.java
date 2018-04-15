package com.pluralsight.model;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.describe;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.it;

import org.junit.runner.RunWith;

import com.mscharhag.oleaster.runner.OleasterRunner;



@RunWith(OleasterRunner.class)
public class ActivityTest {{

	describe("Activity", () -> {
		Activity activity = new Activity();
		
		describe(".getId", () ->{
			String id = "123";
			activity.setId(id);
			
			it("should get the id", () -> {			
				expect(activity.getId()).toEqual(id);
			});
			
		});		
	});

}}
