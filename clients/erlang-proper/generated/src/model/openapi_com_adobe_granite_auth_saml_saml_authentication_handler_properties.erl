-module(openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties/0]).

-export([openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties/1]).

-export_type([openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties/0]).

-type openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties() ::
  [ {'path', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'idpUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'idpCertAlias', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'idpHttpRedirect', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'serviceProviderEntityId', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'assertionConsumerServiceURL', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'spPrivateKeyAlias', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'keyStorePassword', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultRedirectUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'userIDAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'useEncryption', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'createUser', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'userIntermediatePath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'addGroupMemberships', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'groupMembershipAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'nameIdFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'synchronizeAttributes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'handleLogout', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'logoutUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'clockTolerance', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'digestMethod', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'signatureMethod', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'identitySyncType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'idpIdentifier', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties() ->
    openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties([]).

openapi_com_adobe_granite_auth_saml_saml_authentication_handler_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'idpUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'idpCertAlias', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'idpHttpRedirect', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'serviceProviderEntityId', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'assertionConsumerServiceURL', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'spPrivateKeyAlias', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'keyStorePassword', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultRedirectUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'userIDAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'useEncryption', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'createUser', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'userIntermediatePath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'addGroupMemberships', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'groupMembershipAttribute', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'nameIdFormat', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'synchronizeAttributes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'handleLogout', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'logoutUrl', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'clockTolerance', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'digestMethod', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'signatureMethod', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'identitySyncType', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'idpIdentifier', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

