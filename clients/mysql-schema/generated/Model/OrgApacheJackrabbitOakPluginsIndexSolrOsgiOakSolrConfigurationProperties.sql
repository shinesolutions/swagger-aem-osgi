--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr`
--
SELECT `path.desc.field`, `path.child.field`, `path.parent.field`, `path.exact.field`, `catch.all.field`, `collapsed.path.field`, `path.depth.field`, `commit.policy`, `rows`, `path.restrictions`, `property.restrictions`, `primarytypes.restrictions`, `ignored.properties`, `used.properties`, `type.mappings`, `property.mappings`, `collapse.jcrcontent.nodes` FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr`(`path.desc.field`, `path.child.field`, `path.parent.field`, `path.exact.field`, `catch.all.field`, `collapsed.path.field`, `path.depth.field`, `commit.policy`, `rows`, `path.restrictions`, `property.restrictions`, `primarytypes.restrictions`, `ignored.properties`, `used.properties`, `type.mappings`, `property.mappings`, `collapse.jcrcontent.nodes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr` SET `path.desc.field` = ?, `path.child.field` = ?, `path.parent.field` = ?, `path.exact.field` = ?, `catch.all.field` = ?, `collapsed.path.field` = ?, `path.depth.field` = ?, `commit.policy` = ?, `rows` = ?, `path.restrictions` = ?, `property.restrictions` = ?, `primarytypes.restrictions` = ?, `ignored.properties` = ?, `used.properties` = ?, `type.mappings` = ?, `property.mappings` = ?, `collapse.jcrcontent.nodes` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPr` WHERE 0;

