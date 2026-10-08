--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMsmImplServletsAuditLogServletProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMsmImplServletsAuditLogServletProperties`
--
SELECT `auditlogservlet.default.events.count`, `auditlogservlet.default.path` FROM `comDayCqWcmMsmImplServletsAuditLogServletProperties` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMsmImplServletsAuditLogServletProperties`
--
INSERT INTO `comDayCqWcmMsmImplServletsAuditLogServletProperties`(`auditlogservlet.default.events.count`, `auditlogservlet.default.path`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmMsmImplServletsAuditLogServletProperties`
--
UPDATE `comDayCqWcmMsmImplServletsAuditLogServletProperties` SET `auditlogservlet.default.events.count` = ?, `auditlogservlet.default.path` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMsmImplServletsAuditLogServletProperties`
--
DELETE FROM `comDayCqWcmMsmImplServletsAuditLogServletProperties` WHERE 0;

