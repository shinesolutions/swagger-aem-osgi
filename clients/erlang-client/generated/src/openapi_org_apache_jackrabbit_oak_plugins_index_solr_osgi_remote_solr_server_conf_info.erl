-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_properties()
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
