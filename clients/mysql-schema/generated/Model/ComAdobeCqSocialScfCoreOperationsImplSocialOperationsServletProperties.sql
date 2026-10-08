--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp`
--
SELECT `sling.servlet.selectors`, `sling.servlet.extensions` FROM `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp`
--
INSERT INTO `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp`(`sling.servlet.selectors`, `sling.servlet.extensions`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp`
--
UPDATE `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp` SET `sling.servlet.selectors` = ?, `sling.servlet.extensions` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp`
--
DELETE FROM `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProp` WHERE 0;

