--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsResolverSlingServletResolverProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsResolverSlingServletResolverProperties`
--
SELECT `servletresolver.servletRoot`, `servletresolver.cacheSize`, `servletresolver.paths`, `servletresolver.defaultExtensions` FROM `orgApacheSlingServletsResolverSlingServletResolverProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsResolverSlingServletResolverProperties`
--
INSERT INTO `orgApacheSlingServletsResolverSlingServletResolverProperties`(`servletresolver.servletRoot`, `servletresolver.cacheSize`, `servletresolver.paths`, `servletresolver.defaultExtensions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsResolverSlingServletResolverProperties`
--
UPDATE `orgApacheSlingServletsResolverSlingServletResolverProperties` SET `servletresolver.servletRoot` = ?, `servletresolver.cacheSize` = ?, `servletresolver.paths` = ?, `servletresolver.defaultExtensions` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsResolverSlingServletResolverProperties`
--
DELETE FROM `orgApacheSlingServletsResolverSlingServletResolverProperties` WHERE 0;

