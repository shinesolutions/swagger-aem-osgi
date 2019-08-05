-module(openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties/0]).

-type openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties() ::
    #{ 'jdbc_driver_class' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jdbc_connection_uri' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jdbc_username' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jdbc_password' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jdbc_validation_query' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'default_readonly' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'default_autocommit' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'pool_size' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'pool_max_wait_msec' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'datasource_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'datasource_svc_properties' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'jdbc_driver_class' := JdbcDriverClass,
          'jdbc_connection_uri' := JdbcConnectionUri,
          'jdbc_username' := JdbcUsername,
          'jdbc_password' := JdbcPassword,
          'jdbc_validation_query' := JdbcValidationQuery,
          'default_readonly' := DefaultReadonly,
          'default_autocommit' := DefaultAutocommit,
          'pool_size' := PoolSize,
          'pool_max_wait_msec' := PoolMaxWaitMsec,
          'datasource_name' := DatasourceName,
          'datasource_svc_properties' := DatasourceSvcProperties
        }) ->
    #{ 'jdbc.driver.class' => JdbcDriverClass,
       'jdbc.connection.uri' => JdbcConnectionUri,
       'jdbc.username' => JdbcUsername,
       'jdbc.password' => JdbcPassword,
       'jdbc.validation.query' => JdbcValidationQuery,
       'default.readonly' => DefaultReadonly,
       'default.autocommit' => DefaultAutocommit,
       'pool.size' => PoolSize,
       'pool.max.wait.msec' => PoolMaxWaitMsec,
       'datasource.name' => DatasourceName,
       'datasource.svc.properties' => DatasourceSvcProperties
     }.
