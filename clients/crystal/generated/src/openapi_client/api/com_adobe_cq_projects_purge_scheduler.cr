require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqProjectsPurgeScheduler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduledpurge_name : String? = nil, scheduledpurge_purge_active : Bool? = nil, scheduledpurge_templates : Array(String)? = nil, scheduledpurge_purge_groups : Bool? = nil, scheduledpurge_purge_assets : Bool? = nil, scheduledpurge_terminate_running_workflows : Bool? = nil, scheduledpurge_daysold : Int32? = nil, scheduledpurge_save_threshold : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqProjectsPurgeSchedulerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqProjectsPurgeSchedulerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduledpurge.name" => scheduledpurge_name, "scheduledpurge.purgeActive" => scheduledpurge_purge_active, "scheduledpurge.templates" => scheduledpurge_templates, "scheduledpurge.purgeGroups" => scheduledpurge_purge_groups, "scheduledpurge.purgeAssets" => scheduledpurge_purge_assets, "scheduledpurge.terminateRunningWorkflows" => scheduledpurge_terminate_running_workflows, "scheduledpurge.daysold" => scheduledpurge_daysold, "scheduledpurge.saveThreshold" => scheduledpurge_save_threshold },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
