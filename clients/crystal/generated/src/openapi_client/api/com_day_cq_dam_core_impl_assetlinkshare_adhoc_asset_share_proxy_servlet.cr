require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_adhoc_asset_share_prezip_maxcontentsize : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.adhoc.asset.share.prezip.maxcontentsize" => cq_dam_adhoc_asset_share_prezip_maxcontentsize },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
