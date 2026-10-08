--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'configNodePropertyDropDown_type' definition.
--


--
-- SELECT template for table `configNodePropertyDropDown_type`
--
SELECT `labels`, `values` FROM `configNodePropertyDropDown_type` WHERE 1;

--
-- INSERT template for table `configNodePropertyDropDown_type`
--
INSERT INTO `configNodePropertyDropDown_type`(`labels`, `values`) VALUES (?, ?);

--
-- UPDATE template for table `configNodePropertyDropDown_type`
--
UPDATE `configNodePropertyDropDown_type` SET `labels` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `configNodePropertyDropDown_type`
--
DELETE FROM `configNodePropertyDropDown_type` WHERE 0;

