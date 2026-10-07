require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_commerce_cataloggenerator_bucketsize : Int32? = nil, cq_commerce_cataloggenerator_bucketname : String? = nil, cq_commerce_cataloggenerator_excludedtemplateproperties : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.commerce.cataloggenerator.bucketsize" => cq_commerce_cataloggenerator_bucketsize, "cq.commerce.cataloggenerator.bucketname" => cq_commerce_cataloggenerator_bucketname, "cq.commerce.cataloggenerator.excludedtemplateproperties" => cq_commerce_cataloggenerator_excludedtemplateproperties },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
