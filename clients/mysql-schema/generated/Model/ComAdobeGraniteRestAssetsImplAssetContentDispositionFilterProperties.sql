--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper`
--
SELECT `mime.allowEmpty`, `mime.allowed` FROM `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper`
--
INSERT INTO `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper`(`mime.allowEmpty`, `mime.allowed`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper`
--
UPDATE `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper` SET `mime.allowEmpty` = ?, `mime.allowed` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper`
--
DELETE FROM `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProper` WHERE 0;

