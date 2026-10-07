# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamInddImplServletSnippetCreationServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, snippetcreation_maxcollections: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet',
          type: OpenapiClient::Models::ComDayCqDamInddImplServletSnippetCreationServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'snippetcreation.maxcollections' => snippetcreation_maxcollections }
        )
      end
    end
  end
end
