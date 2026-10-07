# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDatasourceDataSourceFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, datasource_name: nil, datasource_svc_prop_name: nil, driver_class_name: nil, url: nil, username: nil, password: nil, default_auto_commit: nil, default_read_only: nil, default_transaction_isolation: nil, default_catalog: nil, max_active: nil, max_idle: nil, min_idle: nil, initial_size: nil, max_wait: nil, max_age: nil, test_on_borrow: nil, test_on_return: nil, test_while_idle: nil, validation_query: nil, validation_query_timeout: nil, time_between_eviction_runs_millis: nil, min_evictable_idle_time_millis: nil, connection_properties: nil, init_sql: nil, jdbc_interceptors: nil, validation_interval: nil, log_validation_errors: nil, datasource_svc_properties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory',
          type: OpenapiClient::Models::OrgApacheSlingDatasourceDataSourceFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'datasource.name' => datasource_name, 'datasource.svc.prop.name' => datasource_svc_prop_name, 'driverClassName' => driver_class_name, 'url' => url, 'username' => username, 'password' => password, 'defaultAutoCommit' => default_auto_commit, 'defaultReadOnly' => default_read_only, 'defaultTransactionIsolation' => default_transaction_isolation, 'defaultCatalog' => default_catalog, 'maxActive' => max_active, 'maxIdle' => max_idle, 'minIdle' => min_idle, 'initialSize' => initial_size, 'maxWait' => max_wait, 'maxAge' => max_age, 'testOnBorrow' => test_on_borrow, 'testOnReturn' => test_on_return, 'testWhileIdle' => test_while_idle, 'validationQuery' => validation_query, 'validationQueryTimeout' => validation_query_timeout, 'timeBetweenEvictionRunsMillis' => time_between_eviction_runs_millis, 'minEvictableIdleTimeMillis' => min_evictable_idle_time_millis, 'connectionProperties' => connection_properties, 'initSQL' => init_sql, 'jdbcInterceptors' => jdbc_interceptors, 'validationInterval' => validation_interval, 'logValidationErrors' => log_validation_errors, 'datasource.svc.properties' => datasource_svc_properties }
        )
      end
    end
  end
end
