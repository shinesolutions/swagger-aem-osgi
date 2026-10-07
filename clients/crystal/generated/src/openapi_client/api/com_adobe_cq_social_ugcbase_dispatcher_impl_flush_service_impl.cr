require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, thread_pool_size : Int32? = nil, delay_time : Int32? = nil, worker_sleep_time : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "threadPoolSize" => thread_pool_size, "delayTime" => delay_time, "workerSleepTime" => worker_sleep_time },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
