--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr` WHERE 1;

--
-- INSERT template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr`
--
INSERT INTO `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr`
--
UPDATE `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr`
--
DELETE FROM `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePr` WHERE 0;

