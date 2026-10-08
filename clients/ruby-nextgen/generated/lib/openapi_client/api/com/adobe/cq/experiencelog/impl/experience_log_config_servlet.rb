# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqExperiencelogImplExperienceLogConfigServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enabled: nil, disabled_for_groups: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet',
          type: OpenapiClient::Models::ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enabled' => enabled, 'disabledForGroups' => disabled_for_groups }
        )
      end
    end
  end
end
