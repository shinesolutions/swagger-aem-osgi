-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties/0]).

-export([openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties() ::
  [ {'streamPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'streamName', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties() ->
    openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties([]).

openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties(Fields) ->
  Default = [ {'streamPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'streamName', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

