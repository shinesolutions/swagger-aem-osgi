# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteCsrfImplCSRFFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, filter_methods: nil, filter_enable_safe_user_agents: nil, filter_safe_user_agents: nil, filter_excluded_paths: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter',
          type: OpenapiClient::Models::ComAdobeGraniteCsrfImplCSRFFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'filter.methods' => filter_methods, 'filter.enable.safe.user.agents' => filter_enable_safe_user_agents, 'filter.safe.user.agents' => filter_safe_user_agents, 'filter.excluded.paths' => filter_excluded_paths }
        )
      end
    end
  end
end
