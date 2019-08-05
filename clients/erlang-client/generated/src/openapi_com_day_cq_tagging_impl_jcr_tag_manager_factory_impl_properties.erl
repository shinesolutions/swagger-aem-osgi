-module(openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties/0]).

-type openapi_com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_properties() ::
    #{ 'validation_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'validation_enabled' := ValidationEnabled
        }) ->
    #{ 'validation.enabled' => ValidationEnabled
     }.
