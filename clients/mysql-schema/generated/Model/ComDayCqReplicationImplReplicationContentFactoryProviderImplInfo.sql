--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationContentFactoryProviderImplInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo`
--
INSERT INTO `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo`
--
UPDATE `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo`
--
DELETE FROM `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo` WHERE 0;

