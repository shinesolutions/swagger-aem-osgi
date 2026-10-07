# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamCfmImplContentRewriterAssetProcessor
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, pipeline_type: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor',
          type: OpenapiClient::Models::ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'pipeline.type' => pipeline_type }
        )
      end
    end
  end
end
