--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReplicationImplTransportHttpInfo' definition.
--


--
-- SELECT template for table `comDayCqReplicationImplTransportHttpInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReplicationImplTransportHttpInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReplicationImplTransportHttpInfo`
--
INSERT INTO `comDayCqReplicationImplTransportHttpInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReplicationImplTransportHttpInfo`
--
UPDATE `comDayCqReplicationImplTransportHttpInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReplicationImplTransportHttpInfo`
--
DELETE FROM `comDayCqReplicationImplTransportHttpInfo` WHERE 0;

