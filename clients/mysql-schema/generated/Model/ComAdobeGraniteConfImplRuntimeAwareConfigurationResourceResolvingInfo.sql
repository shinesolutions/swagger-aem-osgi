--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
INSERT INTO `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
UPDATE `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin`
--
DELETE FROM `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvin` WHERE 0;

