require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthImsImplImsConfigProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_configmanager_ims_configid : String? = nil, ims_owning_entity : String? = nil, aem_instance_id : String? = nil, ims_service_code : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.configmanager.ims.configid" => oauth_configmanager_ims_configid, "ims.owningEntity" => ims_owning_entity, "aem.instanceId" => aem_instance_id, "ims.serviceCode" => ims_service_code },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
