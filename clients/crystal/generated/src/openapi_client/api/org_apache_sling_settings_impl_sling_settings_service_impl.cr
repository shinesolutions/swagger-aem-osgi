require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingSettingsImplSlingSettingsServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_name : String? = nil, sling_description : String? = nil) : Response(OpenAPIClient::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.name" => sling_name, "sling.description" => sling_description },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
