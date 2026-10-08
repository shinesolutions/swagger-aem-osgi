# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_contentsync_pathrewritertransformer_mapping_links: nil, cq_contentsync_pathrewritertransformer_mapping_clientlibs: nil, cq_contentsync_pathrewritertransformer_mapping_images: nil, cq_contentsync_pathrewritertransformer_attribute_pattern: nil, cq_contentsync_pathrewritertransformer_clientlibrary_pattern: nil, cq_contentsync_pathrewritertransformer_clientlibrary_replace: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory',
          type: OpenapiClient::Models::ComDayCqWcmContentsyncImplRewriterPathRewriterTransfoH0c6951f8,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.contentsync.pathrewritertransformer.mapping.links' => cq_contentsync_pathrewritertransformer_mapping_links, 'cq.contentsync.pathrewritertransformer.mapping.clientlibs' => cq_contentsync_pathrewritertransformer_mapping_clientlibs, 'cq.contentsync.pathrewritertransformer.mapping.images' => cq_contentsync_pathrewritertransformer_mapping_images, 'cq.contentsync.pathrewritertransformer.attribute.pattern' => cq_contentsync_pathrewritertransformer_attribute_pattern, 'cq.contentsync.pathrewritertransformer.clientlibrary.pattern' => cq_contentsync_pathrewritertransformer_clientlibrary_pattern, 'cq.contentsync.pathrewritertransformer.clientlibrary.replace' => cq_contentsync_pathrewritertransformer_clientlibrary_replace }
        )
      end
    end
  end
end
