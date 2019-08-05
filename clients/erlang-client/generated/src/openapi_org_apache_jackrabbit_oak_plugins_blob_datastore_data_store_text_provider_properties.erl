-module(openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_properties() ::
    #{ 'dir' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'dir' := Dir
        }) ->
    #{ 'dir' => Dir
     }.
