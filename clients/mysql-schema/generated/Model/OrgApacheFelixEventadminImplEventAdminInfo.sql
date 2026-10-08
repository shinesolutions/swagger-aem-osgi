--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixEventadminImplEventAdminInfo' definition.
--


--
-- SELECT template for table `orgApacheFelixEventadminImplEventAdminInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheFelixEventadminImplEventAdminInfo` WHERE 1;

--
-- INSERT template for table `orgApacheFelixEventadminImplEventAdminInfo`
--
INSERT INTO `orgApacheFelixEventadminImplEventAdminInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixEventadminImplEventAdminInfo`
--
UPDATE `orgApacheFelixEventadminImplEventAdminInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixEventadminImplEventAdminInfo`
--
DELETE FROM `orgApacheFelixEventadminImplEventAdminInfo` WHERE 0;

