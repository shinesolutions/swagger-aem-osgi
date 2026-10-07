--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoAssetIOHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties`
--
SELECT `service.ranking`, `pathPrefix`, `createVersion` FROM `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties`
--
INSERT INTO `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties`(`service.ranking`, `pathPrefix`, `createVersion`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties`
--
UPDATE `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties` SET `service.ranking` = ?, `pathPrefix` = ?, `createVersion` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties`
--
DELETE FROM `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties` WHERE 0;

