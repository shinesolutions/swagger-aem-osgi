-module(openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties/0]).

-export([openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties/1]).

-export_type([openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties/0]).

-type openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties() ::
  [ {'aggregate_relationships', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'aggregate_descend_virtual', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties() ->
    openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties([]).

openapi_com_adobe_granite_activitystreams_impl_activity_manager_impl_properties(Fields) ->
  Default = [ {'aggregate.relationships', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'aggregate.descend.virtual', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

