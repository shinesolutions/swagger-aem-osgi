--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
INSERT INTO `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
UPDATE `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
DELETE FROM `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` WHERE 0;

