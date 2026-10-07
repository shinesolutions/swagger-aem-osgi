# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name: nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name: nil, cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name: nil, cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name: nil, cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name: nil, cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name: nil, cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl',
          type: OpenapiClient::Models::ComDayCqDamS7damCommonVideoImplVideoProxyClientServHcfef8067,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name' => cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name, 'cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name' => cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name, 'cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name' => cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name, 'cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name' => cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name, 'cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name' => cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name, 'cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name' => cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name, 'cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name' => cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name }
        )
      end
    end
  end
end
