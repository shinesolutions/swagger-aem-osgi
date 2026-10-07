--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetVideoHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetVideoHandlerProperties`
--
SELECT `cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name` FROM `comAdobeCqCommerceImplAssetVideoHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetVideoHandlerProperties`
--
INSERT INTO `comAdobeCqCommerceImplAssetVideoHandlerProperties`(`cq.commerce.asset.handler.active`, `cq.commerce.asset.handler.name`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetVideoHandlerProperties`
--
UPDATE `comAdobeCqCommerceImplAssetVideoHandlerProperties` SET `cq.commerce.asset.handler.active` = ?, `cq.commerce.asset.handler.name` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetVideoHandlerProperties`
--
DELETE FROM `comAdobeCqCommerceImplAssetVideoHandlerProperties` WHERE 0;

