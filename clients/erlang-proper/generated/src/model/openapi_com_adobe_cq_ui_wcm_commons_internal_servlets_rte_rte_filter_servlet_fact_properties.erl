-module(openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties/0]).

-export([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties/1]).

-export_type([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties/0]).

-type openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties() ::
  [ {'resource_types', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties() ->
    openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties([]).

openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties(Fields) ->
  Default = [ {'resource.types', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

