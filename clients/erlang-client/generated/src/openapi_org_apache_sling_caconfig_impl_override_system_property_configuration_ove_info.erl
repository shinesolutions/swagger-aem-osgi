-module(openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info/0]).

-type openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties:openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
