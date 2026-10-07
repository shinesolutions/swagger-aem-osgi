--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo' definition.
--


--
-- SELECT template for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf` WHERE 1;

--
-- INSERT template for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf`
--
INSERT INTO `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf`
--
UPDATE `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf`
--
DELETE FROM `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInf` WHERE 0;

