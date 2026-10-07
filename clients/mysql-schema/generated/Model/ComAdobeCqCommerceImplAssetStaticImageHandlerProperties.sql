--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetStaticImageHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetStaticImageHandlerProperties`
--
SELECT `cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name` FROM `comAdobeCqCommerceImplAssetStaticImageHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetStaticImageHandlerProperties`
--
INSERT INTO `comAdobeCqCommerceImplAssetStaticImageHandlerProperties`(`cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetStaticImageHandlerProperties`
--
UPDATE `comAdobeCqCommerceImplAssetStaticImageHandlerProperties` SET `cq.commerce.asset.handler.active` = ?, `cq.commerce.asset.handler.name` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetStaticImageHandlerProperties`
--
DELETE FROM `comAdobeCqCommerceImplAssetStaticImageHandlerProperties` WHERE 0;

