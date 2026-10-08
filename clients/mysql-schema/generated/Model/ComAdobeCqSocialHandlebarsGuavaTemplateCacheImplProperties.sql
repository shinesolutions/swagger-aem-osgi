--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties`
--
SELECT `parameter.guava.cache.enabled`, `parameter.guava.cache.params`, `parameter.guava.cache.reload`, `service.ranking` FROM `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties`
--
INSERT INTO `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties`(`parameter.guava.cache.enabled`, `parameter.guava.cache.params`, `parameter.guava.cache.reload`, `service.ranking`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties`
--
UPDATE `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties` SET `parameter.guava.cache.enabled` = ?, `parameter.guava.cache.params` = ?, `parameter.guava.cache.reload` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties`
--
DELETE FROM `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties` WHERE 0;

