--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties' definition.
--


--
-- SELECT template for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro`
--
SELECT `hc.tags`, `dispatcher.address`, `dispatcher.filter.allowed`, `dispatcher.filter.blocked` FROM `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro` WHERE 1;

--
-- INSERT template for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro`
--
INSERT INTO `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro`(`hc.tags`, `dispatcher.address`, `dispatcher.filter.allowed`, `dispatcher.filter.blocked`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro`
--
UPDATE `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro` SET `hc.tags` = ?, `dispatcher.address` = ?, `dispatcher.filter.allowed` = ?, `dispatcher.filter.blocked` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro`
--
DELETE FROM `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPro` WHERE 0;

