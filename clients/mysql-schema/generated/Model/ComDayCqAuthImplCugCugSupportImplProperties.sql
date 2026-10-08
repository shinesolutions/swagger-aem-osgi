--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAuthImplCugCugSupportImplProperties' definition.
--


--
-- SELECT template for table `comDayCqAuthImplCugCugSupportImplProperties`
--
SELECT `cug.exempted.principals`, `cug.enabled`, `cug.principals.regex`, `cug.principals.replacement` FROM `comDayCqAuthImplCugCugSupportImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqAuthImplCugCugSupportImplProperties`
--
INSERT INTO `comDayCqAuthImplCugCugSupportImplProperties`(`cug.exempted.principals`, `cug.enabled`, `cug.principals.regex`, `cug.principals.replacement`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqAuthImplCugCugSupportImplProperties`
--
UPDATE `comDayCqAuthImplCugCugSupportImplProperties` SET `cug.exempted.principals` = ?, `cug.enabled` = ?, `cug.principals.regex` = ?, `cug.principals.replacement` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAuthImplCugCugSupportImplProperties`
--
DELETE FROM `comDayCqAuthImplCugCugSupportImplProperties` WHERE 0;

