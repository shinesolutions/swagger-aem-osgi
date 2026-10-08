--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo`
--
INSERT INTO `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo`
--
UPDATE `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo`
--
DELETE FROM `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo` WHERE 0;

