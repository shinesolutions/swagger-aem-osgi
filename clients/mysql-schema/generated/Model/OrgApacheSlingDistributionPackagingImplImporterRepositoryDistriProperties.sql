--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP`
--
SELECT `name`, `service.name`, `path`, `privilege.name` FROM `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP`(`name`, `service.name`, `path`, `privilege.name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP`
--
UPDATE `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP` SET `name` = ?, `service.name` = ?, `path` = ?, `privilege.name` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriP` WHERE 0;

