require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqWcmLaunchesImplLaunchesEventHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, event_filter : String? = nil, launches_eventhandler_threadpool_maxsize : Int32? = nil, launches_eventhandler_threadpool_priority : String? = nil, launches_eventhandler_updatelastmodification : Bool? = nil) : Response(OpenAPIClient::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "event.filter" => event_filter, "launches.eventhandler.threadpool.maxsize" => launches_eventhandler_threadpool_maxsize, "launches.eventhandler.threadpool.priority" => launches_eventhandler_threadpool_priority, "launches.eventhandler.updatelastmodification" => launches_eventhandler_updatelastmodification },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
