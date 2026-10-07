--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties' definition.
--


--
-- SELECT template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti`
--
SELECT `enableDataTriggeredContent` FROM `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti`
--
INSERT INTO `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti`(`enableDataTriggeredContent`) VALUES (?);

--
-- UPDATE template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti`
--
UPDATE `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti` SET `enableDataTriggeredContent` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti`
--
DELETE FROM `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperti` WHERE 0;

