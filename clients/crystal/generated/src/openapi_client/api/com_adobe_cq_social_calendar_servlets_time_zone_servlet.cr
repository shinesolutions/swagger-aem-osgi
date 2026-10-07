require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCalendarServletsTimeZoneServlet
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, timezones_expirytime : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "timezones.expirytime" => timezones_expirytime },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
