--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr`
--
SELECT `solr.home.path`, `solr.core.name` FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr`(`solr.home.path`, `solr.core.name`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr` SET `solr.home.path` = ?, `solr.core.name` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPr` WHERE 0;

