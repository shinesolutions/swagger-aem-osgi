-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties() ::
  [ {'solr_http_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'solr_zk_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'solr_collection', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'solr_socket_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'solr_connection_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'solr_shards_no', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'solr_replication_factor', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'solr_conf_dir', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties(Fields) ->
  Default = [ {'solr.http.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'solr.zk.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'solr.collection', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'solr.socket.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'solr.connection.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'solr.shards.no', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'solr.replication.factor', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'solr.conf.dir', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

