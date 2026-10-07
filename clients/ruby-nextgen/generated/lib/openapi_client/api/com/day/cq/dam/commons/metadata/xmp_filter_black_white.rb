# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamCommonsMetadataXmpFilterBlackWhite
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, xmp_filter_apply_whitelist: nil, xmp_filter_whitelist: nil, xmp_filter_apply_blacklist: nil, xmp_filter_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite',
          type: OpenapiClient::Models::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'xmp.filter.apply_whitelist' => xmp_filter_apply_whitelist, 'xmp.filter.whitelist' => xmp_filter_whitelist, 'xmp.filter.apply_blacklist' => xmp_filter_apply_blacklist, 'xmp.filter.blacklist' => xmp_filter_blacklist }
        )
      end
    end
  end
end
