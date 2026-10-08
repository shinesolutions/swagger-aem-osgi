require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, parameter_guava_cache_enabled : Bool? = nil, parameter_guava_cache_params : String? = nil, parameter_guava_cache_reload : Bool? = nil, service_ranking : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "parameter.guava.cache.enabled" => parameter_guava_cache_enabled, "parameter.guava.cache.params" => parameter_guava_cache_params, "parameter.guava.cache.reload" => parameter_guava_cache_reload, "service.ranking" => service_ranking },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
