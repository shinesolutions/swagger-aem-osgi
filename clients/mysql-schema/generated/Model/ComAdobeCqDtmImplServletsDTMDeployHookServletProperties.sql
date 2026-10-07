--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDtmImplServletsDTMDeployHookServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDtmImplServletsDTMDeployHookServletProperties`
--
SELECT `dtm.staging.ip.whitelist`, `dtm.production.ip.whitelist` FROM `comAdobeCqDtmImplServletsDTMDeployHookServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDtmImplServletsDTMDeployHookServletProperties`
--
INSERT INTO `comAdobeCqDtmImplServletsDTMDeployHookServletProperties`(`dtm.staging.ip.whitelist`, `dtm.production.ip.whitelist`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqDtmImplServletsDTMDeployHookServletProperties`
--
UPDATE `comAdobeCqDtmImplServletsDTMDeployHookServletProperties` SET `dtm.staging.ip.whitelist` = ?, `dtm.production.ip.whitelist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDtmImplServletsDTMDeployHookServletProperties`
--
DELETE FROM `comAdobeCqDtmImplServletsDTMDeployHookServletProperties` WHERE 0;

