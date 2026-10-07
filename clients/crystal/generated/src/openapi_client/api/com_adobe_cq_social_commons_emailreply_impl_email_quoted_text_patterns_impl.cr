require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, pattern_time : String? = nil, pattern_newline : String? = nil, pattern_day_of_month : String? = nil, pattern_month : String? = nil, pattern_year : String? = nil, pattern_date : String? = nil, pattern_date_time : String? = nil, pattern_email : String? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "pattern.time" => pattern_time, "pattern.newline" => pattern_newline, "pattern.dayOfMonth" => pattern_day_of_month, "pattern.month" => pattern_month, "pattern.year" => pattern_year, "pattern.date" => pattern_date, "pattern.dateTime" => pattern_date_time, "pattern.email" => pattern_email },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
