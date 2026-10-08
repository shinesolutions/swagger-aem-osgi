--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo`
--
UPDATE `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo` WHERE 0;

