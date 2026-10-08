require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEventImplJobsJobConsumerManager
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_sling_installer_configuration_persist : Bool? = nil, job_consumermanager_whitelist : Array(String)? = nil, job_consumermanager_blacklist : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheSlingEventImplJobsJobConsumerManagerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEventImplJobsJobConsumerManagerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.sling.installer.configuration.persist" => org_apache_sling_installer_configuration_persist, "job.consumermanager.whitelist" => job_consumermanager_whitelist, "job.consumermanager.blacklist" => job_consumermanager_blacklist },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
