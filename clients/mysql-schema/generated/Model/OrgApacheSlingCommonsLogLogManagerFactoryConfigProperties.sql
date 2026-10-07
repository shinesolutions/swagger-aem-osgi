--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryConfigProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties`
--
SELECT `org.apache.sling.commons.log.level`, `org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.pattern`, `org.apache.sling.commons.log.names`, `org.apache.sling.commons.log.additiv` FROM `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties`
--
INSERT INTO `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties`(`org.apache.sling.commons.log.level`, `org.apache.sling.commons.log.file`, `org.apache.sling.commons.log.pattern`, `org.apache.sling.commons.log.names`, `org.apache.sling.commons.log.additiv`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties`
--
UPDATE `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties` SET `org.apache.sling.commons.log.level` = ?, `org.apache.sling.commons.log.file` = ?, `org.apache.sling.commons.log.pattern` = ?, `org.apache.sling.commons.log.names` = ?, `org.apache.sling.commons.log.additiv` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties`
--
DELETE FROM `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties` WHERE 0;

