--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplConfFeatureConfigImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplConfFeatureConfigImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamCfmImplConfFeatureConfigImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplConfFeatureConfigImplInfo`
--
INSERT INTO `comAdobeCqDamCfmImplConfFeatureConfigImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplConfFeatureConfigImplInfo`
--
UPDATE `comAdobeCqDamCfmImplConfFeatureConfigImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplConfFeatureConfigImplInfo`
--
DELETE FROM `comAdobeCqDamCfmImplConfFeatureConfigImplInfo` WHERE 0;

