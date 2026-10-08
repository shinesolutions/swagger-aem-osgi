-module(openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties() ::
  [ {'workspace', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dimensions', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties() ->
    openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties([]).

openapi_com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties(Fields) ->
  Default = [ {'workspace', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dimensions', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

