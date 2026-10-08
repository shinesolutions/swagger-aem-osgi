-module(openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties() ::
  [ {'scope', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties() ->
    openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties([]).

openapi_com_day_cq_wcm_core_impl_servlets_find_replace_servlet_properties(Fields) ->
  Default = [ {'scope', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

