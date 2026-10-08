# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingTracerInternalLogTracer
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, tracer_sets: nil, enabled: nil, servlet_enabled: nil, recording_cache_size_in_mb: nil, recording_cache_duration_in_secs: nil, recording_compression_enabled: nil, gzip_response: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer',
          type: OpenapiClient::Models::OrgApacheSlingTracerInternalLogTracerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'tracerSets' => tracer_sets, 'enabled' => enabled, 'servletEnabled' => servlet_enabled, 'recordingCacheSizeInMB' => recording_cache_size_in_mb, 'recordingCacheDurationInSecs' => recording_cache_duration_in_secs, 'recordingCompressionEnabled' => recording_compression_enabled, 'gzipResponse' => gzip_response }
        )
      end
    end
  end
end
