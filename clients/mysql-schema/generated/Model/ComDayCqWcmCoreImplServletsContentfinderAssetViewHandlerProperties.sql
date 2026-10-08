--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti`
--
SELECT `dam.showexpired`, `dam.showhidden`, `tagTitleSearch`, `guessTotal`, `dam.expiryProperty` FROM `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti`
--
INSERT INTO `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti`(`dam.showexpired`, `dam.showhidden`, `tagTitleSearch`, `guessTotal`, `dam.expiryProperty`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti`
--
UPDATE `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti` SET `dam.showexpired` = ?, `dam.showhidden` = ?, `tagTitleSearch` = ?, `guessTotal` = ?, `dam.expiryProperty` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti`
--
DELETE FROM `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperti` WHERE 0;

