require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseImplSocialUtilsImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, legacy_cloud_ugc_path_mapping : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "legacyCloudUGCPathMapping" => legacy_cloud_ugc_path_mapping },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
