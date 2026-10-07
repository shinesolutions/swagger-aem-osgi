# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrResourceInternalJcrSystemUserValidator
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, allow_only_system_user: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator',
          type: OpenapiClient::Models::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'allow.only.system.user' => allow_only_system_user }
        )
      end
    end
  end
end
