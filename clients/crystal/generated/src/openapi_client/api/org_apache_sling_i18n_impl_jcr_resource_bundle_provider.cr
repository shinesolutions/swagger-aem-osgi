require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingI18nImplJcrResourceBundleProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, locale_default : String? = nil, preload_bundles : Bool? = nil, invalidation_delay : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "locale.default" => locale_default, "preload.bundles" => preload_bundles, "invalidation.delay" => invalidation_delay },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
