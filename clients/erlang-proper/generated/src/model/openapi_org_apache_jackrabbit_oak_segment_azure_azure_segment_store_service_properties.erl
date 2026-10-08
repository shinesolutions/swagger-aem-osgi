-module(openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties() ::
  [ {'accountName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'containerName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'accessKey', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'rootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'connectionURL', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties() ->
    openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties([]).

openapi_org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties(Fields) ->
  Default = [ {'accountName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'containerName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'accessKey', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'rootPath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'connectionURL', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

