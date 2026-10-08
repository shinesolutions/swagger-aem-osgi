--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetStaticImageHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetStaticImageHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCommerceImplAssetStaticImageHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetStaticImageHandlerInfo`
--
INSERT INTO `comAdobeCqCommerceImplAssetStaticImageHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetStaticImageHandlerInfo`
--
UPDATE `comAdobeCqCommerceImplAssetStaticImageHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetStaticImageHandlerInfo`
--
DELETE FROM `comAdobeCqCommerceImplAssetStaticImageHandlerInfo` WHERE 0;

