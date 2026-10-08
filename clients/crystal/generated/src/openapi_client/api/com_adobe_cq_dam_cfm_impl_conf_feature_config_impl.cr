require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamCfmImplConfFeatureConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dam_cfm_resource_types : Array(String)? = nil, dam_cfm_reference_properties : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dam.cfm.resourceTypes" => dam_cfm_resource_types, "dam.cfm.referenceProperties" => dam_cfm_reference_properties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
