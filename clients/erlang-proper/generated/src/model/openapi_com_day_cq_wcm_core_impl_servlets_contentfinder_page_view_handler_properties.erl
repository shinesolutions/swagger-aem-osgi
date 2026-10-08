-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties() ::
  [ {'guessTotal', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'tagTitleSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties() ->
    openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties([]).

openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties(Fields) ->
  Default = [ {'guessTotal', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'tagTitleSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

