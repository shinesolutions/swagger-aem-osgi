# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, sling_servlet_extensions: nil, sling_servlet_paths: nil, sling_servlet_methods: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet',
          type: OpenapiClient::Models::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPubliH9d70d1a0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'sling.servlet.extensions' => sling_servlet_extensions, 'sling.servlet.paths' => sling_servlet_paths, 'sling.servlet.methods' => sling_servlet_methods }
        )
      end
    end
  end
end
