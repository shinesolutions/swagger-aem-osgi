-module(openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_properties() ::
    #{ 'streamPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'streamName' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'streamPath' := StreamPath,
          'streamName' := StreamName
        }) ->
    #{ 'streamPath' => StreamPath,
       'streamName' => StreamName
     }.
