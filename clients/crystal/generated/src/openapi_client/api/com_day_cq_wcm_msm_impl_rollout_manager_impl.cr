require "json"

module OpenAPIClient
  module Api
  class ComDayCqWcmMsmImplRolloutManagerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, rolloutmgr_excludedprops_default : Array(String)? = nil, rolloutmgr_excludedparagraphprops_default : Array(String)? = nil, rolloutmgr_excludednodetypes_default : Array(String)? = nil, rolloutmgr_threadpool_maxsize : Int32? = nil, rolloutmgr_threadpool_maxshutdowntime : Int32? = nil, rolloutmgr_threadpool_priority : String? = nil, rolloutmgr_commit_size : Int32? = nil, rolloutmgr_conflicthandling_enabled : Bool? = nil) : Response(OpenAPIClient::ComDayCqWcmMsmImplRolloutManagerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqWcmMsmImplRolloutManagerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "rolloutmgr.excludedprops.default" => rolloutmgr_excludedprops_default, "rolloutmgr.excludedparagraphprops.default" => rolloutmgr_excludedparagraphprops_default, "rolloutmgr.excludednodetypes.default" => rolloutmgr_excludednodetypes_default, "rolloutmgr.threadpool.maxsize" => rolloutmgr_threadpool_maxsize, "rolloutmgr.threadpool.maxshutdowntime" => rolloutmgr_threadpool_maxshutdowntime, "rolloutmgr.threadpool.priority" => rolloutmgr_threadpool_priority, "rolloutmgr.commit.size" => rolloutmgr_commit_size, "rolloutmgr.conflicthandling.enabled" => rolloutmgr_conflicthandling_enabled },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
