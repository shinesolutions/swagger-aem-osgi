

#include "ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties()
{
	cqdamadhocassetshareprezipmaxcontentsize = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::~ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties()
{

}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamadhocassetshareprezipmaxcontentsizeKey = "cq.dam.adhoc.asset.share.prezip.maxcontentsize";

    if(object.has_key(cqdamadhocassetshareprezipmaxcontentsizeKey))
    {
        bourne::json value = object[cqdamadhocassetshareprezipmaxcontentsizeKey];




        ConfigNodePropertyInteger* obj = &cqdamadhocassetshareprezipmaxcontentsize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamadhocassetshareprezipmaxcontentsize"] = getCqdamadhocassetshareprezipmaxcontentsize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::getCqdamadhocassetshareprezipmaxcontentsize()
{
	return cqdamadhocassetshareprezipmaxcontentsize;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties::setCqdamadhocassetshareprezipmaxcontentsize(ConfigNodePropertyInteger cqdamadhocassetshareprezipmaxcontentsize)
{
	this->cqdamadhocassetshareprezipmaxcontentsize = cqdamadhocassetshareprezipmaxcontentsize;
}



