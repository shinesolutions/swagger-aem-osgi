-module(openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties/0]).

-export([openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties/1]).

-export_type([openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties/0]).

-type openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties() ::
  [ {'supportedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties() ->
    openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties([]).

openapi_com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties(Fields) ->
  Default = [ {'supportedPaths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

