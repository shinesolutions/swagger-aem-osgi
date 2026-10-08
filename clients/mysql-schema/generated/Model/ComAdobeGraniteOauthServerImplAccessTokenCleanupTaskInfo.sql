--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo`
--
INSERT INTO `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo`
--
UPDATE `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo`
--
DELETE FROM `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo` WHERE 0;

