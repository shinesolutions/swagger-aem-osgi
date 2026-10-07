require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplMissingMetadataNotificationJob
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_missingmetadata_notification_scheduler_istimebased : Bool? = nil, cq_dam_missingmetadata_notification_scheduler_timebased_rule : String? = nil, cq_dam_missingmetadata_notification_scheduler_period_rule : Int32? = nil, cq_dam_missingmetadata_notification_recipient : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplMissingMetadataNotificationJobInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplMissingMetadataNotificationJobInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.missingmetadata.notification.scheduler.istimebased" => cq_dam_missingmetadata_notification_scheduler_istimebased, "cq.dam.missingmetadata.notification.scheduler.timebased.rule" => cq_dam_missingmetadata_notification_scheduler_timebased_rule, "cq.dam.missingmetadata.notification.scheduler.period.rule" => cq_dam_missingmetadata_notification_scheduler_period_rule, "cq.dam.missingmetadata.notification.recipient" => cq_dam_missingmetadata_notification_recipient },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
