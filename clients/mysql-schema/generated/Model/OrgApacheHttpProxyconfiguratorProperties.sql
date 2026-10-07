--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheHttpProxyconfiguratorProperties' definition.
--


--
-- SELECT template for table `orgApacheHttpProxyconfiguratorProperties`
--
SELECT `proxy.enabled`, `proxy.host`, `proxy.port`, `proxy.user`, `proxy.password`, `proxy.exceptions` FROM `orgApacheHttpProxyconfiguratorProperties` WHERE 1;

--
-- INSERT template for table `orgApacheHttpProxyconfiguratorProperties`
--
INSERT INTO `orgApacheHttpProxyconfiguratorProperties`(`proxy.enabled`, `proxy.host`, `proxy.port`, `proxy.user`, `proxy.password`, `proxy.exceptions`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheHttpProxyconfiguratorProperties`
--
UPDATE `orgApacheHttpProxyconfiguratorProperties` SET `proxy.enabled` = ?, `proxy.host` = ?, `proxy.port` = ?, `proxy.user` = ?, `proxy.password` = ?, `proxy.exceptions` = ? WHERE 1;

--
-- DELETE template for table `orgApacheHttpProxyconfiguratorProperties`
--
DELETE FROM `orgApacheHttpProxyconfiguratorProperties` WHERE 0;

