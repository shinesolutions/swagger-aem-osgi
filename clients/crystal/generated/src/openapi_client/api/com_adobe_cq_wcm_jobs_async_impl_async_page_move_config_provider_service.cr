require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, threshold : Int32? = nil, job_topic_name : String? = nil, email_enabled : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "threshold" => threshold, "jobTopicName" => job_topic_name, "emailEnabled" => email_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
