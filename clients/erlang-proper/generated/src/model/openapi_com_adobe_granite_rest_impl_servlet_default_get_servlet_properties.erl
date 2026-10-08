-module(openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties/0]).

-export([openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties/0]).

-type openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties() ::
  [ {'default_limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'use_absolute_uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties() ->
    openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties([]).

openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties(Fields) ->
  Default = [ {'default.limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'use.absolute.uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

