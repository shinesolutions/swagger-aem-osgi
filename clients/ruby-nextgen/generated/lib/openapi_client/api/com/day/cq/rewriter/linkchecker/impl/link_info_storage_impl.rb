# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_max_links_per_host: nil, service_save_external_link_references: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl',
          type: OpenapiClient::Models::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.max_links_per_host' => service_max_links_per_host, 'service.save_external_link_references' => service_save_external_link_references }
        )
      end
    end
  end
end
