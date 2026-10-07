-module(openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_info/0]).

-type openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties:openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties()
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
