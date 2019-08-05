-module(openapi_org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'attribute_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'attribute_value_constraint' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName,
          'mbean_name' := MbeanName,
          'attribute_name' := AttributeName,
          'attribute_value_constraint' := AttributeValueConstraint
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName,
       'mbean.name' => MbeanName,
       'attribute.name' => AttributeName,
       'attribute.value.constraint' => AttributeValueConstraint
     }.
