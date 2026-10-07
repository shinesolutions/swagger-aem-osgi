-module(openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties() ::
  [ {'referencesearchservlet_maxReferencesPerPage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'referencesearchservlet_maxPages', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties() ->
    openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties([]).

openapi_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties(Fields) ->
  Default = [ {'referencesearchservlet.maxReferencesPerPage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'referencesearchservlet.maxPages', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

