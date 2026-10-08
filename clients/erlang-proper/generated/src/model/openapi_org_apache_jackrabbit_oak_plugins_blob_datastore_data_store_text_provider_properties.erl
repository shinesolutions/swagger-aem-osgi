-module(openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties() ::
  [ {'dir', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties() ->
    openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties([]).

openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties(Fields) ->
  Default = [ {'dir', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

