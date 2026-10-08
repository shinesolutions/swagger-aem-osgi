--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo' definition.
--


--
-- SELECT template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo`
--
INSERT INTO `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo`
--
UPDATE `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo`
--
DELETE FROM `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo` WHERE 0;

