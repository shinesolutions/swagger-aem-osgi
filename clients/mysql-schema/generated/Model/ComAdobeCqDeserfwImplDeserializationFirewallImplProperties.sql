--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqDeserfwImplDeserializationFirewallImplProperties' definition.
--


--
-- SELECT template for table `comAdobeCqDeserfwImplDeserializationFirewallImplProperties`
--
SELECT `firewall.deserialization.whitelist`, `firewall.deserialization.blacklist`, `firewall.deserialization.diagnostics` FROM `comAdobeCqDeserfwImplDeserializationFirewallImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqDeserfwImplDeserializationFirewallImplProperties`
--
INSERT INTO `comAdobeCqDeserfwImplDeserializationFirewallImplProperties`(`firewall.deserialization.whitelist`, `firewall.deserialization.blacklist`, `firewall.deserialization.diagnostics`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeCqDeserfwImplDeserializationFirewallImplProperties`
--
UPDATE `comAdobeCqDeserfwImplDeserializationFirewallImplProperties` SET `firewall.deserialization.whitelist` = ?, `firewall.deserialization.blacklist` = ?, `firewall.deserialization.diagnostics` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqDeserfwImplDeserializationFirewallImplProperties`
--
DELETE FROM `comAdobeCqDeserfwImplDeserializationFirewallImplProperties` WHERE 0;

