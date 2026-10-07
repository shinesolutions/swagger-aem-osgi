require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteMonitoringImplScriptConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, script_filename : String? = nil, script_display : String? = nil, script_path : String? = nil, script_platform : Array(String)? = nil, interval : Int32? = nil, jmxdomain : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteMonitoringImplScriptConfigImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteMonitoringImplScriptConfigImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "script.filename" => script_filename, "script.display" => script_display, "script.path" => script_path, "script.platform" => script_platform, "interval" => interval, "jmxdomain" => jmxdomain },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
