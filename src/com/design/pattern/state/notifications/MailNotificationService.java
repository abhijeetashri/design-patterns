package com.design.pattern.state.notifications;

public class MailNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("Notifying using JavaMail sender...");
	}
}
