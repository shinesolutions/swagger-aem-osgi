-module(openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_references_content_content_reference_config_properties() ::
    #{ 'contentReferenceConfig_resourceTypes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'contentReferenceConfig_resourceTypes' := ContentReferenceConfigResourceTypes
        }) ->
    #{ 'contentReferenceConfig.resourceTypes' => ContentReferenceConfigResourceTypes
     }.
