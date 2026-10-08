--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplExpiryNotificationJobImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplExpiryNotificationJobImplProperties`
--
SELECT `cq.dam.expiry.notification.scheduler.istimebased`, `cq.dam.expiry.notification.scheduler.timebased.rule`, `cq.dam.expiry.notification.scheduler.period.rule`, `send_email`, `asset_expired_limit`, `prior_notification_seconds`, `cq.dam.expiry.notification.url.protocol` FROM `comDayCqDamCoreImplExpiryNotificationJobImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplExpiryNotificationJobImplProperties`
--
INSERT INTO `comDayCqDamCoreImplExpiryNotificationJobImplProperties`(`cq.dam.expiry.notification.scheduler.istimebased`, `cq.dam.expiry.notification.scheduler.timebased.rule`, `cq.dam.expiry.notification.scheduler.period.rule`, `send_email`, `asset_expired_limit`, `prior_notification_seconds`, `cq.dam.expiry.notification.url.protocol`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplExpiryNotificationJobImplProperties`
--
UPDATE `comDayCqDamCoreImplExpiryNotificationJobImplProperties` SET `cq.dam.expiry.notification.scheduler.istimebased` = ?, `cq.dam.expiry.notification.scheduler.timebased.rule` = ?, `cq.dam.expiry.notification.scheduler.period.rule` = ?, `send_email` = ?, `asset_expired_limit` = ?, `prior_notification_seconds` = ?, `cq.dam.expiry.notification.url.protocol` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplExpiryNotificationJobImplProperties`
--
DELETE FROM `comDayCqDamCoreImplExpiryNotificationJobImplProperties` WHERE 0;

