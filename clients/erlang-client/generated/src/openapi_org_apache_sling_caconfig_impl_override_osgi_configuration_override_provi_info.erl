-module(openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info/0]).

-type openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties:openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties()
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
