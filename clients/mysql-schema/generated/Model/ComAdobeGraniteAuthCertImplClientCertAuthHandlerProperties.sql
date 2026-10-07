--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties`
--
SELECT `path`, `service.ranking` FROM `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties`
--
INSERT INTO `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties`(`path`, `service.ranking`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties`
--
UPDATE `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties` SET `path` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties`
--
DELETE FROM `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties` WHERE 0;

