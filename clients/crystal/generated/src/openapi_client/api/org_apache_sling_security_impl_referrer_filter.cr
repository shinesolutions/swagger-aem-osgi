require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingSecurityImplReferrerFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, allow_empty : Bool? = nil, allow_hosts : Array(String)? = nil, allow_hosts_regexp : Array(String)? = nil, filter_methods : Array(String)? = nil, exclude_agents_regexp : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingSecurityImplReferrerFilterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingSecurityImplReferrerFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "allow.empty" => allow_empty, "allow.hosts" => allow_hosts, "allow.hosts.regexp" => allow_hosts_regexp, "filter.methods" => filter_methods, "exclude.agents.regexp" => exclude_agents_regexp },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
