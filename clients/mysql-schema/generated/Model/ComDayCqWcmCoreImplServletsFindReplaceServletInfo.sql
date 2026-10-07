--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsFindReplaceServletInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplServletsFindReplaceServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmCoreImplServletsFindReplaceServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplServletsFindReplaceServletInfo`
--
INSERT INTO `comDayCqWcmCoreImplServletsFindReplaceServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplServletsFindReplaceServletInfo`
--
UPDATE `comDayCqWcmCoreImplServletsFindReplaceServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplServletsFindReplaceServletInfo`
--
DELETE FROM `comDayCqWcmCoreImplServletsFindReplaceServletInfo` WHERE 0;

