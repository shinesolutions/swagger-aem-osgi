require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingStartupfilterImplStartupFilterImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, active_by_default : Bool? = nil, default_message : String? = nil) : Response(OpenAPIClient::OrgApacheSlingStartupfilterImplStartupFilterImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingStartupfilterImplStartupFilterImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "active.by.default" => active_by_default, "default.message" => default_message },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
