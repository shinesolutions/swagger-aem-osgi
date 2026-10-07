--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWorkflowImplEmailEMailNotificationServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqWorkflowImplEmailEMailNotificationServiceProperties`
--
SELECT `from.address`, `host.prefix`, `notify.onabort`, `notify.oncomplete`, `notify.oncontainercomplete`, `notify.useronly` FROM `comDayCqWorkflowImplEmailEMailNotificationServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWorkflowImplEmailEMailNotificationServiceProperties`
--
INSERT INTO `comDayCqWorkflowImplEmailEMailNotificationServiceProperties`(`from.address`, `host.prefix`, `notify.onabort`, `notify.oncomplete`, `notify.oncontainercomplete`, `notify.useronly`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWorkflowImplEmailEMailNotificationServiceProperties`
--
UPDATE `comDayCqWorkflowImplEmailEMailNotificationServiceProperties` SET `from.address` = ?, `host.prefix` = ?, `notify.onabort` = ?, `notify.oncomplete` = ?, `notify.oncontainercomplete` = ?, `notify.useronly` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWorkflowImplEmailEMailNotificationServiceProperties`
--
DELETE FROM `comDayCqWorkflowImplEmailEMailNotificationServiceProperties` WHERE 0;

