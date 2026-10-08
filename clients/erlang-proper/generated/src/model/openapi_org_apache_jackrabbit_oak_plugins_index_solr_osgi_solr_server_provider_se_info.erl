-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

