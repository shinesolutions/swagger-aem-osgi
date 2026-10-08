# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingXssImplXSSFilterImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, policy_path: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl',
          type: OpenapiClient::Models::OrgApacheSlingXssImplXSSFilterImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'policyPath' => policy_path }
        )
      end
    end
  end
end
