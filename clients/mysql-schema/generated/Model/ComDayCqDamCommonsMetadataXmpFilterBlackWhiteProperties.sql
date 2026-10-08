--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties`
--
SELECT `xmp.filter.apply_whitelist`, `xmp.filter.whitelist`, `xmp.filter.apply_blacklist`, `xmp.filter.blacklist` FROM `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties`
--
INSERT INTO `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties`(`xmp.filter.apply_whitelist`, `xmp.filter.whitelist`, `xmp.filter.apply_blacklist`, `xmp.filter.blacklist`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties`
--
UPDATE `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties` SET `xmp.filter.apply_whitelist` = ?, `xmp.filter.whitelist` = ?, `xmp.filter.apply_blacklist` = ?, `xmp.filter.blacklist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties`
--
DELETE FROM `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties` WHERE 0;

