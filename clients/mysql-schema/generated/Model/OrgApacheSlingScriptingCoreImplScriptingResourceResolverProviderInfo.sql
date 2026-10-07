--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider`
--
INSERT INTO `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider`
--
UPDATE `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider`
--
DELETE FROM `orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider` WHERE 0;

