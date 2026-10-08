--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr`
--
INSERT INTO `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr`
--
UPDATE `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr`
--
DELETE FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPr` WHERE 0;

