require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplReferencesContentContentReferenceConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, content_reference_config_resource_types : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "contentReferenceConfig.resourceTypes" => content_reference_config_resource_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
