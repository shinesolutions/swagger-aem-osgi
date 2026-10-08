--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie`
--
SELECT `sling.servlet.selectors`, `sling.servlet.extensions` FROM `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie`
--
INSERT INTO `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie`(`sling.servlet.selectors`, `sling.servlet.extensions`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie`
--
UPDATE `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie` SET `sling.servlet.selectors` = ?, `sling.servlet.extensions` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie`
--
DELETE FROM `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertie` WHERE 0;

