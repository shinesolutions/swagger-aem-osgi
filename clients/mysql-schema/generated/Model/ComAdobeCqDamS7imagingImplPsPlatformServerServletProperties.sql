--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDamS7imagingImplPsPlatformServerServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties`
--
SELECT `cache.enable`, `cache.rootPaths`, `cache.maxSize`, `cache.maxEntries` FROM `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties`
--
INSERT INTO `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties`(`cache.enable`, `cache.rootPaths`, `cache.maxSize`, `cache.maxEntries`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties`
--
UPDATE `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties` SET `cache.enable` = ?, `cache.rootPaths` = ?, `cache.maxSize` = ?, `cache.maxEntries` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties`
--
DELETE FROM `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties` WHERE 0;

