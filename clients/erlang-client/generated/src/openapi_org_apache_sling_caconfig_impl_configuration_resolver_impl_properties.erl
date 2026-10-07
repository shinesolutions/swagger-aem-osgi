-module(openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties/0]).

-type openapi_org_apache_sling_caconfig_impl_configuration_resolver_impl_properties() ::
    #{ 'configBucketNames' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'configBucketNames' := ConfigBucketNames
        }) ->
    #{ 'configBucketNames' => ConfigBucketNames
     }.
