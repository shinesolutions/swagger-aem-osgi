require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, operation : String? = nil, operation_icon : String? = nil, topic_name : String? = nil, email_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "operation" => operation, "operationIcon" => operation_icon, "topicName" => topic_name, "emailEnabled" => email_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
