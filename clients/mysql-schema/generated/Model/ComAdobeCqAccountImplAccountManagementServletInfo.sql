--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqAccountImplAccountManagementServletInfo' definition.
--


--
-- SELECT template for table `comAdobeCqAccountImplAccountManagementServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqAccountImplAccountManagementServletInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqAccountImplAccountManagementServletInfo`
--
INSERT INTO `comAdobeCqAccountImplAccountManagementServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqAccountImplAccountManagementServletInfo`
--
UPDATE `comAdobeCqAccountImplAccountManagementServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqAccountImplAccountManagementServletInfo`
--
DELETE FROM `comAdobeCqAccountImplAccountManagementServletInfo` WHERE 0;

