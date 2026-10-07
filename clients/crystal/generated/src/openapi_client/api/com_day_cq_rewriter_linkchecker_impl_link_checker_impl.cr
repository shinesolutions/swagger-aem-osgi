require "json"

module OpenAPIClient
  module Api
  class ComDayCqRewriterLinkcheckerImplLinkCheckerImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_period : Int32? = nil, scheduler_concurrent : Bool? = nil, service_bad_link_tolerance_interval : Int32? = nil, service_check_override_patterns : Array(String)? = nil, service_cache_broken_internal_links : Bool? = nil, service_special_link_prefix : Array(String)? = nil, service_special_link_patterns : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo)
      @conn.request(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.period" => scheduler_period, "scheduler.concurrent" => scheduler_concurrent, "service.bad_link_tolerance_interval" => service_bad_link_tolerance_interval, "service.check_override_patterns" => service_check_override_patterns, "service.cache_broken_internal_links" => service_cache_broken_internal_links, "service.special_link_prefix" => service_special_link_prefix, "service.special_link_patterns" => service_special_link_patterns },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
