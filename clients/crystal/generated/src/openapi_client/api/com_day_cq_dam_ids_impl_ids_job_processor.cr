require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamIdsImplIDSJobProcessor
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, enable_multisession : Bool? = nil, ids_cc_enable : Bool? = nil, enable_retry : Bool? = nil, enable_retry_scripterror : Bool? = nil, externalizer_domain_cqhost : String? = nil, externalizer_domain_http : String? = nil) : Response(OpenAPIClient::ComDayCqDamIdsImplIDSJobProcessorInfo)
      @conn.request(OpenAPIClient::ComDayCqDamIdsImplIDSJobProcessorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "enable.multisession" => enable_multisession, "ids.cc.enable" => ids_cc_enable, "enable.retry" => enable_retry, "enable.retry.scripterror" => enable_retry_scripterror, "externalizer.domain.cqhost" => externalizer_domain_cqhost, "externalizer.domain.http" => externalizer_domain_http },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
