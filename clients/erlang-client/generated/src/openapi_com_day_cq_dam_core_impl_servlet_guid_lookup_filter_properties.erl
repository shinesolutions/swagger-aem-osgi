-module(openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_guid_lookup_filter_properties() ::
    #{ 'cq_dam_core_guidlookupfilter_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_dam_core_guidlookupfilter_enabled' := CqDamCoreGuidlookupfilterEnabled
        }) ->
    #{ 'cq.dam.core.guidlookupfilter.enabled' => CqDamCoreGuidlookupfilterEnabled
     }.
