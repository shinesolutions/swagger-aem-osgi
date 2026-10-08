require "json"

module OpenAPIClient
  module Api
  class ComAdobeFormsCommonServiceImplDefaultDataProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, alloweddata_file_locations : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "alloweddataFileLocations" => alloweddata_file_locations },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
