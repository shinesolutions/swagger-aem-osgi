-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties() ::
  [ {'server_type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties(Fields) ->
  Default = [ {'server.type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

