-module(openapi_com_day_commons_httpclient_properties).

-include("openapi.hrl").

-export([openapi_com_day_commons_httpclient_properties/0]).

-export([openapi_com_day_commons_httpclient_properties/1]).

-export_type([openapi_com_day_commons_httpclient_properties/0]).

-type openapi_com_day_commons_httpclient_properties() ::
  [ {'proxy_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'proxy_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_user', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_ntlm_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_ntlm_domain', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'proxy_exceptions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_commons_httpclient_properties() ->
    openapi_com_day_commons_httpclient_properties([]).

openapi_com_day_commons_httpclient_properties(Fields) ->
  Default = [ {'proxy.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'proxy.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.user', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.ntlm.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.ntlm.domain', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'proxy.exceptions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

