-module(openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties/0]).

-type openapi_com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_properties() ::
    #{ 'priority' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'priority' := Priority
        }) ->
    #{ 'priority' => Priority
     }.
