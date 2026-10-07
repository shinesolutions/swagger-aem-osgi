# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamWebdavImplIoAssetIOHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, path_prefix: nil, create_version: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler',
          type: OpenapiClient::Models::ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'pathPrefix' => path_prefix, 'createVersion' => create_version }
        )
      end
    end
  end
end
