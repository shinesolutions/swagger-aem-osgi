require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDtmReactorImplServiceWebServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, endpoint_uri : String? = nil, connection_timeout : Int32? = nil, socket_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "endpointUri" => endpoint_uri, "connectionTimeout" => connection_timeout, "socketTimeout" => socket_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
