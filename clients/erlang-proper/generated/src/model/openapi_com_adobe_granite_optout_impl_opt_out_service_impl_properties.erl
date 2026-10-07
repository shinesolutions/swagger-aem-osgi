-module(openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties/0]).

-export([openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties/1]).

-export_type([openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties/0]).

-type openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties() ::
  [ {'optout_cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'optout_headers', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'optout_whitelist_cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties() ->
    openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties([]).

openapi_com_adobe_granite_optout_impl_opt_out_service_impl_properties(Fields) ->
  Default = [ {'optout.cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'optout.headers', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'optout.whitelist.cookies', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

