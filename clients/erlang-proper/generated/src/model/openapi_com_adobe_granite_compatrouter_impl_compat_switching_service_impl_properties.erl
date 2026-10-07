-module(openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties/0]).

-export([openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties/0]).

-type openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties() ::
  [ {'compatgroups', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties() ->
    openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties([]).

openapi_com_adobe_granite_compatrouter_impl_compat_switching_service_impl_properties(Fields) ->
  Default = [ {'compatgroups', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

