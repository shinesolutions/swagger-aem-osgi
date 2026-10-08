# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingJcrDavexImplServletsSlingDavExServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, alias_: nil, dav_create_absolute_uri: nil, dav_protectedhandlers: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet',
          type: OpenapiClient::Models::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'alias' => alias_, 'dav.create-absolute-uri' => dav_create_absolute_uri, 'dav.protectedhandlers' => dav_protectedhandlers }
        )
      end
    end
  end
end
