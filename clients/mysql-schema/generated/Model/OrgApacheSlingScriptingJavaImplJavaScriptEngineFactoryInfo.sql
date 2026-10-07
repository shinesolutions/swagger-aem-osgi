--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo`
--
INSERT INTO `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo`
--
UPDATE `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo`
--
DELETE FROM `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo` WHERE 0;

