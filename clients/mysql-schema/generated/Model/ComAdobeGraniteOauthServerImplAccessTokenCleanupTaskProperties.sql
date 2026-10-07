--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties`
--
SELECT `scheduler.expression` FROM `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties`
--
INSERT INTO `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties`(`scheduler.expression`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties`
--
UPDATE `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties` SET `scheduler.expression` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties`
--
DELETE FROM `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties` WHERE 0;

