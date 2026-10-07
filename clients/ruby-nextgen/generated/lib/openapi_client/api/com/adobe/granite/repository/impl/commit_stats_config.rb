# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRepositoryImplCommitStatsConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, interval_seconds: nil, commits_per_interval_threshold: nil, max_location_length: nil, max_details_shown: nil, min_details_percentage: nil, thread_matchers: nil, max_greedy_depth: nil, greedy_stack_matchers: nil, stack_filters: nil, stack_matchers: nil, stack_categorizers: nil, stack_shorteners: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig',
          type: OpenapiClient::Models::ComAdobeGraniteRepositoryImplCommitStatsConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'intervalSeconds' => interval_seconds, 'commitsPerIntervalThreshold' => commits_per_interval_threshold, 'maxLocationLength' => max_location_length, 'maxDetailsShown' => max_details_shown, 'minDetailsPercentage' => min_details_percentage, 'threadMatchers' => thread_matchers, 'maxGreedyDepth' => max_greedy_depth, 'greedyStackMatchers' => greedy_stack_matchers, 'stackFilters' => stack_filters, 'stackMatchers' => stack_matchers, 'stackCategorizers' => stack_categorizers, 'stackShorteners' => stack_shorteners }
        )
      end
    end
  end
end
