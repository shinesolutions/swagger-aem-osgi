-module(openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties() ::
    #{ 'asyncConfigs' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'leaseTimeOutMinutes' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'failingIndexTimeoutSeconds' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'errorWarnIntervalSeconds' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'asyncConfigs' := AsyncConfigs,
          'leaseTimeOutMinutes' := LeaseTimeOutMinutes,
          'failingIndexTimeoutSeconds' := FailingIndexTimeoutSeconds,
          'errorWarnIntervalSeconds' := ErrorWarnIntervalSeconds
        }) ->
    #{ 'asyncConfigs' => AsyncConfigs,
       'leaseTimeOutMinutes' => LeaseTimeOutMinutes,
       'failingIndexTimeoutSeconds' => FailingIndexTimeoutSeconds,
       'errorWarnIntervalSeconds' => ErrorWarnIntervalSeconds
     }.
