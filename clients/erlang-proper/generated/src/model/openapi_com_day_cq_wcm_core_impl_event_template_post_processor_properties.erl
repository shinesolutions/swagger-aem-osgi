-module(openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties() ::
  [ {'paths', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties() ->
    openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties([]).

openapi_com_day_cq_wcm_core_impl_event_template_post_processor_properties(Fields) ->
  Default = [ {'paths', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

