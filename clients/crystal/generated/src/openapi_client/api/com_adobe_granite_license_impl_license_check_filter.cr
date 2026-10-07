require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteLicenseImplLicenseCheckFilter
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, check_internval : Int32? = nil, exclude_ids : Array(String)? = nil, encrypt_ping : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "checkInternval" => check_internval, "excludeIds" => exclude_ids, "encryptPing" => encrypt_ping },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
