--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti`
--
SELECT `hc.tags`, `webserver.address` FROM `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti` WHERE 1;

--
-- INSERT template for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti`
--
INSERT INTO `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti`(`hc.tags`, `webserver.address`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti`
--
UPDATE `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti` SET `hc.tags` = ?, `webserver.address` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti`
--
DELETE FROM `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperti` WHERE 0;

