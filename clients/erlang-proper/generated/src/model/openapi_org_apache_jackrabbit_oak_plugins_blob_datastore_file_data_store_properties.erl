-module(openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties() ::
  [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties(Fields) ->
  Default = [ {'path', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

