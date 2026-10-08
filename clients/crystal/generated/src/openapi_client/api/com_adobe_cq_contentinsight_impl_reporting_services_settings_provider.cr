require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqContentinsightImplReportingServicesSettingsProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, reportingservices_url : String? = nil) : Response(OpenAPIClient::ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "reportingservices.url" => reportingservices_url },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
