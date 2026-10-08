require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsLogLogManagerFactoryConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_commons_log_level : String? = nil, org_apache_sling_commons_log_file : String? = nil, org_apache_sling_commons_log_pattern : String? = nil, org_apache_sling_commons_log_names : Array(String)? = nil, org_apache_sling_commons_log_additiv : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.commons.log.level" => org_apache_sling_commons_log_level, "org.apache.sling.commons.log.file" => org_apache_sling_commons_log_file, "org.apache.sling.commons.log.pattern" => org_apache_sling_commons_log_pattern, "org.apache.sling.commons.log.names" => org_apache_sling_commons_log_names, "org.apache.sling.commons.log.additiv" => org_apache_sling_commons_log_additiv },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
