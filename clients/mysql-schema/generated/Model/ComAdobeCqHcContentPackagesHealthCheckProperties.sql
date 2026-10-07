--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqHcContentPackagesHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeCqHcContentPackagesHealthCheckProperties`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name`, `package.names` FROM `comAdobeCqHcContentPackagesHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqHcContentPackagesHealthCheckProperties`
--
INSERT INTO `comAdobeCqHcContentPackagesHealthCheckProperties`(`hc.name`, `hc.tags`, `hc.mbean.name`, `package.names`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqHcContentPackagesHealthCheckProperties`
--
UPDATE `comAdobeCqHcContentPackagesHealthCheckProperties` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ?, `package.names` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqHcContentPackagesHealthCheckProperties`
--
DELETE FROM `comAdobeCqHcContentPackagesHealthCheckProperties` WHERE 0;

