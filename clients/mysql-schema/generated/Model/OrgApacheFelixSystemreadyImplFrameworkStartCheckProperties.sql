--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheFelixSystemreadyImplFrameworkStartCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties`
--
SELECT `timeout`, `target.start.level`, `target.start.level.prop.name`, `type` FROM `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties`
--
INSERT INTO `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties`(`timeout`, `target.start.level`, `target.start.level.prop.name`, `type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties`
--
UPDATE `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties` SET `timeout` = ?, `target.start.level` = ?, `target.start.level.prop.name` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties`
--
DELETE FROM `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties` WHERE 0;

