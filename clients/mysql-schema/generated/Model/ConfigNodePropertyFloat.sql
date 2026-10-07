--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyFloat' definition.
--


--
-- SELECT template for table `configNodePropertyFloat`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `configNodePropertyFloat` WHERE 1;

--
-- INSERT template for table `configNodePropertyFloat`
--
INSERT INTO `configNodePropertyFloat`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyFloat`
--
UPDATE `configNodePropertyFloat` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyFloat`
--
DELETE FROM `configNodePropertyFloat` WHERE 0;

