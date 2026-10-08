--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScheduledExporterImplScheduledExporterImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScheduledExporterImplScheduledExporterImplProperties`
--
SELECT `include.paths`, `exporter.user` FROM `comAdobeCqScheduledExporterImplScheduledExporterImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqScheduledExporterImplScheduledExporterImplProperties`
--
INSERT INTO `comAdobeCqScheduledExporterImplScheduledExporterImplProperties`(`include.paths`, `exporter.user`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqScheduledExporterImplScheduledExporterImplProperties`
--
UPDATE `comAdobeCqScheduledExporterImplScheduledExporterImplProperties` SET `include.paths` = ?, `exporter.user` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScheduledExporterImplScheduledExporterImplProperties`
--
DELETE FROM `comAdobeCqScheduledExporterImplScheduledExporterImplProperties` WHERE 0;

