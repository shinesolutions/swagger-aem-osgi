--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplRenditionMakerImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplRenditionMakerImplProperties`
--
SELECT `xmp.propagate`, `xmp.excludes` FROM `comDayCqDamCoreImplRenditionMakerImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplRenditionMakerImplProperties`
--
INSERT INTO `comDayCqDamCoreImplRenditionMakerImplProperties`(`xmp.propagate`, `xmp.excludes`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplRenditionMakerImplProperties`
--
UPDATE `comDayCqDamCoreImplRenditionMakerImplProperties` SET `xmp.propagate` = ?, `xmp.excludes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplRenditionMakerImplProperties`
--
DELETE FROM `comDayCqDamCoreImplRenditionMakerImplProperties` WHERE 0;

