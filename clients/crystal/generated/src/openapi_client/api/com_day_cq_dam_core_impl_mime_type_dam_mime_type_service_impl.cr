require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_detect_asset_mime_from_content : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.detect.asset.mime.from.content" => cq_dam_detect_asset_mime_from_content },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
