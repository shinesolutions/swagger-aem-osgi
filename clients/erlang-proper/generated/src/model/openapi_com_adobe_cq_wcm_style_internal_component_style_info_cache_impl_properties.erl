-module(openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties/0]).

-export([openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties/1]).

-export_type([openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties/0]).

-type openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties() ::
  [ {'size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties() ->
    openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties([]).

openapi_com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_properties(Fields) ->
  Default = [ {'size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

