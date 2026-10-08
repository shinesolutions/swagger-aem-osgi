require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplLanguageManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, langmgr_list_path : String? = nil, langmgr_country_default : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplLanguageManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplLanguageManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "langmgr.list.path" => langmgr_list_path, "langmgr.country.default" => langmgr_country_default },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
