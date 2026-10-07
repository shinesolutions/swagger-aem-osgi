require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, operation : String? = nil, email_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "operation" => operation, "emailEnabled" => email_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
