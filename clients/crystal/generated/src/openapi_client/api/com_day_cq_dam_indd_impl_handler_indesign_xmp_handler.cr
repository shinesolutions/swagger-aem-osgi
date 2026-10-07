require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamInddImplHandlerIndesignXMPHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, process_label : String? = nil, extract_pages : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "process.label" => process_label, "extract.pages" => extract_pages },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
