-module(openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties() ::
  [ {'tokenExpiration', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tokenLength', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tokenRefresh', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'tokenCleanupThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'passwordHashAlgorithm', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'passwordHashIterations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'passwordSaltSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties() ->
    openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties([]).

openapi_org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties(Fields) ->
  Default = [ {'tokenExpiration', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tokenLength', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tokenRefresh', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'tokenCleanupThreshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'passwordHashAlgorithm', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'passwordHashIterations', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'passwordSaltSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

