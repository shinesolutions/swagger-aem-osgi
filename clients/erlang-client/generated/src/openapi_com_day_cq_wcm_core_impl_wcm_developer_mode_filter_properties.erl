-module(openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties() ::
    #{ 'wcmdevmodefilter_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'wcmdevmodefilter_enabled' := WcmdevmodefilterEnabled
        }) ->
    #{ 'wcmdevmodefilter.enabled' => WcmdevmodefilterEnabled
     }.
