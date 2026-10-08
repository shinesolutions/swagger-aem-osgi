--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqExperiencelogImplExperienceLogConfigServletInfo' definition.
--


--
-- SELECT template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo`
--
INSERT INTO `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo`
--
UPDATE `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo`
--
DELETE FROM `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo` WHERE 0;

