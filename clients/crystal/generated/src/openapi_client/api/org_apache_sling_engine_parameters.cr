require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingEngineParameters
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, sling_default_parameter_encoding : String? = nil, sling_default_max_parameters : Int32? = nil, file_location : String? = nil, file_threshold : Int32? = nil, file_max : Int32? = nil, request_max : Int32? = nil, sling_default_parameter_check_for_additional_container_parameters : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingEngineParametersInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingEngineParametersInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.engine.parameters",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "sling.default.parameter.encoding" => sling_default_parameter_encoding, "sling.default.max.parameters" => sling_default_max_parameters, "file.location" => file_location, "file.threshold" => file_threshold, "file.max" => file_max, "request.max" => request_max, "sling.default.parameter.checkForAdditionalContainerParameters" => sling_default_parameter_check_for_additional_container_parameters },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
