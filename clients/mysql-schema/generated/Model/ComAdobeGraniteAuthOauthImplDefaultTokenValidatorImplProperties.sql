--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties`
--
SELECT `auth.token.validator.type` FROM `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties`
--
INSERT INTO `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties`(`auth.token.validator.type`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties`
--
UPDATE `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties` SET `auth.token.validator.type` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties`
--
DELETE FROM `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties` WHERE 0;

