-module(openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties/0]).

-type openapi_org_apache_sling_hc_core_impl_scriptable_health_check_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'expression' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'language_extension' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName,
          'expression' := Expression,
          'language_extension' := LanguageExtension
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName,
       'expression' => Expression,
       'language.extension' => LanguageExtension
     }.
