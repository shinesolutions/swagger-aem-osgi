--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
SELECT `felix.inventory.printer.name`, `felix.inventory.printer.title`, `path` FROM `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
INSERT INTO `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`(`felix.inventory.printer.name`, `felix.inventory.printer.title`, `path`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
UPDATE `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` SET `felix.inventory.printer.name` = ?, `felix.inventory.printer.title` = ?, `path` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto`
--
DELETE FROM `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto` WHERE 0;

