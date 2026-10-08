require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name : Int32? = nil, cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name : Int32? = nil) : Response(OpenAPIClient::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name" => cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name, "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name" => cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name, "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name" => cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name, "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name" => cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name, "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name" => cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name, "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name" => cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name, "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name" => cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
