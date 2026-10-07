require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixSystemreadySystemReadyMonitor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, poll_interval : Int32? = nil) : Response(OpenAPIClient::OrgApacheFelixSystemreadySystemReadyMonitorInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixSystemreadySystemReadyMonitorInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "poll.interval" => poll_interval },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
