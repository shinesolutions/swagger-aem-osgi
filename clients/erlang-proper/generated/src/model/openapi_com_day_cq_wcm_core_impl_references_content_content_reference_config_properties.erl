-module(openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties() ::
  [ {'contentReferenceConfig_resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties() ->
    openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties([]).

openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties(Fields) ->
  Default = [ {'contentReferenceConfig.resourceTypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

