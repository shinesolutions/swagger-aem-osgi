--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro`
--
SELECT `merge.root`, `merge.readOnly` FROM `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro`
--
INSERT INTO `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro`(`merge.root`, `merge.readOnly`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro`
--
UPDATE `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro` SET `merge.root` = ?, `merge.readOnly` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro`
--
DELETE FROM `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPro` WHERE 0;

