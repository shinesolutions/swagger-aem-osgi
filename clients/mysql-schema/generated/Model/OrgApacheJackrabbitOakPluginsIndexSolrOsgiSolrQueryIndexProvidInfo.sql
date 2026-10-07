--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidIn` WHERE 0;

