require "json"

module OpenAPIClient
  module Api
  class AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, show_placeholder : Bool? = nil, maximum_cache_entries : Int32? = nil, af_scripting_compatversion : String? = nil, make_file_name_unique : Bool? = nil, generating_compliant_data : Bool? = nil) : Response(OpenAPIClient::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo)
      @conn.request(OpenAPIClient::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "showPlaceholder" => show_placeholder, "maximumCacheEntries" => maximum_cache_entries, "af.scripting.compatversion" => af_scripting_compatversion, "makeFileNameUnique" => make_file_name_unique, "generatingCompliantData" => generating_compliant_data },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
