-module(openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_properties() ::
    #{ 'includedPaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'enableAsyncObserver' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'observerQueueSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'includedPaths' := IncludedPaths,
          'enableAsyncObserver' := EnableAsyncObserver,
          'observerQueueSize' := ObserverQueueSize
        }) ->
    #{ 'includedPaths' => IncludedPaths,
       'enableAsyncObserver' => EnableAsyncObserver,
       'observerQueueSize' => ObserverQueueSize
     }.
