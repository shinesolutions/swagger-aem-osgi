# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCommonsDatasourceJdbcpoolJdbcPoolService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, jdbc_driver_class: nil, jdbc_connection_uri: nil, jdbc_username: nil, jdbc_password: nil, jdbc_validation_query: nil, default_readonly: nil, default_autocommit: nil, pool_size: nil, pool_max_wait_msec: nil, datasource_name: nil, datasource_svc_properties: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService',
          type: OpenapiClient::Models::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'jdbc.driver.class' => jdbc_driver_class, 'jdbc.connection.uri' => jdbc_connection_uri, 'jdbc.username' => jdbc_username, 'jdbc.password' => jdbc_password, 'jdbc.validation.query' => jdbc_validation_query, 'default.readonly' => default_readonly, 'default.autocommit' => default_autocommit, 'pool.size' => pool_size, 'pool.max.wait.msec' => pool_max_wait_msec, 'datasource.name' => datasource_name, 'datasource.svc.properties' => datasource_svc_properties }
        )
      end
    end
  end
end
