--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheHttpProxyconfiguratorInfo' definition.
--


--
-- SELECT template for table `orgApacheHttpProxyconfiguratorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheHttpProxyconfiguratorInfo` WHERE 1;

--
-- INSERT template for table `orgApacheHttpProxyconfiguratorInfo`
--
INSERT INTO `orgApacheHttpProxyconfiguratorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheHttpProxyconfiguratorInfo`
--
UPDATE `orgApacheHttpProxyconfiguratorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheHttpProxyconfiguratorInfo`
--
DELETE FROM `orgApacheHttpProxyconfiguratorInfo` WHERE 0;

