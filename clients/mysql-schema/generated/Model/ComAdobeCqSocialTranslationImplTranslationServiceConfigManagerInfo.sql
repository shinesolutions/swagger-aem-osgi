--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn`
--
INSERT INTO `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn`
--
UPDATE `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn`
--
DELETE FROM `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerIn` WHERE 0;

