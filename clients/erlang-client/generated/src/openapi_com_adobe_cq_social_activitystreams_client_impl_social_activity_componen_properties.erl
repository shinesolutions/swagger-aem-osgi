-module(openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties/0]).

-type openapi_com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_properties() ::
    #{ 'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'priority' := Priority
        }) ->
    #{ 'priority' => Priority
     }.
