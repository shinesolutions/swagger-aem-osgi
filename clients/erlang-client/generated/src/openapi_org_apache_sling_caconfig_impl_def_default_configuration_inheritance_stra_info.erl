-module(openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info/0]).

-type openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties:openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties()
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
