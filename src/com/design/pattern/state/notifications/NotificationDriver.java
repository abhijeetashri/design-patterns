package com.design.pattern.state.notifications;

public class NotificationDriver {

	public static void main(String[] args) {
		NotificationService notificationService = new SmsNotificationService();
		notificationService.sendNotification();

		notificationService = new AwsSnsNotificationService();
		notificationService.sendNotification();

		notificationService = new MailNotificationService();
		notificationService.sendNotification();

		notificationService = new KafkaNotificationService();
		notificationService.sendNotification();
	}
}
