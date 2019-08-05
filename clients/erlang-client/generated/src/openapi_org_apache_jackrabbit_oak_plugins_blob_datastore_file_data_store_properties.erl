-module(openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'path' := Path
        }) ->
    #{ 'path' => Path
     }.
