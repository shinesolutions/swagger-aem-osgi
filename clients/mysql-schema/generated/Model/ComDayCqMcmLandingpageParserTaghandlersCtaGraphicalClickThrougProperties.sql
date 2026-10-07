--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties' definition.
--


--
-- SELECT template for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr`
--
SELECT `service.ranking`, `tagpattern`, `component.resourceType` FROM `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr` WHERE 1;

--
-- INSERT template for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr`
--
INSERT INTO `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr`(`service.ranking`, `tagpattern`, `component.resourceType`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr`
--
UPDATE `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr` SET `service.ranking` = ?, `tagpattern` = ?, `component.resourceType` = ? WHERE 1;

--
-- DELETE template for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr`
--
DELETE FROM `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPr` WHERE 0;

