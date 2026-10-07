require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteSecurityUserUserPropertiesService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, adapter_condition : String? = nil, granite_userproperties_nodetypes : Array(String)? = nil, granite_userproperties_resourcetypes : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteSecurityUserUserPropertiesServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteSecurityUserUserPropertiesServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "adapter.condition" => adapter_condition, "granite.userproperties.nodetypes" => granite_userproperties_nodetypes, "granite.userproperties.resourcetypes" => granite_userproperties_resourcetypes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
