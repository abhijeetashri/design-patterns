package com.design.pattern.state.notifications;

public class AwsSnsNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("Notifying AWS SNS...");
	}

}
