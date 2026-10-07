-module(openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties/0]).

-type openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties() ::
    #{ 'communities_integration_livefyre_sling_event_filter' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'communities_integration_livefyre_sling_event_filter' := CommunitiesIntegrationLivefyreSlingEventFilter
        }) ->
    #{ 'communities.integration.livefyre.sling.event.filter' => CommunitiesIntegrationLivefyreSlingEventFilter
     }.
