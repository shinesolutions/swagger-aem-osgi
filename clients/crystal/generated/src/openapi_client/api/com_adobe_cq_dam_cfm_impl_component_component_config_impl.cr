require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamCfmImplComponentComponentConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dam_cfm_component_resource_type : String? = nil, dam_cfm_component_file_reference_prop : String? = nil, dam_cfm_component_elements_prop : String? = nil, dam_cfm_component_variation_prop : String? = nil) : Response(OpenAPIClient::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dam.cfm.component.resourceType" => dam_cfm_component_resource_type, "dam.cfm.component.fileReferenceProp" => dam_cfm_component_file_reference_prop, "dam.cfm.component.elementsProp" => dam_cfm_component_elements_prop, "dam.cfm.component.variationProp" => dam_cfm_component_variation_prop },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
