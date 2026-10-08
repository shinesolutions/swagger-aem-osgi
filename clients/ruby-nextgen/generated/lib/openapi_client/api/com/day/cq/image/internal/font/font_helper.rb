# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqImageInternalFontFontHelper
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, fontpath: nil, oversampling_factor: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.image.internal.font.FontHelper',
          type: OpenapiClient::Models::ComDayCqImageInternalFontFontHelperInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'fontpath' => fontpath, 'oversamplingFactor' => oversampling_factor }
        )
      end
    end
  end
end
