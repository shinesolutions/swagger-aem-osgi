-module(openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties:openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties() }
  | {'additionalProperties', binary() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info() ->
    openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info([]).

openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties:openapi_org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties() }
            , {'additionalProperties', binary() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

