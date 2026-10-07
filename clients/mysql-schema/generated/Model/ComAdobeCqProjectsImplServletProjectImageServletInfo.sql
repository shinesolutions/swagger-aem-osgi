--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqProjectsImplServletProjectImageServletInfo' definition.
--


--
-- SELECT template for table `comAdobeCqProjectsImplServletProjectImageServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeCqProjectsImplServletProjectImageServletInfo` WHERE 1;

--
-- INSERT template for table `comAdobeCqProjectsImplServletProjectImageServletInfo`
--
INSERT INTO `comAdobeCqProjectsImplServletProjectImageServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqProjectsImplServletProjectImageServletInfo`
--
UPDATE `comAdobeCqProjectsImplServletProjectImageServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqProjectsImplServletProjectImageServletInfo`
--
DELETE FROM `comAdobeCqProjectsImplServletProjectImageServletInfo` WHERE 0;

