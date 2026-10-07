--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo`
--
INSERT INTO `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo`
--
UPDATE `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo`
--
DELETE FROM `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo` WHERE 0;

