require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsLogLogManagerFactoryWriter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_commons_log_file : String? = nil, org_apache_sling_commons_log_file_number : Int32? = nil, org_apache_sling_commons_log_file_size : String? = nil, org_apache_sling_commons_log_file_buffered : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.commons.log.file" => org_apache_sling_commons_log_file, "org.apache.sling.commons.log.file.number" => org_apache_sling_commons_log_file_number, "org.apache.sling.commons.log.file.size" => org_apache_sling_commons_log_file_size, "org.apache.sling.commons.log.file.buffered" => org_apache_sling_commons_log_file_buffered },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
