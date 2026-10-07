-module(openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties/0]).

-export([openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties/1]).

-export_type([openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties/0]).

-type openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties() ::
  [ {'jdbc_driver_class', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jdbc_connection_uri', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jdbc_username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jdbc_password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jdbc_validation_query', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'default_readonly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'default_autocommit', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'pool_size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'pool_max_wait_msec', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'datasource_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'datasource_svc_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties() ->
    openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties([]).

openapi_com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties(Fields) ->
  Default = [ {'jdbc.driver.class', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jdbc.connection.uri', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jdbc.username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jdbc.password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jdbc.validation.query', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'default.readonly', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'default.autocommit', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'pool.size', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'pool.max.wait.msec', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'datasource.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'datasource.svc.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

