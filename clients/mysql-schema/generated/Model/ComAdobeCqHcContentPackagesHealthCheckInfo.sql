--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHcContentPackagesHealthCheckInfo' definition.
--


--
-- SELECT template for table `comAdobeCqHcContentPackagesHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqHcContentPackagesHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqHcContentPackagesHealthCheckInfo`
--
INSERT INTO `comAdobeCqHcContentPackagesHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqHcContentPackagesHealthCheckInfo`
--
UPDATE `comAdobeCqHcContentPackagesHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHcContentPackagesHealthCheckInfo`
--
DELETE FROM `comAdobeCqHcContentPackagesHealthCheckInfo` WHERE 0;

