--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties`
--
SELECT `cq.dam.webdav.version.linking.enable`, `cq.dam.webdav.version.linking.scheduler.period`, `cq.dam.webdav.version.linking.staging.timeout` FROM `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties`
--
INSERT INTO `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties`(`cq.dam.webdav.version.linking.enable`, `cq.dam.webdav.version.linking.scheduler.period`, `cq.dam.webdav.version.linking.staging.timeout`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties`
--
UPDATE `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties` SET `cq.dam.webdav.version.linking.enable` = ?, `cq.dam.webdav.version.linking.scheduler.period` = ?, `cq.dam.webdav.version.linking.staging.timeout` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties`
--
DELETE FROM `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties` WHERE 0;

