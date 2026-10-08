--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqProjectsImplServletProjectImageServletProperties' definition.
--


--
-- SELECT template for table `comAdobeCqProjectsImplServletProjectImageServletProperties`
--
SELECT `image.quality`, `image.supported.resolutions` FROM `comAdobeCqProjectsImplServletProjectImageServletProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqProjectsImplServletProjectImageServletProperties`
--
INSERT INTO `comAdobeCqProjectsImplServletProjectImageServletProperties`(`image.quality`, `image.supported.resolutions`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeCqProjectsImplServletProjectImageServletProperties`
--
UPDATE `comAdobeCqProjectsImplServletProjectImageServletProperties` SET `image.quality` = ?, `image.supported.resolutions` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqProjectsImplServletProjectImageServletProperties`
--
DELETE FROM `comAdobeCqProjectsImplServletProjectImageServletProperties` WHERE 0;

