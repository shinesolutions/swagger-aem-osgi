--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf`
--
INSERT INTO `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf`
--
UPDATE `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf`
--
DELETE FROM `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInf` WHERE 0;

