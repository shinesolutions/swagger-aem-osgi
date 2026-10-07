--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr`
--
SELECT `solr.http.url`, `solr.zk.host`, `solr.collection`, `solr.socket.timeout`, `solr.connection.timeout`, `solr.shards.no`, `solr.replication.factor`, `solr.conf.dir` FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr`(`solr.http.url`, `solr.zk.host`, `solr.collection`, `solr.socket.timeout`, `solr.connection.timeout`, `solr.shards.no`, `solr.replication.factor`, `solr.conf.dir`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr` SET `solr.http.url` = ?, `solr.zk.host` = ?, `solr.collection` = ?, `solr.socket.timeout` = ?, `solr.connection.timeout` = ?, `solr.shards.no` = ?, `solr.replication.factor` = ?, `solr.conf.dir` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPr` WHERE 0;

