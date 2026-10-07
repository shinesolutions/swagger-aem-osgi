require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamScene7ImplScene7UploadServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_scene7_uploadservice_activejobtimeout_label : Int32? = nil, cq_dam_scene7_uploadservice_connectionmaxperroute_label : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamScene7ImplScene7UploadServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamScene7ImplScene7UploadServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.scene7.uploadservice.activejobtimeout.label" => cq_dam_scene7_uploadservice_activejobtimeout_label, "cq.dam.scene7.uploadservice.connectionmaxperroute.label" => cq_dam_scene7_uploadservice_connectionmaxperroute_label },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
