--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqProjectsPurgeSchedulerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqProjectsPurgeSchedulerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqProjectsPurgeSchedulerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqProjectsPurgeSchedulerInfo`
--
INSERT INTO `comAdobeCqProjectsPurgeSchedulerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqProjectsPurgeSchedulerInfo`
--
UPDATE `comAdobeCqProjectsPurgeSchedulerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqProjectsPurgeSchedulerInfo`
--
DELETE FROM `comAdobeCqProjectsPurgeSchedulerInfo` WHERE 0;

