# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, keypair_id: nil, keypair_alias: nil, cdnrewriter_attributes: nil, cdn_rewriter_distribution_domain: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter',
          type: OpenapiClient::Models::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'keypair.id' => keypair_id, 'keypair.alias' => keypair_alias, 'cdnrewriter.attributes' => cdnrewriter_attributes, 'cdn.rewriter.distribution.domain' => cdn_rewriter_distribution_domain }
        )
      end
    end
  end
end
