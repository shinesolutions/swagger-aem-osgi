require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDatasourceDataSourceFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, datasource_name : String? = nil, datasource_svc_prop_name : String? = nil, driver_class_name : String? = nil, url : String? = nil, username : String? = nil, password : String? = nil, default_auto_commit : String? = nil, default_read_only : String? = nil, default_transaction_isolation : String? = nil, default_catalog : String? = nil, max_active : Int32? = nil, max_idle : Int32? = nil, min_idle : Int32? = nil, initial_size : Int32? = nil, max_wait : Int32? = nil, max_age : Int32? = nil, test_on_borrow : Bool? = nil, test_on_return : Bool? = nil, test_while_idle : Bool? = nil, validation_query : String? = nil, validation_query_timeout : Int32? = nil, time_between_eviction_runs_millis : Int32? = nil, min_evictable_idle_time_millis : Int32? = nil, connection_properties : String? = nil, init_sql : String? = nil, jdbc_interceptors : String? = nil, validation_interval : Int32? = nil, log_validation_errors : Bool? = nil, datasource_svc_properties : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingDatasourceDataSourceFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDatasourceDataSourceFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "datasource.name" => datasource_name, "datasource.svc.prop.name" => datasource_svc_prop_name, "driverClassName" => driver_class_name, "url" => url, "username" => username, "password" => password, "defaultAutoCommit" => default_auto_commit, "defaultReadOnly" => default_read_only, "defaultTransactionIsolation" => default_transaction_isolation, "defaultCatalog" => default_catalog, "maxActive" => max_active, "maxIdle" => max_idle, "minIdle" => min_idle, "initialSize" => initial_size, "maxWait" => max_wait, "maxAge" => max_age, "testOnBorrow" => test_on_borrow, "testOnReturn" => test_on_return, "testWhileIdle" => test_while_idle, "validationQuery" => validation_query, "validationQueryTimeout" => validation_query_timeout, "timeBetweenEvictionRunsMillis" => time_between_eviction_runs_millis, "minEvictableIdleTimeMillis" => min_evictable_idle_time_millis, "connectionProperties" => connection_properties, "initSQL" => init_sql, "jdbcInterceptors" => jdbc_interceptors, "validationInterval" => validation_interval, "logValidationErrors" => log_validation_errors, "datasource.svc.properties" => datasource_svc_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
