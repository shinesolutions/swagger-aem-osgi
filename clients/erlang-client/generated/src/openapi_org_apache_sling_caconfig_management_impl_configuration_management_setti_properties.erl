-module(openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties/0]).

-type openapi_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties() ::
    #{ 'ignorePropertyNameRegex' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'configCollectionPropertiesResourceNames' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'ignorePropertyNameRegex' := IgnorePropertyNameRegex,
          'configCollectionPropertiesResourceNames' := ConfigCollectionPropertiesResourceNames
        }) ->
    #{ 'ignorePropertyNameRegex' => IgnorePropertyNameRegex,
       'configCollectionPropertiesResourceNames' => ConfigCollectionPropertiesResourceNames
     }.
