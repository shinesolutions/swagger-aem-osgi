--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties`
--
SELECT `event.topics`, `event.filter`, `translate.listener.type`, `translate.property.list`, `poolSize`, `maxPoolSize`, `queueSize`, `keepAliveTime` FROM `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties`
--
INSERT INTO `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties`(`event.topics`, `event.filter`, `translate.listener.type`, `translate.property.list`, `poolSize`, `maxPoolSize`, `queueSize`, `keepAliveTime`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties`
--
UPDATE `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties` SET `event.topics` = ?, `event.filter` = ?, `translate.listener.type` = ?, `translate.property.list` = ?, `poolSize` = ?, `maxPoolSize` = ?, `queueSize` = ?, `keepAliveTime` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties`
--
DELETE FROM `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties` WHERE 0;

