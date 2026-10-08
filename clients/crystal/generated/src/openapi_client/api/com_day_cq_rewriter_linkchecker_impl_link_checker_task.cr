require "json"

module OpenAPIClient
  module Api
  class ComDayCqRewriterLinkcheckerImplLinkCheckerTask
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_period : Int32? = nil, scheduler_concurrent : Bool? = nil, good_link_test_interval : Int32? = nil, bad_link_test_interval : Int32? = nil, link_unused_interval : Int32? = nil, connection_timeout : Int32? = nil) : Response(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo)
      @conn.request(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.period" => scheduler_period, "scheduler.concurrent" => scheduler_concurrent, "good_link_test_interval" => good_link_test_interval, "bad_link_test_interval" => bad_link_test_interval, "link_unused_interval" => link_unused_interval, "connection.timeout" => connection_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
