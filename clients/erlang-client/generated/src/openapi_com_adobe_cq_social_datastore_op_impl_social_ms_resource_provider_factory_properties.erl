-module(openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties/0]).

-type openapi_com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_properties() ::
    #{ 'solr_zk_timeout' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'solr_commit' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cache_on' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'concurrency_level' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_start_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_ttl' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cache_size' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'solr_zk_timeout' := SolrZkTimeout,
          'solr_commit' := SolrCommit,
          'cache_on' := CacheOn,
          'concurrency_level' := ConcurrencyLevel,
          'cache_start_size' := CacheStartSize,
          'cache_ttl' := CacheTtl,
          'cache_size' := CacheSize
        }) ->
    #{ 'solr.zk.timeout' => SolrZkTimeout,
       'solr.commit' => SolrCommit,
       'cache.on' => CacheOn,
       'concurrency.level' => ConcurrencyLevel,
       'cache.start.size' => CacheStartSize,
       'cache.ttl' => CacheTtl,
       'cache.size' => CacheSize
     }.
