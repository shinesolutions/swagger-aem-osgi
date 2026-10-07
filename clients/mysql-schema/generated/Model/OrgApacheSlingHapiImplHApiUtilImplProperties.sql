--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHapiImplHApiUtilImplProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingHapiImplHApiUtilImplProperties`
--
SELECT `org.apache.sling.hapi.tools.resourcetype`, `org.apache.sling.hapi.tools.collectionresourcetype`, `org.apache.sling.hapi.tools.searchpaths`, `org.apache.sling.hapi.tools.externalurl`, `org.apache.sling.hapi.tools.enabled` FROM `orgApacheSlingHapiImplHApiUtilImplProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHapiImplHApiUtilImplProperties`
--
INSERT INTO `orgApacheSlingHapiImplHApiUtilImplProperties`(`org.apache.sling.hapi.tools.resourcetype`, `org.apache.sling.hapi.tools.collectionresourcetype`, `org.apache.sling.hapi.tools.searchpaths`, `org.apache.sling.hapi.tools.externalurl`, `org.apache.sling.hapi.tools.enabled`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHapiImplHApiUtilImplProperties`
--
UPDATE `orgApacheSlingHapiImplHApiUtilImplProperties` SET `org.apache.sling.hapi.tools.resourcetype` = ?, `org.apache.sling.hapi.tools.collectionresourcetype` = ?, `org.apache.sling.hapi.tools.searchpaths` = ?, `org.apache.sling.hapi.tools.externalurl` = ?, `org.apache.sling.hapi.tools.enabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHapiImplHApiUtilImplProperties`
--
DELETE FROM `orgApacheSlingHapiImplHApiUtilImplProperties` WHERE 0;

