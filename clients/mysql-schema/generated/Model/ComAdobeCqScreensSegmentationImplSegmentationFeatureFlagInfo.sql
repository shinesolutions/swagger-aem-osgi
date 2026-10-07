--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo' definition.
--


--
-- SELECT template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo`
--
INSERT INTO `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo`
--
UPDATE `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo`
--
DELETE FROM `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo` WHERE 0;

