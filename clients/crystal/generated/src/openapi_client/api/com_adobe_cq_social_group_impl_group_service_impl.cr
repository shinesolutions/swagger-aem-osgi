require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialGroupImplGroupServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, max_wait_time : Int32? = nil, min_wait_between_retries : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialGroupImplGroupServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialGroupImplGroupServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "maxWaitTime" => max_wait_time, "minWaitBetweenRetries" => min_wait_between_retries },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
