require "json"

module OpenAPIClient
  module Api
  class ComDayCqImageInternalFontFontHelper
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, fontpath : Array(String)? = nil, oversampling_factor : Int32? = nil) : Response(OpenAPIClient::ComDayCqImageInternalFontFontHelperInfo)
      @conn.request(OpenAPIClient::ComDayCqImageInternalFontFontHelperInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.image.internal.font.FontHelper",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "fontpath" => fontpath, "oversamplingFactor" => oversampling_factor },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
