require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqInboxImplTypeproviderItemTypeProvider
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, inbox_impl_typeprovider_registrypaths : Array(String)? = nil, inbox_impl_typeprovider_legacypaths : Array(String)? = nil, inbox_impl_typeprovider_defaulturl_failureitem : String? = nil, inbox_impl_typeprovider_defaulturl_workitem : String? = nil, inbox_impl_typeprovider_defaulturl_task : String? = nil) : Response(OpenAPIClient::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo)
      @conn.request(OpenAPIClient::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "inbox.impl.typeprovider.registrypaths" => inbox_impl_typeprovider_registrypaths, "inbox.impl.typeprovider.legacypaths" => inbox_impl_typeprovider_legacypaths, "inbox.impl.typeprovider.defaulturl.failureitem" => inbox_impl_typeprovider_defaulturl_failureitem, "inbox.impl.typeprovider.defaulturl.workitem" => inbox_impl_typeprovider_defaulturl_workitem, "inbox.impl.typeprovider.defaulturl.task" => inbox_impl_typeprovider_defaulturl_task },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
