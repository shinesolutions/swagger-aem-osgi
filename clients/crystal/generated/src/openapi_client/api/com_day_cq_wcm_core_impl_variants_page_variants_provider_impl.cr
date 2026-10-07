require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_externalizer_domain : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "default.externalizer.domain" => default_externalizer_domain },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
