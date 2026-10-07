--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoAssetIOHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo`
--
INSERT INTO `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo`
--
UPDATE `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo`
--
DELETE FROM `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo` WHERE 0;

