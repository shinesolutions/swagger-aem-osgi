--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo`
--
INSERT INTO `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo`
--
UPDATE `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo`
--
DELETE FROM `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo` WHERE 0;

