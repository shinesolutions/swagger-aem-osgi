require "json"

module OpenAPIClient
  module Api
  class ComDayCqTaggingImplTagGarbageCollector
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_expression : String? = nil) : Response(OpenAPIClient::ComDayCqTaggingImplTagGarbageCollectorInfo)
      @conn.request(OpenAPIClient::ComDayCqTaggingImplTagGarbageCollectorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.expression" => scheduler_expression },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
