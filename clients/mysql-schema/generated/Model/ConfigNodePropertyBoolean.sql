--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyBoolean' definition.
--


--
-- SELECT template for table `configNodePropertyBoolean`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `configNodePropertyBoolean` WHERE 1;

--
-- INSERT template for table `configNodePropertyBoolean`
--
INSERT INTO `configNodePropertyBoolean`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyBoolean`
--
UPDATE `configNodePropertyBoolean` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyBoolean`
--
DELETE FROM `configNodePropertyBoolean` WHERE 0;

