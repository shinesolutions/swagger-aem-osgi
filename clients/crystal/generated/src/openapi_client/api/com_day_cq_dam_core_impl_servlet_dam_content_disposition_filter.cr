require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletDamContentDispositionFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_mime_type_blacklist : Array(String)? = nil, cq_dam_empty_mime : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletDamContentDispositionFilterInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletDamContentDispositionFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.mime.type.blacklist" => cq_mime_type_blacklist, "cq.dam.empty.mime" => cq_dam_empty_mime },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
