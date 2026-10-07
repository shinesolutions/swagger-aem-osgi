# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, linkcheckertransformer_disable_rewriting: nil, linkcheckertransformer_disable_checking: nil, linkcheckertransformer_map_cache_size: nil, linkcheckertransformer_strict_extension_check: nil, linkcheckertransformer_strip_htmlt_extension: nil, linkcheckertransformer_rewrite_elements: nil, linkcheckertransformer_strip_extension_path_blacklist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory',
          type: OpenapiClient::Models::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFH481a7801,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'linkcheckertransformer.disableRewriting' => linkcheckertransformer_disable_rewriting, 'linkcheckertransformer.disableChecking' => linkcheckertransformer_disable_checking, 'linkcheckertransformer.mapCacheSize' => linkcheckertransformer_map_cache_size, 'linkcheckertransformer.strictExtensionCheck' => linkcheckertransformer_strict_extension_check, 'linkcheckertransformer.stripHtmltExtension' => linkcheckertransformer_strip_htmlt_extension, 'linkcheckertransformer.rewriteElements' => linkcheckertransformer_rewrite_elements, 'linkcheckertransformer.stripExtensionPathBlacklist' => linkcheckertransformer_strip_extension_path_blacklist }
        )
      end
    end
  end
end
