require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, commits_tracker_writer_groups : Array(String)? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "commitsTrackerWriterGroups" => commits_tracker_writer_groups },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
