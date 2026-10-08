-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties() ::
  [ {'solr_home_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'solr_core_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties(Fields) ->
  Default = [ {'solr.home.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'solr.core.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

