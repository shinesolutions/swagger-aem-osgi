-module(openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties:openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info() ->
    openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info([]).

openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties:openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

