-module(openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties() ::
    #{ 'tokenExpiration' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'tokenLength' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'tokenRefresh' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'tokenCleanupThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'passwordHashAlgorithm' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'passwordHashIterations' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'passwordSaltSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'tokenExpiration' := TokenExpiration,
          'tokenLength' := TokenLength,
          'tokenRefresh' := TokenRefresh,
          'tokenCleanupThreshold' := TokenCleanupThreshold,
          'passwordHashAlgorithm' := PasswordHashAlgorithm,
          'passwordHashIterations' := PasswordHashIterations,
          'passwordSaltSize' := PasswordSaltSize
        }) ->
    #{ 'tokenExpiration' => TokenExpiration,
       'tokenLength' => TokenLength,
       'tokenRefresh' => TokenRefresh,
       'tokenCleanupThreshold' => TokenCleanupThreshold,
       'passwordHashAlgorithm' => PasswordHashAlgorithm,
       'passwordHashIterations' => PasswordHashIterations,
       'passwordSaltSize' => PasswordSaltSize
     }.
