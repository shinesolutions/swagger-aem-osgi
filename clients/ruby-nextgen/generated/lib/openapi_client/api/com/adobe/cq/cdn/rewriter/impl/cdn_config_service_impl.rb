# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqCdnRewriterImplCDNConfigServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cdn_config_distribution_domain: nil, cdn_config_enable_rewriting: nil, cdn_config_path_prefixes: nil, cdn_config_cdnttl: nil, cdn_config_application_protocol: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cdn.config.distribution.domain' => cdn_config_distribution_domain, 'cdn.config.enable.rewriting' => cdn_config_enable_rewriting, 'cdn.config.path.prefixes' => cdn_config_path_prefixes, 'cdn.config.cdnttl' => cdn_config_cdnttl, 'cdn.config.application.protocol' => cdn_config_application_protocol }
        )
      end
    end
  end
end
