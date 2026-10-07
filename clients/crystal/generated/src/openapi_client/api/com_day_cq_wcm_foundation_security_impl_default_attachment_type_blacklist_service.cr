require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, default_attachment_type_blacklist : Array(String)? = nil, baseline_attachment_type_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "default.attachment.type.blacklist" => default_attachment_type_blacklist, "baseline.attachment.type.blacklist" => baseline_attachment_type_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
