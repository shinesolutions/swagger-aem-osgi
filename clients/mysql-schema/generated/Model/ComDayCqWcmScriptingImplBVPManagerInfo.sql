--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmScriptingImplBVPManagerInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmScriptingImplBVPManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqWcmScriptingImplBVPManagerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmScriptingImplBVPManagerInfo`
--
INSERT INTO `comDayCqWcmScriptingImplBVPManagerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmScriptingImplBVPManagerInfo`
--
UPDATE `comDayCqWcmScriptingImplBVPManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmScriptingImplBVPManagerInfo`
--
DELETE FROM `comDayCqWcmScriptingImplBVPManagerInfo` WHERE 0;

