require "json"

module OpenAPIClient
  module Api
  class ComDayCqReportingImplConfigServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, repconf_timezone : String? = nil, repconf_locale : String? = nil, repconf_snapshots : String? = nil, repconf_repdir : String? = nil, repconf_hourofday : Int32? = nil, repconf_minofhour : Int32? = nil, repconf_maxrows : Int32? = nil, repconf_fakedata : Bool? = nil, repconf_snapshotuser : String? = nil, repconf_enforcesnapshotuser : Bool? = nil) : Response(OpenAPIClient::ComDayCqReportingImplConfigServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReportingImplConfigServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "repconf.timezone" => repconf_timezone, "repconf.locale" => repconf_locale, "repconf.snapshots" => repconf_snapshots, "repconf.repdir" => repconf_repdir, "repconf.hourofday" => repconf_hourofday, "repconf.minofhour" => repconf_minofhour, "repconf.maxrows" => repconf_maxrows, "repconf.fakedata" => repconf_fakedata, "repconf.snapshotuser" => repconf_snapshotuser, "repconf.enforcesnapshotuser" => repconf_enforcesnapshotuser },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
