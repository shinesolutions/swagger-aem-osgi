--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties`
--
SELECT `large.index.critical.threshold`, `large.index.warn.threshold`, `hc.tags` FROM `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties`(`large.index.critical.threshold`, `large.index.warn.threshold`, `hc.tags`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties`
--
UPDATE `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties` SET `large.index.critical.threshold` = ?, `large.index.warn.threshold` = ?, `hc.tags` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties` WHERE 0;

