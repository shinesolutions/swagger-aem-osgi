-module(openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties/0]).

-export([openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties/1]).

-export_type([openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties/0]).

-type openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties() ->
    openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties([]).

openapi_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

