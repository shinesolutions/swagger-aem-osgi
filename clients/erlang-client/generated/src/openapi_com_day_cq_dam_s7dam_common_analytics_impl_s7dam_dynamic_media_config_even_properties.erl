-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties() ::
    #{ 'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled' := CqDamS7damDynamicmediaconfigeventlistenerEnabled
        }) ->
    #{ 'cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled' => CqDamS7damDynamicmediaconfigeventlistenerEnabled
     }.
