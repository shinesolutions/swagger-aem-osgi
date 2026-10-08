--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl`
--
SELECT `syncTranslationState.schedulingFormat`, `schedulingRepeatTranslation.schedulingFormat`, `syncTranslationState.lockTimeoutInMinutes`, `export.format` FROM `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl` WHERE 1;

--
-- INSERT template for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl`
--
INSERT INTO `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl`(`syncTranslationState.schedulingFormat`, `schedulingRepeatTranslation.schedulingFormat`, `syncTranslationState.lockTimeoutInMinutes`, `export.format`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl`
--
UPDATE `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl` SET `syncTranslationState.schedulingFormat` = ?, `schedulingRepeatTranslation.schedulingFormat` = ?, `syncTranslationState.lockTimeoutInMinutes` = ?, `export.format` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl`
--
DELETE FROM `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl` WHERE 0;

