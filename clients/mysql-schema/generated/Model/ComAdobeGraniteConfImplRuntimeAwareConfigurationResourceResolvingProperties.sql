--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
SELECT `enabled`, `fallbackPaths` FROM `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
INSERT INTO `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`(`enabled`, `fallbackPaths`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
UPDATE `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` SET `enabled` = ?, `fallbackPaths` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
DELETE FROM `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` WHERE 0;

