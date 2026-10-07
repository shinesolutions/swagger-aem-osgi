require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, async_configs : Array(String)? = nil, lease_time_out_minutes : Int32? = nil, failing_index_timeout_seconds : Int32? = nil, error_warn_interval_seconds : Int32? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "asyncConfigs" => async_configs, "leaseTimeOutMinutes" => lease_time_out_minutes, "failingIndexTimeoutSeconds" => failing_index_timeout_seconds, "errorWarnIntervalSeconds" => error_warn_interval_seconds },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
