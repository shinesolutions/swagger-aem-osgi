# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, mime_allow_empty: nil, mime_allowed: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter',
          type: OpenapiClient::Models::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'mime.allowEmpty' => mime_allow_empty, 'mime.allowed' => mime_allowed }
        )
      end
    end
  end
end
