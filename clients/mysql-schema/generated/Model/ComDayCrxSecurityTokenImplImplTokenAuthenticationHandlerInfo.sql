--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo' definition.
--


--
-- SELECT template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo` WHERE 1;

--
-- INSERT template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo`
--
INSERT INTO `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo`
--
UPDATE `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo`
--
DELETE FROM `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo` WHERE 0;

