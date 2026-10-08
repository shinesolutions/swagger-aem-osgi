-module(openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties() ::
  [ {'persistentCacheIncludes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties(Fields) ->
  Default = [ {'persistentCacheIncludes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

