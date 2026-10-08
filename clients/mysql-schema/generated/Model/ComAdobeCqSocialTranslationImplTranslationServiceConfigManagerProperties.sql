--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr`
--
SELECT `translate.language`, `translate.display`, `translate.attribution`, `translate.caching`, `translate.smart.rendering`, `translate.caching.duration`, `translate.session.save.interval`, `translate.session.save.batchLimit` FROM `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr`
--
INSERT INTO `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr`(`translate.language`, `translate.display`, `translate.attribution`, `translate.caching`, `translate.smart.rendering`, `translate.caching.duration`, `translate.session.save.interval`, `translate.session.save.batchLimit`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr`
--
UPDATE `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr` SET `translate.language` = ?, `translate.display` = ?, `translate.attribution` = ?, `translate.caching` = ?, `translate.smart.rendering` = ?, `translate.caching.duration` = ?, `translate.session.save.interval` = ?, `translate.session.save.batchLimit` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr`
--
DELETE FROM `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPr` WHERE 0;

