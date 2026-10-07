-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties() ::
    #{ 'solr_http_url' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'solr_zk_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'solr_collection' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'solr_socket_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'solr_connection_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'solr_shards_no' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'solr_replication_factor' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'solr_conf_dir' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'solr_http_url' := SolrHttpUrl,
          'solr_zk_host' := SolrZkHost,
          'solr_collection' := SolrCollection,
          'solr_socket_timeout' := SolrSocketTimeout,
          'solr_connection_timeout' := SolrConnectionTimeout,
          'solr_shards_no' := SolrShardsNo,
          'solr_replication_factor' := SolrReplicationFactor,
          'solr_conf_dir' := SolrConfDir
        }) ->
    #{ 'solr.http.url' => SolrHttpUrl,
       'solr.zk.host' => SolrZkHost,
       'solr.collection' => SolrCollection,
       'solr.socket.timeout' => SolrSocketTimeout,
       'solr.connection.timeout' => SolrConnectionTimeout,
       'solr.shards.no' => SolrShardsNo,
       'solr.replication.factor' => SolrReplicationFactor,
       'solr.conf.dir' => SolrConfDir
     }.
