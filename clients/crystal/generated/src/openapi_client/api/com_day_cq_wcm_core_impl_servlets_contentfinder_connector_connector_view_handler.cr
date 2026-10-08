require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorViewHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, item_resource_types : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "item.resource.types" => item_resource_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
