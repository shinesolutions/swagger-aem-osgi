--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
INSERT INTO `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
UPDATE `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti`
--
DELETE FROM `orgApacheSlingCaconfigManagementImplConfigurationManagementSetti` WHERE 0;

