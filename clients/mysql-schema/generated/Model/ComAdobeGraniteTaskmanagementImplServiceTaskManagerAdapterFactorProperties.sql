--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
SELECT `adapter.condition`, `taskmanager.admingroups` FROM `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`(`adapter.condition`, `taskmanager.admingroups`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
UPDATE `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` SET `adapter.condition` = ?, `taskmanager.admingroups` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` WHERE 0;

