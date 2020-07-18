package com.design.pattern.state.notifications;

public class SmsNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS...");
	}
}
