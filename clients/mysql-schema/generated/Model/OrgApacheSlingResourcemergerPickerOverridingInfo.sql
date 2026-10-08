--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourcemergerPickerOverridingInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingResourcemergerPickerOverridingInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `orgApacheSlingResourcemergerPickerOverridingInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourcemergerPickerOverridingInfo`
--
INSERT INTO `orgApacheSlingResourcemergerPickerOverridingInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingResourcemergerPickerOverridingInfo`
--
UPDATE `orgApacheSlingResourcemergerPickerOverridingInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourcemergerPickerOverridingInfo`
--
DELETE FROM `orgApacheSlingResourcemergerPickerOverridingInfo` WHERE 0;

