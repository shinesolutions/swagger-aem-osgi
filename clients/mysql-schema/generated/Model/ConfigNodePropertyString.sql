--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyString' definition.
--


--
-- SELECT template for table `configNodePropertyString`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `configNodePropertyString` WHERE 1;

--
-- INSERT template for table `configNodePropertyString`
--
INSERT INTO `configNodePropertyString`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyString`
--
UPDATE `configNodePropertyString` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyString`
--
DELETE FROM `configNodePropertyString` WHERE 0;

