--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingTenantInternalTenantProviderImplInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingTenantInternalTenantProviderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingTenantInternalTenantProviderImplInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingTenantInternalTenantProviderImplInfo`
--
INSERT INTO `orgApacheSlingTenantInternalTenantProviderImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingTenantInternalTenantProviderImplInfo`
--
UPDATE `orgApacheSlingTenantInternalTenantProviderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingTenantInternalTenantProviderImplInfo`
--
DELETE FROM `orgApacheSlingTenantInternalTenantProviderImplInfo` WHERE 0;

