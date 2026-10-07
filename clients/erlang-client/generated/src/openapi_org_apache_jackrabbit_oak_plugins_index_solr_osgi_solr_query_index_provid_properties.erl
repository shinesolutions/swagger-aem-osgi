-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_properties() ::
    #{ 'query_aggregation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'query_aggregation' := QueryAggregation
        }) ->
    #{ 'query.aggregation' => QueryAggregation
     }.
