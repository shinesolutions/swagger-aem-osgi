-module(openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties:openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info() ->
    openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info([]).

openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties:openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

