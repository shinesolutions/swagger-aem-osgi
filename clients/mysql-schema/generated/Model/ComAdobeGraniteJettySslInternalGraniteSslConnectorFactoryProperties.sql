--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert`
--
SELECT `com.adobe.granite.jetty.ssl.port`, `com.adobe.granite.jetty.ssl.keystore.user`, `com.adobe.granite.jetty.ssl.keystore.password`, `com.adobe.granite.jetty.ssl.ciphersuites.excluded`, `com.adobe.granite.jetty.ssl.ciphersuites.included`, `com.adobe.granite.jetty.ssl.client.certificate` FROM `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert`
--
INSERT INTO `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert`(`com.adobe.granite.jetty.ssl.port`, `com.adobe.granite.jetty.ssl.keystore.user`, `com.adobe.granite.jetty.ssl.keystore.password`, `com.adobe.granite.jetty.ssl.ciphersuites.excluded`, `com.adobe.granite.jetty.ssl.ciphersuites.included`, `com.adobe.granite.jetty.ssl.client.certificate`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert`
--
UPDATE `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert` SET `com.adobe.granite.jetty.ssl.port` = ?, `com.adobe.granite.jetty.ssl.keystore.user` = ?, `com.adobe.granite.jetty.ssl.keystore.password` = ?, `com.adobe.granite.jetty.ssl.ciphersuites.excluded` = ?, `com.adobe.granite.jetty.ssl.ciphersuites.included` = ?, `com.adobe.granite.jetty.ssl.client.certificate` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert`
--
DELETE FROM `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropert` WHERE 0;

