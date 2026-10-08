# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable_data_triggered_content: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag',
          type: OpenapiClient::Models::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enableDataTriggeredContent' => enable_data_triggered_content }
        )
      end
    end
  end
end
