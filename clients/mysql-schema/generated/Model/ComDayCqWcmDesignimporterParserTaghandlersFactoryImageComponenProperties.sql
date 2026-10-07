--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr`
--
INSERT INTO `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr`
--
UPDATE `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr`
--
DELETE FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPr` WHERE 0;

