--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheAriesJmxFrameworkStateConfigInfo' definition.
--


--
-- SELECT template for table `orgApacheAriesJmxFrameworkStateConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheAriesJmxFrameworkStateConfigInfo` WHERE 1;

--
-- INSERT template for table `orgApacheAriesJmxFrameworkStateConfigInfo`
--
INSERT INTO `orgApacheAriesJmxFrameworkStateConfigInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheAriesJmxFrameworkStateConfigInfo`
--
UPDATE `orgApacheAriesJmxFrameworkStateConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheAriesJmxFrameworkStateConfigInfo`
--
DELETE FROM `orgApacheAriesJmxFrameworkStateConfigInfo` WHERE 0;

