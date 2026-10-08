require "json"

module OpenAPIClient
  module Api
  class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, linkcheckertransformer_disable_rewriting : Bool? = nil, linkcheckertransformer_disable_checking : Bool? = nil, linkcheckertransformer_map_cache_size : Int32? = nil, linkcheckertransformer_strict_extension_check : Bool? = nil, linkcheckertransformer_strip_htmlt_extension : Bool? = nil, linkcheckertransformer_rewrite_elements : Array(String)? = nil, linkcheckertransformer_strip_extension_path_blacklist : Array(String)? = nil) : Response(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo)
      @conn.request(OpenAPIClient::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "linkcheckertransformer.disableRewriting" => linkcheckertransformer_disable_rewriting, "linkcheckertransformer.disableChecking" => linkcheckertransformer_disable_checking, "linkcheckertransformer.mapCacheSize" => linkcheckertransformer_map_cache_size, "linkcheckertransformer.strictExtensionCheck" => linkcheckertransformer_strict_extension_check, "linkcheckertransformer.stripHtmltExtension" => linkcheckertransformer_strip_htmlt_extension, "linkcheckertransformer.rewriteElements" => linkcheckertransformer_rewrite_elements, "linkcheckertransformer.stripExtensionPathBlacklist" => linkcheckertransformer_strip_extension_path_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
