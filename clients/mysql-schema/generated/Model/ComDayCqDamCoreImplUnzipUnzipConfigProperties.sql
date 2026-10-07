--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplUnzipUnzipConfigProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplUnzipUnzipConfigProperties`
--
SELECT `cq.dam.config.unzip.maxuncompressedsize`, `cq.dam.config.unzip.encoding` FROM `comDayCqDamCoreImplUnzipUnzipConfigProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplUnzipUnzipConfigProperties`
--
INSERT INTO `comDayCqDamCoreImplUnzipUnzipConfigProperties`(`cq.dam.config.unzip.maxuncompressedsize`, `cq.dam.config.unzip.encoding`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplUnzipUnzipConfigProperties`
--
UPDATE `comDayCqDamCoreImplUnzipUnzipConfigProperties` SET `cq.dam.config.unzip.maxuncompressedsize` = ?, `cq.dam.config.unzip.encoding` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplUnzipUnzipConfigProperties`
--
DELETE FROM `comDayCqDamCoreImplUnzipUnzipConfigProperties` WHERE 0;

