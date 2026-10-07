require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingCommonsLogLogManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_commons_log_level : String? = nil, org_apache_sling_commons_log_file : String? = nil, org_apache_sling_commons_log_file_number : Int32? = nil, org_apache_sling_commons_log_file_size : String? = nil, org_apache_sling_commons_log_pattern : String? = nil, org_apache_sling_commons_log_configuration_file : String? = nil, org_apache_sling_commons_log_packaging_data_enabled : Bool? = nil, org_apache_sling_commons_log_max_caller_data_depth : Int32? = nil, org_apache_sling_commons_log_max_old_file_count_in_dump : Int32? = nil, org_apache_sling_commons_log_num_of_lines : Int32? = nil) : Response(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingCommonsLogLogManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.commons.log.LogManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.commons.log.level" => org_apache_sling_commons_log_level, "org.apache.sling.commons.log.file" => org_apache_sling_commons_log_file, "org.apache.sling.commons.log.file.number" => org_apache_sling_commons_log_file_number, "org.apache.sling.commons.log.file.size" => org_apache_sling_commons_log_file_size, "org.apache.sling.commons.log.pattern" => org_apache_sling_commons_log_pattern, "org.apache.sling.commons.log.configurationFile" => org_apache_sling_commons_log_configuration_file, "org.apache.sling.commons.log.packagingDataEnabled" => org_apache_sling_commons_log_packaging_data_enabled, "org.apache.sling.commons.log.maxCallerDataDepth" => org_apache_sling_commons_log_max_caller_data_depth, "org.apache.sling.commons.log.maxOldFileCountInDump" => org_apache_sling_commons_log_max_old_file_count_in_dump, "org.apache.sling.commons.log.numOfLines" => org_apache_sling_commons_log_num_of_lines },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
