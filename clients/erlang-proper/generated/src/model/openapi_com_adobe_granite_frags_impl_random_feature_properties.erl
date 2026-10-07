-module(openapi_com_adobe_granite_frags_impl_random_feature_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_frags_impl_random_feature_properties/0]).

-export([openapi_com_adobe_granite_frags_impl_random_feature_properties/1]).

-export_type([openapi_com_adobe_granite_frags_impl_random_feature_properties/0]).

-type openapi_com_adobe_granite_frags_impl_random_feature_properties() ::
  [ {'feature_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'feature_description', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'active_percentage', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cookie_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cookie_maxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_granite_frags_impl_random_feature_properties() ->
    openapi_com_adobe_granite_frags_impl_random_feature_properties([]).

openapi_com_adobe_granite_frags_impl_random_feature_properties(Fields) ->
  Default = [ {'feature.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'feature.description', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'active.percentage', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cookie.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cookie.maxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

