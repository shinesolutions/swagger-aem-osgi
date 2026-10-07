-module(openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info/0]).

-export([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info/1]).

-export_type([openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info/0]).

-type openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties:openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties() }
  ].


openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info() ->
    openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info([]).

openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties:openapi_com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

