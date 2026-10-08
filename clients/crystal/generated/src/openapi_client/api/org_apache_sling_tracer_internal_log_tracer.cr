require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingTracerInternalLogTracer
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, tracer_sets : Array(String)? = nil, enabled : Bool? = nil, servlet_enabled : Bool? = nil, recording_cache_size_in_mb : Int32? = nil, recording_cache_duration_in_secs : Int32? = nil, recording_compression_enabled : Bool? = nil, gzip_response : Bool? = nil) : Response(OpenAPIClient::OrgApacheSlingTracerInternalLogTracerInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingTracerInternalLogTracerInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "tracerSets" => tracer_sets, "enabled" => enabled, "servletEnabled" => servlet_enabled, "recordingCacheSizeInMB" => recording_cache_size_in_mb, "recordingCacheDurationInSecs" => recording_cache_duration_in_secs, "recordingCompressionEnabled" => recording_compression_enabled, "gzipResponse" => gzip_response },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
