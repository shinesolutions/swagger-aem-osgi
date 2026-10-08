--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
UPDATE `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor` WHERE 0;

