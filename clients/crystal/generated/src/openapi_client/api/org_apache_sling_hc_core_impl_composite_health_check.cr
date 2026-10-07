require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingHcCoreImplCompositeHealthCheck
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, hc_name : String? = nil, hc_tags : Array(String)? = nil, hc_mbean_name : String? = nil, filter_tags : Array(String)? = nil, filter_combine_tags_with_or : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingHcCoreImplCompositeHealthCheckInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingHcCoreImplCompositeHealthCheckInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "hc.name" => hc_name, "hc.tags" => hc_tags, "hc.mbean.name" => hc_mbean_name, "filter.tags" => filter_tags, "filter.combineTagsWithOr" => filter_combine_tags_with_or },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
