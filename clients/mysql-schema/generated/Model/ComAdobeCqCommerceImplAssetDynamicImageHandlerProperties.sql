--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetDynamicImageHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties`
--
SELECT `cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name` FROM `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties`
--
INSERT INTO `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties`(`cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties`
--
UPDATE `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties` SET `cq.commerce.asset.handler.active` = ?, `cq.commerce.asset.handler.name` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties`
--
DELETE FROM `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties` WHERE 0;

