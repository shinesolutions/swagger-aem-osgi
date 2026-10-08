--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqCommerceImplAssetVideoHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqCommerceImplAssetVideoHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqCommerceImplAssetVideoHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqCommerceImplAssetVideoHandlerInfo`
--
INSERT INTO `comAdobeCqCommerceImplAssetVideoHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqCommerceImplAssetVideoHandlerInfo`
--
UPDATE `comAdobeCqCommerceImplAssetVideoHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqCommerceImplAssetVideoHandlerInfo`
--
DELETE FROM `comAdobeCqCommerceImplAssetVideoHandlerInfo` WHERE 0;

