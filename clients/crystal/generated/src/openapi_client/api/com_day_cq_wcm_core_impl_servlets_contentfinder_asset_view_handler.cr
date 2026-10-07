require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, dam_showexpired : Bool? = nil, dam_showhidden : Bool? = nil, tag_title_search : Bool? = nil, guess_total : String? = nil, dam_expiry_property : String? = nil) : Response(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "dam.showexpired" => dam_showexpired, "dam.showhidden" => dam_showhidden, "tagTitleSearch" => tag_title_search, "guessTotal" => guess_total, "dam.expiryProperty" => dam_expiry_property },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
