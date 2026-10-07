require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDtmImplServiceDTMWebServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, connection_timeout : Int32? = nil, socket_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDtmImplServiceDTMWebServiceImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDtmImplServiceDTMWebServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "connection.timeout" => connection_timeout, "socket.timeout" => socket_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
