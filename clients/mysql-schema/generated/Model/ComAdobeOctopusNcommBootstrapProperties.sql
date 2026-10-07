--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeOctopusNcommBootstrapProperties' definition.
--


--
-- SELECT template for table `comAdobeOctopusNcommBootstrapProperties`
--
SELECT `maxConnections`, `maxRequests`, `requestTimeout`, `requestRetries`, `launchTimeout` FROM `comAdobeOctopusNcommBootstrapProperties` WHERE 1;

--
-- INSERT template for table `comAdobeOctopusNcommBootstrapProperties`
--
INSERT INTO `comAdobeOctopusNcommBootstrapProperties`(`maxConnections`, `maxRequests`, `requestTimeout`, `requestRetries`, `launchTimeout`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeOctopusNcommBootstrapProperties`
--
UPDATE `comAdobeOctopusNcommBootstrapProperties` SET `maxConnections` = ?, `maxRequests` = ?, `requestTimeout` = ?, `requestRetries` = ?, `launchTimeout` = ? WHERE 1;

--
-- DELETE template for table `comAdobeOctopusNcommBootstrapProperties`
--
DELETE FROM `comAdobeOctopusNcommBootstrapProperties` WHERE 0;

