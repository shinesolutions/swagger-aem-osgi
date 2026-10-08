--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo`
--
INSERT INTO `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo`
--
UPDATE `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo`
--
DELETE FROM `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo` WHERE 0;

