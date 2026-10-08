require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploads
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, number_of_days : Int32? = nil, age_of_file : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo)
      @conn.request(OpenAPIClient::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "numberOfDays" => number_of_days, "ageOfFile" => age_of_file },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
