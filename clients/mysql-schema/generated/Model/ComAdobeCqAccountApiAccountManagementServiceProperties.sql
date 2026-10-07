--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAccountApiAccountManagementServiceProperties' definition.
--


--
-- SELECT template for table `comAdobeCqAccountApiAccountManagementServiceProperties`
--
SELECT `cq.accountmanager.token.validity.period`, `cq.accountmanager.config.requestnewaccount.mail`, `cq.accountmanager.config.requestnewpwd.mail` FROM `comAdobeCqAccountApiAccountManagementServiceProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqAccountApiAccountManagementServiceProperties`
--
INSERT INTO `comAdobeCqAccountApiAccountManagementServiceProperties`(`cq.accountmanager.token.validity.period`, `cq.accountmanager.config.requestnewaccount.mail`, `cq.accountmanager.config.requestnewpwd.mail`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAccountApiAccountManagementServiceProperties`
--
UPDATE `comAdobeCqAccountApiAccountManagementServiceProperties` SET `cq.accountmanager.token.validity.period` = ?, `cq.accountmanager.config.requestnewaccount.mail` = ?, `cq.accountmanager.config.requestnewpwd.mail` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAccountApiAccountManagementServiceProperties`
--
DELETE FROM `comAdobeCqAccountApiAccountManagementServiceProperties` WHERE 0;

