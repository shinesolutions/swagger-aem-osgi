-module(openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties/0]).

-type openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties() ::
  [ {'org_apache_jackrabbit_oak_authentication_appName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_jackrabbit_oak_authentication_configSpiName', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties() ->
    openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties([]).

openapi_org_apache_jackrabbit_oak_security_authentication_authentication_config_properties(Fields) ->
  Default = [ {'org.apache.jackrabbit.oak.authentication.appName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.jackrabbit.oak.authentication.configSpiName', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

