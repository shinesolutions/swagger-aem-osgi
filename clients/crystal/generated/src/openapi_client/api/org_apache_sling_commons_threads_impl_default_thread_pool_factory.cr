require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, name : String? = nil, min_pool_size : Int32? = nil, max_pool_size : Int32? = nil, queue_size : Int32? = nil, max_thread_age : Int32? = nil, keep_alive_time : Int32? = nil, block_policy : String? = nil, shutdown_graceful : Bool? = nil, daemon : Bool? = nil, shutdown_wait_time : Int32? = nil, priority : String? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "name" => name, "minPoolSize" => min_pool_size, "maxPoolSize" => max_pool_size, "queueSize" => queue_size, "maxThreadAge" => max_thread_age, "keepAliveTime" => keep_alive_time, "blockPolicy" => block_policy, "shutdownGraceful" => shutdown_graceful, "daemon" => daemon, "shutdownWaitTime" => shutdown_wait_time, "priority" => priority },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
