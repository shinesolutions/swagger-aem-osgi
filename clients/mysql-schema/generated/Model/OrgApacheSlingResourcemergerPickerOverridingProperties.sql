--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingResourcemergerPickerOverridingProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingResourcemergerPickerOverridingProperties`
--
SELECT `merge.root`, `merge.readOnly` FROM `orgApacheSlingResourcemergerPickerOverridingProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingResourcemergerPickerOverridingProperties`
--
INSERT INTO `orgApacheSlingResourcemergerPickerOverridingProperties`(`merge.root`, `merge.readOnly`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingResourcemergerPickerOverridingProperties`
--
UPDATE `orgApacheSlingResourcemergerPickerOverridingProperties` SET `merge.root` = ?, `merge.readOnly` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingResourcemergerPickerOverridingProperties`
--
DELETE FROM `orgApacheSlingResourcemergerPickerOverridingProperties` WHERE 0;

