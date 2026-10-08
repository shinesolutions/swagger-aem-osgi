-module(openapi_org_apache_http_proxyconfigurator_properties).

-include("openapi.hrl").

-export([openapi_org_apache_http_proxyconfigurator_properties/0]).

-export([openapi_org_apache_http_proxyconfigurator_properties/1]).

-export_type([openapi_org_apache_http_proxyconfigurator_properties/0]).

-type openapi_org_apache_http_proxyconfigurator_properties() ::
  [ {'proxy_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'proxy_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'proxy_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_exceptions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_http_proxyconfigurator_properties() ->
    openapi_org_apache_http_proxyconfigurator_properties([]).

openapi_org_apache_http_proxyconfigurator_properties(Fields) ->
  Default = [ {'proxy.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'proxy.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'proxy.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.exceptions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

