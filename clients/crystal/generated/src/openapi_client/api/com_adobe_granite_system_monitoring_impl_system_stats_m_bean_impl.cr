require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, jmx_objectname : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "jmx.objectname" => jmx_objectname },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
