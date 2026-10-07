--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr`
--
SELECT `provider.name`, `host.name`, `host.port`, `host.ssl`, `host.tls`, `host.noCertCheck`, `bind.dn`, `bind.password`, `searchTimeout`, `adminPool.maxActive`, `adminPool.lookupOnValidate`, `userPool.maxActive`, `userPool.lookupOnValidate`, `user.baseDN`, `user.objectclass`, `user.idAttribute`, `user.extraFilter`, `user.makeDnPath`, `group.baseDN`, `group.objectclass`, `group.nameAttribute`, `group.extraFilter`, `group.makeDnPath`, `group.memberAttribute`, `useUidForExtId`, `customattributes` FROM `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr`
--
INSERT INTO `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr`(`provider.name`, `host.name`, `host.port`, `host.ssl`, `host.tls`, `host.noCertCheck`, `bind.dn`, `bind.password`, `searchTimeout`, `adminPool.maxActive`, `adminPool.lookupOnValidate`, `userPool.maxActive`, `userPool.lookupOnValidate`, `user.baseDN`, `user.objectclass`, `user.idAttribute`, `user.extraFilter`, `user.makeDnPath`, `group.baseDN`, `group.objectclass`, `group.nameAttribute`, `group.extraFilter`, `group.makeDnPath`, `group.memberAttribute`, `useUidForExtId`, `customattributes`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr`
--
UPDATE `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr` SET `provider.name` = ?, `host.name` = ?, `host.port` = ?, `host.ssl` = ?, `host.tls` = ?, `host.noCertCheck` = ?, `bind.dn` = ?, `bind.password` = ?, `searchTimeout` = ?, `adminPool.maxActive` = ?, `adminPool.lookupOnValidate` = ?, `userPool.maxActive` = ?, `userPool.lookupOnValidate` = ?, `user.baseDN` = ?, `user.objectclass` = ?, `user.idAttribute` = ?, `user.extraFilter` = ?, `user.makeDnPath` = ?, `group.baseDN` = ?, `group.objectclass` = ?, `group.nameAttribute` = ?, `group.extraFilter` = ?, `group.makeDnPath` = ?, `group.memberAttribute` = ?, `useUidForExtId` = ?, `customattributes` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr`
--
DELETE FROM `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPr` WHERE 0;

