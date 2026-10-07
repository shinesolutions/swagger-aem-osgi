require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, version_id : String? = nil, cache_on : Bool? = nil, concurrency_level : Int32? = nil, cache_start_size : Int32? = nil, cache_ttl : Int32? = nil, cache_size : Int32? = nil, time_limit : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "version.id" => version_id, "cache.on" => cache_on, "concurrency.level" => concurrency_level, "cache.start.size" => cache_start_size, "cache.ttl" => cache_ttl, "cache.size" => cache_size, "time.limit" => time_limit },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
