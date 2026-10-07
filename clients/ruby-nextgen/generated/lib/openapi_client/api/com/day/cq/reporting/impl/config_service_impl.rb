# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReportingImplConfigServiceImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, repconf_timezone: nil, repconf_locale: nil, repconf_snapshots: nil, repconf_repdir: nil, repconf_hourofday: nil, repconf_minofhour: nil, repconf_maxrows: nil, repconf_fakedata: nil, repconf_snapshotuser: nil, repconf_enforcesnapshotuser: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl',
          type: OpenapiClient::Models::ComDayCqReportingImplConfigServiceImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'repconf.timezone' => repconf_timezone, 'repconf.locale' => repconf_locale, 'repconf.snapshots' => repconf_snapshots, 'repconf.repdir' => repconf_repdir, 'repconf.hourofday' => repconf_hourofday, 'repconf.minofhour' => repconf_minofhour, 'repconf.maxrows' => repconf_maxrows, 'repconf.fakedata' => repconf_fakedata, 'repconf.snapshotuser' => repconf_snapshotuser, 'repconf.enforcesnapshotuser' => repconf_enforcesnapshotuser }
        )
      end
    end
  end
end
