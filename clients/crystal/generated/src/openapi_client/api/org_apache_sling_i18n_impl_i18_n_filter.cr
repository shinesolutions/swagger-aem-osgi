require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingI18nImplI18NFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, sling_filter_scope : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingI18nImplI18NFilterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingI18nImplI18NFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "sling.filter.scope" => sling_filter_scope },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
