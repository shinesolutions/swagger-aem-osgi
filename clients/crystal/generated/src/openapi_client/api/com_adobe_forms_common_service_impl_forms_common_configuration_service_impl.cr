require "json"

module OpenAPIClient
  module Api
  class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, temp_storage_config : String? = nil) : Response(OpenAPIClient::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo)
      @conn.request(OpenAPIClient::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "tempStorageConfig" => temp_storage_config },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
