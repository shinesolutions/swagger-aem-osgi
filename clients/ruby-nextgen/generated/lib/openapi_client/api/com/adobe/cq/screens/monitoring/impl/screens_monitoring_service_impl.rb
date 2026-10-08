# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username: nil, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl',
          type: OpenapiClient::Models::ComAdobeCqScreensMonitoringImplScreensMonitoringServicHa8a83b4e,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username, 'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password' => com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password }
        )
      end
    end
  end
end
