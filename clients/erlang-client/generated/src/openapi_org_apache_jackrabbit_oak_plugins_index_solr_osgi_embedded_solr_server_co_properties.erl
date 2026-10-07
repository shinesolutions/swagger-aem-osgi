-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties() ::
    #{ 'solr_home_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'solr_core_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'solr_home_path' := SolrHomePath,
          'solr_core_name' := SolrCoreName
        }) ->
    #{ 'solr.home.path' => SolrHomePath,
       'solr.core.name' => SolrCoreName
     }.
