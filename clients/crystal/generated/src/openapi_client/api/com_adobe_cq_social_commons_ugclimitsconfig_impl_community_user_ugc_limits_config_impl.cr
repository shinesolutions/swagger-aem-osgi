require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitsConfigImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable : Bool? = nil, ugc_limit : Int32? = nil, ugc_limit_duration : Int32? = nil, domains : Array(String)? = nil, to_list : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enable" => enable, "UGCLimit" => ugc_limit, "ugcLimitDuration" => ugc_limit_duration, "domains" => domains, "toList" => to_list },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
