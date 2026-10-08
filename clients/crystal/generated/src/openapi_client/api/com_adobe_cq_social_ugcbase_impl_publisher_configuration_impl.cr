require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, is_primary_publisher : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "isPrimaryPublisher" => is_primary_publisher },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
