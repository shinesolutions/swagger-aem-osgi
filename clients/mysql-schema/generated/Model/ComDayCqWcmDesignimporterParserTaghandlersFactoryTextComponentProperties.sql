--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr`
--
INSERT INTO `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr`
--
UPDATE `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr`
--
DELETE FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPr` WHERE 0;

