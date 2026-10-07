require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mime_allow_empty : Bool? = nil, mime_allowed : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mime.allowEmpty" => mime_allow_empty, "mime.allowed" => mime_allowed },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
