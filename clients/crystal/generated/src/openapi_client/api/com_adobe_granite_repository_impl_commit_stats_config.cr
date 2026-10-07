require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryImplCommitStatsConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enabled : Bool? = nil, interval_seconds : Int32? = nil, commits_per_interval_threshold : Int32? = nil, max_location_length : Int32? = nil, max_details_shown : Int32? = nil, min_details_percentage : Int32? = nil, thread_matchers : Array(String)? = nil, max_greedy_depth : Int32? = nil, greedy_stack_matchers : String? = nil, stack_filters : Array(String)? = nil, stack_matchers : Array(String)? = nil, stack_categorizers : Array(String)? = nil, stack_shorteners : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryImplCommitStatsConfigInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryImplCommitStatsConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enabled" => enabled, "intervalSeconds" => interval_seconds, "commitsPerIntervalThreshold" => commits_per_interval_threshold, "maxLocationLength" => max_location_length, "maxDetailsShown" => max_details_shown, "minDetailsPercentage" => min_details_percentage, "threadMatchers" => thread_matchers, "maxGreedyDepth" => max_greedy_depth, "greedyStackMatchers" => greedy_stack_matchers, "stackFilters" => stack_filters, "stackMatchers" => stack_matchers, "stackCategorizers" => stack_categorizers, "stackShorteners" => stack_shorteners },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
