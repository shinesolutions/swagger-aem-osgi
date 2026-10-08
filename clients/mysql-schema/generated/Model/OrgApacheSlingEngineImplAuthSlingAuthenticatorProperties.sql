--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplAuthSlingAuthenticatorProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties`
--
SELECT `osgi.http.whiteboard.context.select`, `osgi.http.whiteboard.listener`, `auth.sudo.cookie`, `auth.sudo.parameter`, `auth.annonymous`, `sling.auth.requirements`, `sling.auth.anonymous.user`, `sling.auth.anonymous.password`, `auth.http`, `auth.http.realm`, `auth.uri.suffix` FROM `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties`
--
INSERT INTO `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties`(`osgi.http.whiteboard.context.select`, `osgi.http.whiteboard.listener`, `auth.sudo.cookie`, `auth.sudo.parameter`, `auth.annonymous`, `sling.auth.requirements`, `sling.auth.anonymous.user`, `sling.auth.anonymous.password`, `auth.http`, `auth.http.realm`, `auth.uri.suffix`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties`
--
UPDATE `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties` SET `osgi.http.whiteboard.context.select` = ?, `osgi.http.whiteboard.listener` = ?, `auth.sudo.cookie` = ?, `auth.sudo.parameter` = ?, `auth.annonymous` = ?, `sling.auth.requirements` = ?, `sling.auth.anonymous.user` = ?, `sling.auth.anonymous.password` = ?, `auth.http` = ?, `auth.http.realm` = ?, `auth.uri.suffix` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties`
--
DELETE FROM `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties` WHERE 0;

