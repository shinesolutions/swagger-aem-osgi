require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamCoreImplExpiryNotificationJobImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_expiry_notification_scheduler_istimebased : Bool? = nil, cq_dam_expiry_notification_scheduler_timebased_rule : String? = nil, cq_dam_expiry_notification_scheduler_period_rule : Int32? = nil, send_email : Bool? = nil, asset_expired_limit : Int32? = nil, prior_notification_seconds : Int32? = nil, cq_dam_expiry_notification_url_protocol : String? = nil) : Response(OpenAPIClient::ComDayCqDamCoreImplExpiryNotificationJobImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamCoreImplExpiryNotificationJobImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.expiry.notification.scheduler.istimebased" => cq_dam_expiry_notification_scheduler_istimebased, "cq.dam.expiry.notification.scheduler.timebased.rule" => cq_dam_expiry_notification_scheduler_timebased_rule, "cq.dam.expiry.notification.scheduler.period.rule" => cq_dam_expiry_notification_scheduler_period_rule, "send_email" => send_email, "asset_expired_limit" => asset_expired_limit, "prior_notification_seconds" => prior_notification_seconds, "cq.dam.expiry.notification.url.protocol" => cq_dam_expiry_notification_url_protocol },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
