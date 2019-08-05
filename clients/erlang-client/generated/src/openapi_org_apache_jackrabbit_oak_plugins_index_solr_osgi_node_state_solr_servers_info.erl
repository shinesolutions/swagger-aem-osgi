-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties()
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
