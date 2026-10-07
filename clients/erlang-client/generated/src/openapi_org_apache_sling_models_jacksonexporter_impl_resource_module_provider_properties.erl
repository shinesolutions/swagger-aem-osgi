-module(openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties/0]).

-type openapi_org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties() ::
    #{ 'max_recursion_levels' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'max_recursion_levels' := MaxRecursionLevels
        }) ->
    #{ 'max.recursion.levels' => MaxRecursionLevels
     }.
