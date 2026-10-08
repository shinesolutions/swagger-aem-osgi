--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingTenantInternalTenantProviderImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingTenantInternalTenantProviderImplProperties`
--
SELECT `tenant.root`, `tenant.path.matcher` FROM `orgApacheSlingTenantInternalTenantProviderImplProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingTenantInternalTenantProviderImplProperties`
--
INSERT INTO `orgApacheSlingTenantInternalTenantProviderImplProperties`(`tenant.root`, `tenant.path.matcher`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingTenantInternalTenantProviderImplProperties`
--
UPDATE `orgApacheSlingTenantInternalTenantProviderImplProperties` SET `tenant.root` = ?, `tenant.path.matcher` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingTenantInternalTenantProviderImplProperties`
--
DELETE FROM `orgApacheSlingTenantInternalTenantProviderImplProperties` WHERE 0;

