-module(openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties/0]).

-type openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties() ::
    #{ 'resource_types' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'resource_types' := ResourceTypes
        }) ->
    #{ 'resource.types' => ResourceTypes
     }.
