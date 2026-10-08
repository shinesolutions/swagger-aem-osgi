--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope`
--
SELECT `number.of.retries.allowed`, `hc.tags` FROM `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope`
--
INSERT INTO `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope`(`number.of.retries.allowed`, `hc.tags`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope`
--
UPDATE `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope` SET `number.of.retries.allowed` = ?, `hc.tags` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope`
--
DELETE FROM `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPrope` WHERE 0;

