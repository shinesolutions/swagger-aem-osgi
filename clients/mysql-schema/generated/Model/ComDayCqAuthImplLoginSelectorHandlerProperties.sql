--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAuthImplLoginSelectorHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqAuthImplLoginSelectorHandlerProperties`
--
SELECT `path`, `service.ranking`, `auth.loginselector.mappings`, `auth.loginselector.changepw.mappings`, `auth.loginselector.defaultloginpage`, `auth.loginselector.defaultchangepwpage`, `auth.loginselector.handle`, `auth.loginselector.handle.all.extensions` FROM `comDayCqAuthImplLoginSelectorHandlerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqAuthImplLoginSelectorHandlerProperties`
--
INSERT INTO `comDayCqAuthImplLoginSelectorHandlerProperties`(`path`, `service.ranking`, `auth.loginselector.mappings`, `auth.loginselector.changepw.mappings`, `auth.loginselector.defaultloginpage`, `auth.loginselector.defaultchangepwpage`, `auth.loginselector.handle`, `auth.loginselector.handle.all.extensions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAuthImplLoginSelectorHandlerProperties`
--
UPDATE `comDayCqAuthImplLoginSelectorHandlerProperties` SET `path` = ?, `service.ranking` = ?, `auth.loginselector.mappings` = ?, `auth.loginselector.changepw.mappings` = ?, `auth.loginselector.defaultloginpage` = ?, `auth.loginselector.defaultchangepwpage` = ?, `auth.loginselector.handle` = ?, `auth.loginselector.handle.all.extensions` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAuthImplLoginSelectorHandlerProperties`
--
DELETE FROM `comDayCqAuthImplLoginSelectorHandlerProperties` WHERE 0;

