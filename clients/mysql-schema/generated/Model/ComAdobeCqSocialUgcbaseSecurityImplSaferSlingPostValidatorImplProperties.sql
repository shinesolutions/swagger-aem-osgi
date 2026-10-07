--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr`
--
SELECT `parameter.whitelist`, `parameter.whitelist.prefixes`, `binary.parameter.whitelist`, `modifier.whitelist`, `operation.whitelist`, `operation.whitelist.prefixes`, `typehint.whitelist`, `resourcetype.whitelist` FROM `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr` WHERE 1;

--
-- INSERT template for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr`
--
INSERT INTO `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr`(`parameter.whitelist`, `parameter.whitelist.prefixes`, `binary.parameter.whitelist`, `modifier.whitelist`, `operation.whitelist`, `operation.whitelist.prefixes`, `typehint.whitelist`, `resourcetype.whitelist`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr`
--
UPDATE `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr` SET `parameter.whitelist` = ?, `parameter.whitelist.prefixes` = ?, `binary.parameter.whitelist` = ?, `modifier.whitelist` = ?, `operation.whitelist` = ?, `operation.whitelist.prefixes` = ?, `typehint.whitelist` = ?, `resourcetype.whitelist` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr`
--
DELETE FROM `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPr` WHERE 0;

