require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamIdsImplIDSPoolManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_errors_to_blacklist : Int32? = nil, retry_interval_to_whitelist : Int32? = nil, connect_timeout : Int32? = nil, socket_timeout : Int32? = nil, process_label : String? = nil, connection_use_max : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamIdsImplIDSPoolManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamIdsImplIDSPoolManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "max.errors.to.blacklist" => max_errors_to_blacklist, "retry.interval.to.whitelist" => retry_interval_to_whitelist, "connect.timeout" => connect_timeout, "socket.timeout" => socket_timeout, "process.label" => process_label, "connection.use.max" => connection_use_max },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
