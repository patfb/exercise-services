package com.pluralsight.client;

import static com.mscharhag.oleaster.matcher.Matchers.expect;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.describe;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.*;
import static com.mscharhag.oleaster.runner.StaticRunnerSupport.it;

import org.junit.runner.RunWith;

import com.mscharhag.oleaster.runner.OleasterRunner;



@RunWith(OleasterRunner.class)
public class ActivityClientTestOleaster {{

	describe("A suite", () -> {
		it("contains a spec with an expectation", () -> {			
			expect(40+2).toEqual(42);
		});
	});

}}
