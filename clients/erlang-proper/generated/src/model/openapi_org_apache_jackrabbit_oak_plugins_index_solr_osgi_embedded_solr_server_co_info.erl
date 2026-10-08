-module(openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info([]).

openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties:openapi_org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

