# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactoryAmended
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, resource_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended',
          type: OpenapiClient::Models::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterSH778409c4,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'resource.types' => resource_types }
        )
      end
    end
  end
end
