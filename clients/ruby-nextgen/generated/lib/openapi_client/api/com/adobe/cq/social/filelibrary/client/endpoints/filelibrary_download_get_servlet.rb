# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGetServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_selectors: nil, sling_servlet_extensions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet',
          type: OpenapiClient::Models::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDH7ba452a7,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.selectors' => sling_servlet_selectors, 'sling.servlet.extensions' => sling_servlet_extensions }
        )
      end
    end
  end
end
