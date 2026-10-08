-module(openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties() ::
  [ {'paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties() ->
    openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties([]).

openapi_com_day_cq_wcm_core_impl_event_page_post_processor_properties(Fields) ->
  Default = [ {'paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

