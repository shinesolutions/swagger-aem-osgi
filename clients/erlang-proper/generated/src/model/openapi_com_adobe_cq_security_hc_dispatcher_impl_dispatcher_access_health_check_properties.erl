-module(openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties/0]).

-export([openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties/1]).

-export_type([openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties/0]).

-type openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'dispatcher_address', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dispatcher_filter_allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'dispatcher_filter_blocked', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties() ->
    openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties([]).

openapi_com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'dispatcher.address', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dispatcher.filter.allowed', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'dispatcher.filter.blocked', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

