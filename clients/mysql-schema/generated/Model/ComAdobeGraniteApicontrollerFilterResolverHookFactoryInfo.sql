--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo`
--
INSERT INTO `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo`
--
UPDATE `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo`
--
DELETE FROM `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo` WHERE 0;

