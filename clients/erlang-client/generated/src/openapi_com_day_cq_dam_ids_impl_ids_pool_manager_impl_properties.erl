-module(openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties/0]).

-type openapi_com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties() ::
    #{ 'max_errors_to_blacklist' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'retry_interval_to_whitelist' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'connect_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'socket_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'process_label' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'connection_use_max' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'max_errors_to_blacklist' := MaxErrorsToBlacklist,
          'retry_interval_to_whitelist' := RetryIntervalToWhitelist,
          'connect_timeout' := ConnectTimeout,
          'socket_timeout' := SocketTimeout,
          'process_label' := ProcessLabel,
          'connection_use_max' := ConnectionUseMax
        }) ->
    #{ 'max.errors.to.blacklist' => MaxErrorsToBlacklist,
       'retry.interval.to.whitelist' => RetryIntervalToWhitelist,
       'connect.timeout' => ConnectTimeout,
       'socket.timeout' => SocketTimeout,
       'process.label' => ProcessLabel,
       'connection.use.max' => ConnectionUseMax
     }.
