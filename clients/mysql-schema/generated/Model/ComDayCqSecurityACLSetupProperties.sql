--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqSecurityACLSetupProperties' definition.
--


--
-- SELECT template for table `comDayCqSecurityACLSetupProperties`
--
SELECT `cq.aclsetup.rules` FROM `comDayCqSecurityACLSetupProperties` WHERE 1;

--
-- INSERT template for table `comDayCqSecurityACLSetupProperties`
--
INSERT INTO `comDayCqSecurityACLSetupProperties`(`cq.aclsetup.rules`) VALUES (?);

--
-- UPDATE template for table `comDayCqSecurityACLSetupProperties`
--
UPDATE `comDayCqSecurityACLSetupProperties` SET `cq.aclsetup.rules` = ? WHERE 1;

--
-- DELETE template for table `comDayCqSecurityACLSetupProperties`
--
DELETE FROM `comDayCqSecurityACLSetupProperties` WHERE 0;

