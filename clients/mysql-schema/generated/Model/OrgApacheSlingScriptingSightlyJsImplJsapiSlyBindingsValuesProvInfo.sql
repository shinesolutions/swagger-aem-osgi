--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn` WHERE 1;

--
-- INSERT template for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn`
--
INSERT INTO `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn`
--
UPDATE `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn`
--
DELETE FROM `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvIn` WHERE 0;

