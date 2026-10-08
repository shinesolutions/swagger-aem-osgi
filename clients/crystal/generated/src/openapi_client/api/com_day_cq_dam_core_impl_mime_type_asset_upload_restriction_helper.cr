require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_allow_all_mime : Bool? = nil, cq_dam_allowed_asset_mimes : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.allow.all.mime" => cq_dam_allow_all_mime, "cq.dam.allowed.asset.mimes" => cq_dam_allowed_asset_mimes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
