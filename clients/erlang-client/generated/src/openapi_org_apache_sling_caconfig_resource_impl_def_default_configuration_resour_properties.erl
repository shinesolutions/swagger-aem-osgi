-module(openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties/0]).

-type openapi_org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'configPath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fallbackPaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'configCollectionInheritancePropertyNames' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enabled' := Enabled,
          'configPath' := ConfigPath,
          'fallbackPaths' := FallbackPaths,
          'configCollectionInheritancePropertyNames' := ConfigCollectionInheritancePropertyNames
        }) ->
    #{ 'enabled' => Enabled,
       'configPath' => ConfigPath,
       'fallbackPaths' => FallbackPaths,
       'configCollectionInheritancePropertyNames' => ConfigCollectionInheritancePropertyNames
     }.
