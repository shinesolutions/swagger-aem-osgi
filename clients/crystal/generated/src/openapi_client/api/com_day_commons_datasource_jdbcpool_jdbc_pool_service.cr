require "json"

module OpenAPIClient
  module Api
  class ComDayCommonsDatasourceJdbcpoolJdbcPoolService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, jdbc_driver_class : String? = nil, jdbc_connection_uri : String? = nil, jdbc_username : String? = nil, jdbc_password : String? = nil, jdbc_validation_query : String? = nil, default_readonly : Bool? = nil, default_autocommit : Bool? = nil, pool_size : Int32? = nil, pool_max_wait_msec : Int32? = nil, datasource_name : String? = nil, datasource_svc_properties : Array(String)? = nil) : Response(OpenAPIClient::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo)
      @conn.request(OpenAPIClient::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "jdbc.driver.class" => jdbc_driver_class, "jdbc.connection.uri" => jdbc_connection_uri, "jdbc.username" => jdbc_username, "jdbc.password" => jdbc_password, "jdbc.validation.query" => jdbc_validation_query, "default.readonly" => default_readonly, "default.autocommit" => default_autocommit, "pool.size" => pool_size, "pool.max.wait.msec" => pool_max_wait_msec, "datasource.name" => datasource_name, "datasource.svc.properties" => datasource_svc_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
