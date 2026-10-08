require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteRepositoryServiceUserConfiguration
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, service_ranking : Int32? = nil, serviceusers_simple_subject_population : Bool? = nil, serviceusers_list : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeGraniteRepositoryServiceUserConfigurationInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteRepositoryServiceUserConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "service.ranking" => service_ranking, "serviceusers.simpleSubjectPopulation" => serviceusers_simple_subject_population, "serviceusers.list" => serviceusers_list },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
