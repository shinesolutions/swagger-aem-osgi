--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyArray' definition.
--


--
-- SELECT template for table `configNodePropertyArray`
--
SELECT `name`, `optional`, `is_set`, `type`, `values`, `description` FROM `configNodePropertyArray` WHERE 1;

--
-- INSERT template for table `configNodePropertyArray`
--
INSERT INTO `configNodePropertyArray`(`name`, `optional`, `is_set`, `type`, `values`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyArray`
--
UPDATE `configNodePropertyArray` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `values` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyArray`
--
DELETE FROM `configNodePropertyArray` WHERE 0;

