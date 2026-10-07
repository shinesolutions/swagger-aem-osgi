--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAccountImplAccountManagementServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAccountImplAccountManagementServletProperties`
--
SELECT `cq.accountmanager.config.informnewaccount.mail`, `cq.accountmanager.config.informnewpwd.mail` FROM `comAdobeCqAccountImplAccountManagementServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAccountImplAccountManagementServletProperties`
--
INSERT INTO `comAdobeCqAccountImplAccountManagementServletProperties`(`cq.accountmanager.config.informnewaccount.mail`, `cq.accountmanager.config.informnewpwd.mail`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqAccountImplAccountManagementServletProperties`
--
UPDATE `comAdobeCqAccountImplAccountManagementServletProperties` SET `cq.accountmanager.config.informnewaccount.mail` = ?, `cq.accountmanager.config.informnewpwd.mail` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAccountImplAccountManagementServletProperties`
--
DELETE FROM `comAdobeCqAccountImplAccountManagementServletProperties` WHERE 0;

