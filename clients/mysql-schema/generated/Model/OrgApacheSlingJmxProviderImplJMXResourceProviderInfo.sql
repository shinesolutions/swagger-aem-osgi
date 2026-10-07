--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJmxProviderImplJMXResourceProviderInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingJmxProviderImplJMXResourceProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingJmxProviderImplJMXResourceProviderInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJmxProviderImplJMXResourceProviderInfo`
--
INSERT INTO `orgApacheSlingJmxProviderImplJMXResourceProviderInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJmxProviderImplJMXResourceProviderInfo`
--
UPDATE `orgApacheSlingJmxProviderImplJMXResourceProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJmxProviderImplJMXResourceProviderInfo`
--
DELETE FROM `orgApacheSlingJmxProviderImplJMXResourceProviderInfo` WHERE 0;

