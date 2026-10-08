--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryConfigInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo`
--
INSERT INTO `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo`
--
UPDATE `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo`
--
DELETE FROM `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo` WHERE 0;

