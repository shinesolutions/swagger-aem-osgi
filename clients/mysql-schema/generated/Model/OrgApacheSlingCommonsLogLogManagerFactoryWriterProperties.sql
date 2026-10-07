--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryWriterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties`
--
SELECT `org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.file.number`, `org.apache.sling.commons.log.file.size`, `org.apache.sling.commons.log.file.buffered` FROM `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties`
--
INSERT INTO `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties`(`org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.file.number`, `org.apache.sling.commons.log.file.size`, `org.apache.sling.commons.log.file.buffered`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties`
--
UPDATE `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties` SET `org.apache.sling.commons.log.file` = ?, `org.apache.sling.commons.log.file.number` = ?, `org.apache.sling.commons.log.file.size` = ?, `org.apache.sling.commons.log.file.buffered` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties`
--
DELETE FROM `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties` WHERE 0;

