-module(openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_info/0]).

-type openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties:openapi_org_apache_sling_caconfig_impl_configuration_bindings_value_provider_properties()
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
