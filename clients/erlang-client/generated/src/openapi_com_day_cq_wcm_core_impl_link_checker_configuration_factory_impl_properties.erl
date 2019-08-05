-module(openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties() ::
    #{ 'link_expired_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_expired_remove' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'link_expired_suffix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_invalid_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_invalid_remove' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'link_invalid_suffix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_predated_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_predated_remove' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'link_predated_suffix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'link_wcmmodes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'link_expired_prefix' := LinkExpiredPrefix,
          'link_expired_remove' := LinkExpiredRemove,
          'link_expired_suffix' := LinkExpiredSuffix,
          'link_invalid_prefix' := LinkInvalidPrefix,
          'link_invalid_remove' := LinkInvalidRemove,
          'link_invalid_suffix' := LinkInvalidSuffix,
          'link_predated_prefix' := LinkPredatedPrefix,
          'link_predated_remove' := LinkPredatedRemove,
          'link_predated_suffix' := LinkPredatedSuffix,
          'link_wcmmodes' := LinkWcmmodes
        }) ->
    #{ 'link.expired.prefix' => LinkExpiredPrefix,
       'link.expired.remove' => LinkExpiredRemove,
       'link.expired.suffix' => LinkExpiredSuffix,
       'link.invalid.prefix' => LinkInvalidPrefix,
       'link.invalid.remove' => LinkInvalidRemove,
       'link.invalid.suffix' => LinkInvalidSuffix,
       'link.predated.prefix' => LinkPredatedPrefix,
       'link.predated.remove' => LinkPredatedRemove,
       'link.predated.suffix' => LinkPredatedSuffix,
       'link.wcmmodes' => LinkWcmmodes
     }.
