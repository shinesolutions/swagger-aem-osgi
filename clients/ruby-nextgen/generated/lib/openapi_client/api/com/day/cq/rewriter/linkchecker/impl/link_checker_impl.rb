# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqRewriterLinkcheckerImplLinkCheckerImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_period: nil, scheduler_concurrent: nil, service_bad_link_tolerance_interval: nil, service_check_override_patterns: nil, service_cache_broken_internal_links: nil, service_special_link_prefix: nil, service_special_link_patterns: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl',
          type: OpenapiClient::Models::ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.period' => scheduler_period, 'scheduler.concurrent' => scheduler_concurrent, 'service.bad_link_tolerance_interval' => service_bad_link_tolerance_interval, 'service.check_override_patterns' => service_check_override_patterns, 'service.cache_broken_internal_links' => service_cache_broken_internal_links, 'service.special_link_prefix' => service_special_link_prefix, 'service.special_link_patterns' => service_special_link_patterns }
        )
      end
    end
  end
end
