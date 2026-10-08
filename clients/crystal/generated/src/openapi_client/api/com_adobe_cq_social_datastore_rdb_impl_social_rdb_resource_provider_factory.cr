require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, solr_zk_timeout : String? = nil, solr_commit : String? = nil, cache_on : Bool? = nil, concurrency_level : Int32? = nil, cache_start_size : Int32? = nil, cache_ttl : Int32? = nil, cache_size : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "solr.zk.timeout" => solr_zk_timeout, "solr.commit" => solr_commit, "cache.on" => cache_on, "concurrency.level" => concurrency_level, "cache.start.size" => cache_start_size, "cache.ttl" => cache_ttl, "cache.size" => cache_size },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
