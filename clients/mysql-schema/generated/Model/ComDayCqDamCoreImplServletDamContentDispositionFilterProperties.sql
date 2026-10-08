--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletDamContentDispositionFilterProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletDamContentDispositionFilterProperties`
--
SELECT `cq.mime.type.blacklist`, `cq.dam.empty.mime` FROM `comDayCqDamCoreImplServletDamContentDispositionFilterProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletDamContentDispositionFilterProperties`
--
INSERT INTO `comDayCqDamCoreImplServletDamContentDispositionFilterProperties`(`cq.mime.type.blacklist`, `cq.dam.empty.mime`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletDamContentDispositionFilterProperties`
--
UPDATE `comDayCqDamCoreImplServletDamContentDispositionFilterProperties` SET `cq.mime.type.blacklist` = ?, `cq.dam.empty.mime` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletDamContentDispositionFilterProperties`
--
DELETE FROM `comDayCqDamCoreImplServletDamContentDispositionFilterProperties` WHERE 0;

