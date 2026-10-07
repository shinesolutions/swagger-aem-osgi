require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, bucket_size : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "bucketSize" => bucket_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
