--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScheduledExporterImplScheduledExporterImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqScheduledExporterImplScheduledExporterImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqScheduledExporterImplScheduledExporterImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqScheduledExporterImplScheduledExporterImplInfo`
--
INSERT INTO `comAdobeCqScheduledExporterImplScheduledExporterImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScheduledExporterImplScheduledExporterImplInfo`
--
UPDATE `comAdobeCqScheduledExporterImplScheduledExporterImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScheduledExporterImplScheduledExporterImplInfo`
--
DELETE FROM `comAdobeCqScheduledExporterImplScheduledExporterImplInfo` WHERE 0;

