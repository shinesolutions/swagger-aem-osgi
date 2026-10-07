# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamCommonsHandlerStandardImageHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, large_file_threshold: nil, large_comment_threshold: nil, cq_dam_enable_ext_meta_extraction: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler',
          type: OpenapiClient::Models::ComDayCqDamCommonsHandlerStandardImageHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'large_file_threshold' => large_file_threshold, 'large_comment_threshold' => large_comment_threshold, 'cq.dam.enable.ext.meta.extraction' => cq_dam_enable_ext_meta_extraction }
        )
      end
    end
  end
end
