--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo`
--
INSERT INTO `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo`
--
UPDATE `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo`
--
DELETE FROM `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo` WHERE 0;

