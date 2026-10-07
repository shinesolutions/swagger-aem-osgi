require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, full_gc_days : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "full.gc.days" => full_gc_days },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
