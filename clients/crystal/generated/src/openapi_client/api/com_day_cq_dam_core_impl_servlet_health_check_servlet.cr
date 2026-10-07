require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplServletHealthCheckServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_sync_workflow_id : String? = nil, cq_dam_sync_folder_types : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplServletHealthCheckServletInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplServletHealthCheckServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.sync.workflow.id" => cq_dam_sync_workflow_id, "cq.dam.sync.folder.types" => cq_dam_sync_folder_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
