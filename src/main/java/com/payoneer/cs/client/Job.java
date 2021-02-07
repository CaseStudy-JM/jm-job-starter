package com.payoneer.cs.client;

import com.payoneer.cs.error.ErrorCode;
import com.payoneer.cs.error.JobException;

public abstract class Job {

	protected abstract void process(String jobId, String... args) throws JobException;

	public void execute(String jobId, String... args) throws JobException {
		if (jobId == null || jobId.isEmpty())
			throw new JobException(ErrorCode.JOB_ERROR_001.getMessage());
		this.process(jobId, args);
	}

	public void log(String jobId, String message) {
		System.out.print("Processing jobId" + jobId + " message " + message);
	}
}
