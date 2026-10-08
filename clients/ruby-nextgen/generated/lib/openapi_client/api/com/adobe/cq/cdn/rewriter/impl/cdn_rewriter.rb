# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCdnRewriterImplCDNRewriter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, service_ranking: nil, cdnrewriter_attributes: nil, cdn_rewriter_distribution_domain: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter',
          type: OpenapiClient::Models::ComAdobeCqCdnRewriterImplCDNRewriterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'service.ranking' => service_ranking, 'cdnrewriter.attributes' => cdnrewriter_attributes, 'cdn.rewriter.distribution.domain' => cdn_rewriter_distribution_domain }
        )
      end
    end
  end
end
