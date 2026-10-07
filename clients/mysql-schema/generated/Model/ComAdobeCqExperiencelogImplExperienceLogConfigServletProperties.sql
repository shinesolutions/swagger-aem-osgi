--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqExperiencelogImplExperienceLogConfigServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties`
--
SELECT `enabled`, `disabledForGroups` FROM `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties`
--
INSERT INTO `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties`(`enabled`, `disabledForGroups`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties`
--
UPDATE `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties` SET `enabled` = ?, `disabledForGroups` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties`
--
DELETE FROM `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties` WHERE 0;

