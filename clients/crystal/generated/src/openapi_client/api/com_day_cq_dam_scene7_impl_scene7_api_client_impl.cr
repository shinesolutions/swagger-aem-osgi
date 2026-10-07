require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamScene7ImplScene7APIClientImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_scene7_apiclient_recordsperpage_nofilter_name : Int32? = nil, cq_dam_scene7_apiclient_recordsperpage_withfilter_name : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamScene7ImplScene7APIClientImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamScene7ImplScene7APIClientImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.scene7.apiclient.recordsperpage.nofilter.name" => cq_dam_scene7_apiclient_recordsperpage_nofilter_name, "cq.dam.scene7.apiclient.recordsperpage.withfilter.name" => cq_dam_scene7_apiclient_recordsperpage_withfilter_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
