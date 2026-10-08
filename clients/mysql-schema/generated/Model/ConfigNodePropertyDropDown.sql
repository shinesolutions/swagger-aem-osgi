--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyDropDown' definition.
--


--
-- SELECT template for table `configNodePropertyDropDown`
--
SELECT `name`, `optional`, `is_set`, `type`, `value`, `description` FROM `configNodePropertyDropDown` WHERE 1;

--
-- INSERT template for table `configNodePropertyDropDown`
--
INSERT INTO `configNodePropertyDropDown`(`name`, `optional`, `is_set`, `type`, `value`, `description`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `configNodePropertyDropDown`
--
UPDATE `configNodePropertyDropDown` SET `name` = ?, `optional` = ?, `is_set` = ?, `type` = ?, `value` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyDropDown`
--
DELETE FROM `configNodePropertyDropDown` WHERE 0;

