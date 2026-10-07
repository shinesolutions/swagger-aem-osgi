--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp`
--
SELECT `parameter.whitelist`, `parameter.whitelist.prefixes`, `binary.parameter.whitelist`, `modifier.whitelist`, `operation.whitelist`, `operation.whitelist.prefixes`, `typehint.whitelist`, `resourcetype.whitelist` FROM `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp` WHERE 1;

--
-- INSERT template for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp`
--
INSERT INTO `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp`(`parameter.whitelist`, `parameter.whitelist.prefixes`, `binary.parameter.whitelist`, `modifier.whitelist`, `operation.whitelist`, `operation.whitelist.prefixes`, `typehint.whitelist`, `resourcetype.whitelist`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp`
--
UPDATE `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp` SET `parameter.whitelist` = ?, `parameter.whitelist.prefixes` = ?, `binary.parameter.whitelist` = ?, `modifier.whitelist` = ?, `operation.whitelist` = ?, `operation.whitelist.prefixes` = ?, `typehint.whitelist` = ?, `resourcetype.whitelist` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp`
--
DELETE FROM `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProp` WHERE 0;

