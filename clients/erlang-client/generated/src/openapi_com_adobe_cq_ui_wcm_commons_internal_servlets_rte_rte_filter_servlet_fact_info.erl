-module(openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info/0]).

-type openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties:openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
