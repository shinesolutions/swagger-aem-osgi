--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties`
--
SELECT `notify.onupdate`, `notify.oncomplete` FROM `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties`
--
INSERT INTO `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties`(`notify.onupdate`, `notify.oncomplete`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties`
--
UPDATE `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties` SET `notify.onupdate` = ?, `notify.oncomplete` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties`
--
DELETE FROM `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties` WHERE 0;

