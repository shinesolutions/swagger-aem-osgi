--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr` WHERE 1;

--
-- INSERT template for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr`
--
INSERT INTO `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr`
--
UPDATE `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr`
--
DELETE FROM `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPr` WHERE 0;

