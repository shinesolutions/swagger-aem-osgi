--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
SELECT `requiredServicePids`, `authorizationCompositionType` FROM `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
INSERT INTO `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`(`requiredServicePids`, `authorizationCompositionType`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
UPDATE `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` SET `requiredServicePids` = ?, `authorizationCompositionType` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
DELETE FROM `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` WHERE 0;

