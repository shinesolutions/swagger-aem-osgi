--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn`
--
INSERT INTO `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn`
--
UPDATE `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn`
--
DELETE FROM `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryIn` WHERE 0;

