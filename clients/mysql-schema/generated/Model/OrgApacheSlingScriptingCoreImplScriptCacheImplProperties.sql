--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingCoreImplScriptCacheImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingCoreImplScriptCacheImplProperties`
--
SELECT `org.apache.sling.scripting.cache.size`, `org.apache.sling.scripting.cache.additional_extensions` FROM `orgApacheSlingScriptingCoreImplScriptCacheImplProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingCoreImplScriptCacheImplProperties`
--
INSERT INTO `orgApacheSlingScriptingCoreImplScriptCacheImplProperties`(`org.apache.sling.scripting.cache.size`, `org.apache.sling.scripting.cache.additional_extensions`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingCoreImplScriptCacheImplProperties`
--
UPDATE `orgApacheSlingScriptingCoreImplScriptCacheImplProperties` SET `org.apache.sling.scripting.cache.size` = ?, `org.apache.sling.scripting.cache.additional_extensions` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingCoreImplScriptCacheImplProperties`
--
DELETE FROM `orgApacheSlingScriptingCoreImplScriptCacheImplProperties` WHERE 0;

