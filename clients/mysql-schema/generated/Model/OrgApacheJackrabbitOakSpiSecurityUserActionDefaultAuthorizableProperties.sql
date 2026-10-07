--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr`
--
SELECT `enabledActions`, `userPrivilegeNames`, `groupPrivilegeNames`, `constraint` FROM `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr`
--
INSERT INTO `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr`(`enabledActions`, `userPrivilegeNames`, `groupPrivilegeNames`, `constraint`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr`
--
UPDATE `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr` SET `enabledActions` = ?, `userPrivilegeNames` = ?, `groupPrivilegeNames` = ?, `constraint` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr`
--
DELETE FROM `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePr` WHERE 0;

