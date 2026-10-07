--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties`
--
SELECT `indexing.critical.threshold`, `indexing.warn.threshold`, `hc.tags` FROM `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties`
--
INSERT INTO `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties`(`indexing.critical.threshold`, `indexing.warn.threshold`, `hc.tags`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties`
--
UPDATE `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties` SET `indexing.critical.threshold` = ?, `indexing.warn.threshold` = ?, `hc.tags` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties`
--
DELETE FROM `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties` WHERE 0;

