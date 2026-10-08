-module(openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties() ::
  [ {'page_info_provider_property_regex_default', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'page_info_provider_property_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties(Fields) ->
  Default = [ {'page.info.provider.property.regex.default', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'page.info.provider.property.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

