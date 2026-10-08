--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
INSERT INTO `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
UPDATE `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati`
--
DELETE FROM `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati` WHERE 0;

