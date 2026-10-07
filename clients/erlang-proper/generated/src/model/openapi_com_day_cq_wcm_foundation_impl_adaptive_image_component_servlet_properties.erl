-module(openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties() ::
  [ {'adapt_supported_widths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties() ->
    openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties([]).

openapi_com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_properties(Fields) ->
  Default = [ {'adapt.supported.widths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

