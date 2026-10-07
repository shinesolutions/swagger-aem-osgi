require "json"

module OpenAPIClient
  module Api
  class ComDayCrxSecurityTokenImplTokenCleanupTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable_token_cleanup_task : Bool? = nil, scheduler_expression : String? = nil, batch_size : Int32? = nil) : Response(OpenAPIClient::ComDayCrxSecurityTokenImplTokenCleanupTaskInfo)
      @conn.request(OpenAPIClient::ComDayCrxSecurityTokenImplTokenCleanupTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enable.token.cleanup.task" => enable_token_cleanup_task, "scheduler.expression" => scheduler_expression, "batch.size" => batch_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
