-module(openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'configPropertyInheritancePropertyNames' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enabled' := Enabled,
          'configPropertyInheritancePropertyNames' := ConfigPropertyInheritancePropertyNames
        }) ->
    #{ 'enabled' => Enabled,
       'configPropertyInheritancePropertyNames' => ConfigPropertyInheritancePropertyNames
     }.