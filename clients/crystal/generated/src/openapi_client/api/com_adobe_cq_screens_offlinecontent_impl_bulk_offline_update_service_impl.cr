require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path : Array(String)? = nil, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency : String? = nil) : Response(OpenAPIClient::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath" => com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path, "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency" => com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
