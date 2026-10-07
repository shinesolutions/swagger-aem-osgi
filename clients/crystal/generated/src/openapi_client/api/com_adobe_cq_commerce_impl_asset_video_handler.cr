require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCommerceImplAssetVideoHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_commerce_asset_handler_active : Bool? = nil, cq_commerce_asset_handler_name : String? = nil) : Response(OpenAPIClient::ComAdobeCqCommerceImplAssetVideoHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCommerceImplAssetVideoHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.commerce.asset.handler.active" => cq_commerce_asset_handler_active, "cq.commerce.asset.handler.name" => cq_commerce_asset_handler_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
