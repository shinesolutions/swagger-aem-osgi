--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyInteger' definition.
--


--
-- SELECT template for table `configNodePropertyInteger`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `configNodePropertyInteger` WHERE 1;

--
-- INSERT template for table `configNodePropertyInteger`
--
INSERT INTO `configNodePropertyInteger`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyInteger`
--
UPDATE `configNodePropertyInteger` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyInteger`
--
DELETE FROM `configNodePropertyInteger` WHERE 0;

