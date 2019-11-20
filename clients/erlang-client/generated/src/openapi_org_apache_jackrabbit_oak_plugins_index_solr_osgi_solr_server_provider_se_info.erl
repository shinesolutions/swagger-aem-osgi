-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties()
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