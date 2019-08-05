-module(openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_properties() ::
    #{ 'persistentCacheIncludes' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'persistentCacheIncludes' := PersistentCacheIncludes
        }) ->
    #{ 'persistentCacheIncludes' => PersistentCacheIncludes
     }.
