-module(openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties/0]).

-type openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties() ::
    #{ 'cq_social_console_analytics_components' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_social_console_analytics_components' := CqSocialConsoleAnalyticsComponents
        }) ->
    #{ 'cq.social.console.analytics.components' => CqSocialConsoleAnalyticsComponents
     }.
