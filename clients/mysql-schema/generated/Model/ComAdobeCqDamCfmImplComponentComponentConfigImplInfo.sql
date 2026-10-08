--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplComponentComponentConfigImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplComponentComponentConfigImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamCfmImplComponentComponentConfigImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplComponentComponentConfigImplInfo`
--
INSERT INTO `comAdobeCqDamCfmImplComponentComponentConfigImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplComponentComponentConfigImplInfo`
--
UPDATE `comAdobeCqDamCfmImplComponentComponentConfigImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplComponentComponentConfigImplInfo`
--
DELETE FROM `comAdobeCqDamCfmImplComponentComponentConfigImplInfo` WHERE 0;

