require "json"

module OpenAPIClient
  module Api
  class OrgApacheFelixEventadminImplEventAdmin
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, org_apache_felix_eventadmin_thread_pool_size : Int32? = nil, org_apache_felix_eventadmin_async_to_sync_thread_ratio : Float64? = nil, org_apache_felix_eventadmin_timeout : Int32? = nil, org_apache_felix_eventadmin_require_topic : Bool? = nil, org_apache_felix_eventadmin_ignore_timeout : Array(String)? = nil, org_apache_felix_eventadmin_ignore_topic : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheFelixEventadminImplEventAdminInfo)
      @conn.request(OpenAPIClient::OrgApacheFelixEventadminImplEventAdminInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "org.apache.felix.eventadmin.ThreadPoolSize" => org_apache_felix_eventadmin_thread_pool_size, "org.apache.felix.eventadmin.AsyncToSyncThreadRatio" => org_apache_felix_eventadmin_async_to_sync_thread_ratio, "org.apache.felix.eventadmin.Timeout" => org_apache_felix_eventadmin_timeout, "org.apache.felix.eventadmin.RequireTopic" => org_apache_felix_eventadmin_require_topic, "org.apache.felix.eventadmin.IgnoreTimeout" => org_apache_felix_eventadmin_ignore_timeout, "org.apache.felix.eventadmin.IgnoreTopic" => org_apache_felix_eventadmin_ignore_topic },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
