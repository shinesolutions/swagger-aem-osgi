require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteThreaddumpThreadDumpCollector
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scheduler_period : Int32? = nil, scheduler_run_on : String? = nil, granite_threaddump_enabled : Bool? = nil, granite_threaddump_dumps_per_file : Int32? = nil, granite_threaddump_enable_gzip_compression : Bool? = nil, granite_threaddump_enable_directories_compression : Bool? = nil, granite_threaddump_enable_j_stack : Bool? = nil, granite_threaddump_max_backup_days : Int32? = nil, granite_threaddump_backup_clean_trigger : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scheduler.period" => scheduler_period, "scheduler.runOn" => scheduler_run_on, "granite.threaddump.enabled" => granite_threaddump_enabled, "granite.threaddump.dumpsPerFile" => granite_threaddump_dumps_per_file, "granite.threaddump.enableGzipCompression" => granite_threaddump_enable_gzip_compression, "granite.threaddump.enableDirectoriesCompression" => granite_threaddump_enable_directories_compression, "granite.threaddump.enableJStack" => granite_threaddump_enable_j_stack, "granite.threaddump.maxBackupDays" => granite_threaddump_max_backup_days, "granite.threaddump.backupCleanTrigger" => granite_threaddump_backup_clean_trigger },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
