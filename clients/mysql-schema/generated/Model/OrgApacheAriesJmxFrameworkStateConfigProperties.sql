--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheAriesJmxFrameworkStateConfigProperties' definition.
--


--
-- SELECT template for table `orgApacheAriesJmxFrameworkStateConfigProperties`
--
SELECT `attributeChangeNotificationEnabled` FROM `orgApacheAriesJmxFrameworkStateConfigProperties` WHERE 1;

--
-- INSERT template for table `orgApacheAriesJmxFrameworkStateConfigProperties`
--
INSERT INTO `orgApacheAriesJmxFrameworkStateConfigProperties`(`attributeChangeNotificationEnabled`) VALUES (?);

--
-- UPDATE template for table `orgApacheAriesJmxFrameworkStateConfigProperties`
--
UPDATE `orgApacheAriesJmxFrameworkStateConfigProperties` SET `attributeChangeNotificationEnabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheAriesJmxFrameworkStateConfigProperties`
--
DELETE FROM `orgApacheAriesJmxFrameworkStateConfigProperties` WHERE 0;

