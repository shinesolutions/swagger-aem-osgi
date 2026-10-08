# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamCommonsUtilImplAssetCacheImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, large_file_min: nil, cache_apply: nil, mime_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl',
          type: OpenapiClient::Models::ComDayCqDamCommonsUtilImplAssetCacheImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'large.file.min' => large_file_min, 'cache.apply' => cache_apply, 'mime.types' => mime_types }
        )
      end
    end
  end
end
