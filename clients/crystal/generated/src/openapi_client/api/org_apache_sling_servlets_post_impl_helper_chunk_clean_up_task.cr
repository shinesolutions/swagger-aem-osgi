require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingServletsPostImplHelperChunkCleanUpTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil, scheduler_concurrent : Bool? = nil, chunk_cleanup_age : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression, "scheduler.concurrent" => scheduler_concurrent, "chunk.cleanup.age" => chunk_cleanup_age },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
