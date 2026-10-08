--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo`
--
INSERT INTO `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo`
--
UPDATE `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo`
--
DELETE FROM `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo` WHERE 0;

