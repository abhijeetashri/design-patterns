package com.design.pattern.state.notifications;

public class KafkaNotificationService implements NotificationService {

	@Override
	public void sendNotification() {
		System.out.println("Notifying to Kafka cluster...");
	}
}
