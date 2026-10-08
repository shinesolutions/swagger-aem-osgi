require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path : Array(String)? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency : String? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout : Int32? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients : String? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver : String? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport : Int32? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls : Bool? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username : String? = nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password : String? = nil) : Response(OpenAPIClient::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username, "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password" => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
