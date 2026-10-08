--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCommonsHttpclientProperties' definition.
--


--
-- SELECT template for table `comDayCommonsHttpclientProperties`
--
SELECT `proxy.enabled`, `proxy.host`, `proxy.user`, `proxy.password`, `proxy.ntlm.host`, `proxy.ntlm.domain`, `proxy.exceptions` FROM `comDayCommonsHttpclientProperties` WHERE 1;

--
-- INSERT template for table `comDayCommonsHttpclientProperties`
--
INSERT INTO `comDayCommonsHttpclientProperties`(`proxy.enabled`, `proxy.host`, `proxy.user`, `proxy.password`, `proxy.ntlm.host`, `proxy.ntlm.domain`, `proxy.exceptions`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCommonsHttpclientProperties`
--
UPDATE `comDayCommonsHttpclientProperties` SET `proxy.enabled` = ?, `proxy.host` = ?, `proxy.user` = ?, `proxy.password` = ?, `proxy.ntlm.host` = ?, `proxy.ntlm.domain` = ?, `proxy.exceptions` = ? WHERE 1;

--
-- DELETE template for table `comDayCommonsHttpclientProperties`
--
DELETE FROM `comDayCommonsHttpclientProperties` WHERE 0;

