--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationImplHTTPAuthHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationImplHTTPAuthHandlerProperties`
--
SELECT `path`, `auth.http.nologin`, `auth.http.realm`, `auth.default.loginpage`, `auth.cred.form`, `auth.cred.utf8` FROM `comDayCqWcmFoundationImplHTTPAuthHandlerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationImplHTTPAuthHandlerProperties`
--
INSERT INTO `comDayCqWcmFoundationImplHTTPAuthHandlerProperties`(`path`, `auth.http.nologin`, `auth.http.realm`, `auth.default.loginpage`, `auth.cred.form`, `auth.cred.utf8`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationImplHTTPAuthHandlerProperties`
--
UPDATE `comDayCqWcmFoundationImplHTTPAuthHandlerProperties` SET `path` = ?, `auth.http.nologin` = ?, `auth.http.realm` = ?, `auth.default.loginpage` = ?, `auth.cred.form` = ?, `auth.cred.utf8` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationImplHTTPAuthHandlerProperties`
--
DELETE FROM `comDayCqWcmFoundationImplHTTPAuthHandlerProperties` WHERE 0;

