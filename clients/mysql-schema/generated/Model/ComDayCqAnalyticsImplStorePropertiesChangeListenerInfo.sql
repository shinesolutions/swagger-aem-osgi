--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsImplStorePropertiesChangeListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo`
--
INSERT INTO `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo`
--
UPDATE `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo`
--
DELETE FROM `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo` WHERE 0;

