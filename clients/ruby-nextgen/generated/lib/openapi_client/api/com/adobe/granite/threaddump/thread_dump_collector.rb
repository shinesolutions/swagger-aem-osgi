# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteThreaddumpThreadDumpCollector
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduler_period: nil, scheduler_run_on: nil, granite_threaddump_enabled: nil, granite_threaddump_dumps_per_file: nil, granite_threaddump_enable_gzip_compression: nil, granite_threaddump_enable_directories_compression: nil, granite_threaddump_enable_j_stack: nil, granite_threaddump_max_backup_days: nil, granite_threaddump_backup_clean_trigger: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector',
          type: OpenapiClient::Models::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduler.period' => scheduler_period, 'scheduler.runOn' => scheduler_run_on, 'granite.threaddump.enabled' => granite_threaddump_enabled, 'granite.threaddump.dumpsPerFile' => granite_threaddump_dumps_per_file, 'granite.threaddump.enableGzipCompression' => granite_threaddump_enable_gzip_compression, 'granite.threaddump.enableDirectoriesCompression' => granite_threaddump_enable_directories_compression, 'granite.threaddump.enableJStack' => granite_threaddump_enable_j_stack, 'granite.threaddump.maxBackupDays' => granite_threaddump_max_backup_days, 'granite.threaddump.backupCleanTrigger' => granite_threaddump_backup_clean_trigger }
        )
      end
    end
  end
end
