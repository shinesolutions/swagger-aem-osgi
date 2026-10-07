# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_aem_screens_impl_remote_request_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.aem.screens.impl.remote.request_timeout' => com_adobe_aem_screens_impl_remote_request_timeout }
        )
      end
    end
  end
end
