--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeOctopusNcommBootstrapInfo' definition.
--


--
-- SELECT template for table `comAdobeOctopusNcommBootstrapInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeOctopusNcommBootstrapInfo` WHERE 1;

--
-- INSERT template for table `comAdobeOctopusNcommBootstrapInfo`
--
INSERT INTO `comAdobeOctopusNcommBootstrapInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeOctopusNcommBootstrapInfo`
--
UPDATE `comAdobeOctopusNcommBootstrapInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeOctopusNcommBootstrapInfo`
--
DELETE FROM `comAdobeOctopusNcommBootstrapInfo` WHERE 0;

