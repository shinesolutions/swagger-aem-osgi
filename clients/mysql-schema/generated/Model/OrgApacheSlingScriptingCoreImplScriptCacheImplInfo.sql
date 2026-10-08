--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingCoreImplScriptCacheImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingCoreImplScriptCacheImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingScriptingCoreImplScriptCacheImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingCoreImplScriptCacheImplInfo`
--
INSERT INTO `orgApacheSlingScriptingCoreImplScriptCacheImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingCoreImplScriptCacheImplInfo`
--
UPDATE `orgApacheSlingScriptingCoreImplScriptCacheImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingCoreImplScriptCacheImplInfo`
--
DELETE FROM `orgApacheSlingScriptingCoreImplScriptCacheImplInfo` WHERE 0;

