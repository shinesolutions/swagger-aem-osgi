-module(openapi_org_apache_sling_hc_core_impl_composite_health_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_composite_health_check_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_composite_health_check_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'filter_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_combineTagsWithOr' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName,
          'filter_tags' := FilterTags,
          'filter_combineTagsWithOr' := FilterCombineTagsWithOr
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName,
       'filter.tags' => FilterTags,
       'filter.combineTagsWithOr' => FilterCombineTagsWithOr
     }.
