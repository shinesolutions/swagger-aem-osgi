require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachment
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, attachment_type_blacklist : String? = nil, extension_order : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "attachmentTypeBlacklist" => attachment_type_blacklist, "extension.order" => extension_order },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
