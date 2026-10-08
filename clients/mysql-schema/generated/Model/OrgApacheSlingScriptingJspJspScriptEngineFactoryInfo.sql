--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingJspJspScriptEngineFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo`
--
INSERT INTO `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo`
--
UPDATE `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo`
--
DELETE FROM `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo` WHERE 0;

