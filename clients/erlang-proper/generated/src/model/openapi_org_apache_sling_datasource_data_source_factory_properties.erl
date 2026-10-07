-module(openapi_org_apache_sling_datasource_data_source_factory_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_datasource_data_source_factory_properties/0]).

-export([openapi_org_apache_sling_datasource_data_source_factory_properties/1]).

-export_type([openapi_org_apache_sling_datasource_data_source_factory_properties/0]).

-type openapi_org_apache_sling_datasource_data_source_factory_properties() ::
  [ {'datasource_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'datasource_svc_prop_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'driverClassName', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'url', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'defaultAutoCommit', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'defaultReadOnly', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'defaultTransactionIsolation', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'defaultCatalog', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxIdle', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'minIdle', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'initialSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxWait', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'testOnBorrow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'testOnReturn', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'testWhileIdle', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'validationQuery', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'validationQueryTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'timeBetweenEvictionRunsMillis', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'minEvictableIdleTimeMillis', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'connectionProperties', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'initSQL', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'jdbcInterceptors', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'validationInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'logValidationErrors', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'datasource_svc_properties', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_sling_datasource_data_source_factory_properties() ->
    openapi_org_apache_sling_datasource_data_source_factory_properties([]).

openapi_org_apache_sling_datasource_data_source_factory_properties(Fields) ->
  Default = [ {'datasource.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'datasource.svc.prop.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'driverClassName', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'url', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'username', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'password', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'defaultAutoCommit', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'defaultReadOnly', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'defaultTransactionIsolation', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'defaultCatalog', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxActive', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxIdle', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'minIdle', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'initialSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxWait', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxAge', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'testOnBorrow', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'testOnReturn', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'testWhileIdle', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'validationQuery', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'validationQueryTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'timeBetweenEvictionRunsMillis', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'minEvictableIdleTimeMillis', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'connectionProperties', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'initSQL', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'jdbcInterceptors', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'validationInterval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'logValidationErrors', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'datasource.svc.properties', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

