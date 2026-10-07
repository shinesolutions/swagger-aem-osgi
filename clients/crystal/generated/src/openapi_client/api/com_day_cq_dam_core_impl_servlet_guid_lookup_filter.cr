require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletGuidLookupFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_core_guidlookupfilter_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletGuidLookupFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletGuidLookupFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.core.guidlookupfilter.enabled" => cq_dam_core_guidlookupfilter_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
