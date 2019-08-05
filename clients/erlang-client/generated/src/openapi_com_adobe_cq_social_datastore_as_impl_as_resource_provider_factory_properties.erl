-module(openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties/0]).

-type openapi_com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties() ::
    #{ 'version_id' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cache_on' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'concurrency_level' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_start_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_ttl' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'time_limit' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'version_id' := VersionId,
          'cache_on' := CacheOn,
          'concurrency_level' := ConcurrencyLevel,
          'cache_start_size' := CacheStartSize,
          'cache_ttl' := CacheTtl,
          'cache_size' := CacheSize,
          'time_limit' := TimeLimit
        }) ->
    #{ 'version.id' => VersionId,
       'cache.on' => CacheOn,
       'concurrency.level' => ConcurrencyLevel,
       'cache.start.size' => CacheStartSize,
       'cache.ttl' => CacheTtl,
       'cache.size' => CacheSize,
       'time.limit' => TimeLimit
     }.
