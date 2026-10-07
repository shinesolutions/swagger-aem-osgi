-module(openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties/0]).

-export([openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties() ::
  [ {'automoderation_sequence', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'automoderation_onfailurestop', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties() ->
    openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties([]).

openapi_com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_properties(Fields) ->
  Default = [ {'automoderation.sequence', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'automoderation.onfailurestop', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

