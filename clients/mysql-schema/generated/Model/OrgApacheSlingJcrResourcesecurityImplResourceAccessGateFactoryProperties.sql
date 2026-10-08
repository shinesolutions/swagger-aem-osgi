--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr`
--
SELECT `path`, `checkpath.prefix`, `jcrPath` FROM `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr`
--
INSERT INTO `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr`(`path`, `checkpath.prefix`, `jcrPath`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr`
--
UPDATE `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr` SET `path` = ?, `checkpath.prefix` = ?, `jcrPath` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr`
--
DELETE FROM `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPr` WHERE 0;

