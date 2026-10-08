--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsImplStorePropertiesChangeListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties`
--
SELECT `cq.store.listener.additionalStorePaths` FROM `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties`
--
INSERT INTO `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties`(`cq.store.listener.additionalStorePaths`) VALUES (?);

--
-- UPDATE template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties`
--
UPDATE `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties` SET `cq.store.listener.additionalStorePaths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties`
--
DELETE FROM `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties` WHERE 0;

