require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteInfocollectorInfoCollector
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, granite_infocollector_include_thread_dumps : Bool? = nil, granite_infocollector_include_heap_dump : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteInfocollectorInfoCollectorInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteInfocollectorInfoCollectorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "granite.infocollector.includeThreadDumps" => granite_infocollector_include_thread_dumps, "granite.infocollector.includeHeapDump" => granite_infocollector_include_heap_dump },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
