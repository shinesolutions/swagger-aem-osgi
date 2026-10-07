--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn`
--
INSERT INTO `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn`
--
UPDATE `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn`
--
DELETE FROM `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckIn` WHERE 0;

