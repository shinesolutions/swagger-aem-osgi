-module(openapi_com_adobe_cq_hc_content_packages_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_hc_content_packages_health_check_properties/0]).

-type openapi_com_adobe_cq_hc_content_packages_health_check_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'package_names' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName,
          'package_names' := PackageNames
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName,
       'package.names' => PackageNames
     }.
