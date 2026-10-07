require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsSchedulerImplQuartzScheduler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pool_name : String? = nil, allowed_pool_names : Array(String)? = nil, scheduler_useleaderforsingle : Bool? = nil, metrics_filters : Array(String)? = nil, slow_threshold_millis : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "poolName" => pool_name, "allowedPoolNames" => allowed_pool_names, "scheduler.useleaderforsingle" => scheduler_useleaderforsingle, "metrics.filters" => metrics_filters, "slowThresholdMillis" => slow_threshold_millis },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
