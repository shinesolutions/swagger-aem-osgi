--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo`
--
INSERT INTO `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo`
--
UPDATE `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo`
--
DELETE FROM `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo` WHERE 0;

