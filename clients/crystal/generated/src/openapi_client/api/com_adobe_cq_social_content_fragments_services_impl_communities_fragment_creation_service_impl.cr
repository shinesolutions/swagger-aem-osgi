require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmentCreationServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_social_content_fragments_services_enabled : Bool? = nil, cq_social_content_fragments_services_wait_time_seconds : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.social.content.fragments.services.enabled" => cq_social_content_fragments_services_enabled, "cq.social.content.fragments.services.waitTimeSeconds" => cq_social_content_fragments_services_wait_time_seconds },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
