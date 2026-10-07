--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr` WHERE 1;

--
-- INSERT template for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr`
--
INSERT INTO `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr`
--
UPDATE `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr`
--
DELETE FROM `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPr` WHERE 0;

