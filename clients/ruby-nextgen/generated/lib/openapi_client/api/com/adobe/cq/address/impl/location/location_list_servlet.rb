# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqAddressImplLocationLocationListServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_address_location_default_max_results: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet',
          type: OpenapiClient::Models::ComAdobeCqAddressImplLocationLocationListServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.address.location.default.maxResults' => cq_address_location_default_max_results }
        )
      end
    end
  end
end
