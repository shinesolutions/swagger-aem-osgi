--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsLogLogManagerProperties`
--
SELECT `org.apache.sling.commons.log.level`, `org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.file.number`, `org.apache.sling.commons.log.file.size`, `org.apache.sling.commons.log.pattern`, `org.apache.sling.commons.log.configurationFile`, `org.apache.sling.commons.log.packagingDataEnabled`, `org.apache.sling.commons.log.maxCallerDataDepth`, `org.apache.sling.commons.log.maxOldFileCountInDump`, `org.apache.sling.commons.log.numOfLines` FROM `orgApacheSlingCommonsLogLogManagerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsLogLogManagerProperties`
--
INSERT INTO `orgApacheSlingCommonsLogLogManagerProperties`(`org.apache.sling.commons.log.level`, `org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.file.number`, `org.apache.sling.commons.log.file.size`, `org.apache.sling.commons.log.pattern`, `org.apache.sling.commons.log.configurationFile`, `org.apache.sling.commons.log.packagingDataEnabled`, `org.apache.sling.commons.log.maxCallerDataDepth`, `org.apache.sling.commons.log.maxOldFileCountInDump`, `org.apache.sling.commons.log.numOfLines`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsLogLogManagerProperties`
--
UPDATE `orgApacheSlingCommonsLogLogManagerProperties` SET `org.apache.sling.commons.log.level` = ?, `org.apache.sling.commons.log.file` = ?, `org.apache.sling.commons.log.file.number` = ?, `org.apache.sling.commons.log.file.size` = ?, `org.apache.sling.commons.log.pattern` = ?, `org.apache.sling.commons.log.configurationFile` = ?, `org.apache.sling.commons.log.packagingDataEnabled` = ?, `org.apache.sling.commons.log.maxCallerDataDepth` = ?, `org.apache.sling.commons.log.maxOldFileCountInDump` = ?, `org.apache.sling.commons.log.numOfLines` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsLogLogManagerProperties`
--
DELETE FROM `orgApacheSlingCommonsLogLogManagerProperties` WHERE 0;

