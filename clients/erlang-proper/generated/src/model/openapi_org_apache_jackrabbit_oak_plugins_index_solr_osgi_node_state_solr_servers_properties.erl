-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties() ::
  [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_properties(Fields) ->
  Default = [ {'enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

