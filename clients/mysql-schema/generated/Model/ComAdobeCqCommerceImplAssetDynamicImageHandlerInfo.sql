--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetDynamicImageHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo`
--
INSERT INTO `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo`
--
UPDATE `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo`
--
DELETE FROM `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo` WHERE 0;

