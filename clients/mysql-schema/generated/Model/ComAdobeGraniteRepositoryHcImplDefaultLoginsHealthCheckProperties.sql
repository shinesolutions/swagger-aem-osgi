--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie`
--
SELECT `hc.tags`, `account.logins`, `console.logins` FROM `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie`
--
INSERT INTO `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie`(`hc.tags`, `account.logins`, `console.logins`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie`
--
UPDATE `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie` SET `hc.tags` = ?, `account.logins` = ?, `console.logins` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie`
--
DELETE FROM `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertie` WHERE 0;

