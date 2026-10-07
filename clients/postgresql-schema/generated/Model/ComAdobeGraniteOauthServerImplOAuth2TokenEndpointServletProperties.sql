--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv'
--
SELECT oauth/issuer, oauth/access/token/expires/in, osgi/http/whiteboard/servlet/pattern, osgi/http/whiteboard/context/select FROM com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv'
--
INSERT INTO com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv (oauth/issuer, oauth/access/token/expires/in, osgi/http/whiteboard/servlet/pattern, osgi/http/whiteboard/context/select) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv'
--
UPDATE com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv SET oauth/issuer = ?, oauth/access/token/expires/in = ?, osgi/http/whiteboard/servlet/pattern = ?, osgi/http/whiteboard/context/select = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv'
--
DELETE FROM com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_serv WHERE 1=2;

