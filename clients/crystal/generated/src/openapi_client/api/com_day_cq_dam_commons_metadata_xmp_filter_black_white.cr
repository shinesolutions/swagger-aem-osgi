require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCommonsMetadataXmpFilterBlackWhite
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, xmp_filter_apply_whitelist : Bool? = nil, xmp_filter_whitelist : Array(String)? = nil, xmp_filter_apply_blacklist : Bool? = nil, xmp_filter_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "xmp.filter.apply_whitelist" => xmp_filter_apply_whitelist, "xmp.filter.whitelist" => xmp_filter_whitelist, "xmp.filter.apply_blacklist" => xmp_filter_apply_blacklist, "xmp.filter.blacklist" => xmp_filter_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
