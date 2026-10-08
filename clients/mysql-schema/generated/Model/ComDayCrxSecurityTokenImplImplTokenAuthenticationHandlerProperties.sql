--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties' definition.
--


--
-- SELECT template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti`
--
SELECT `path`, `token.required.attr`, `token.alternate.url`, `token.encapsulated`, `skip.token.refresh` FROM `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti` WHERE 1;

--
-- INSERT template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti`
--
INSERT INTO `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti`(`path`, `token.required.attr`, `token.alternate.url`, `token.encapsulated`, `skip.token.refresh`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti`
--
UPDATE `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti` SET `path` = ?, `token.required.attr` = ?, `token.alternate.url` = ?, `token.encapsulated` = ?, `skip.token.refresh` = ? WHERE 1;

--
-- DELETE template for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti`
--
DELETE FROM `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperti` WHERE 0;

