

#include "ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.h"

using namespace Tiny;

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties()
{
	xmpfilterapply_whitelist = ConfigNodePropertyBoolean();
	xmpfilterwhitelist = ConfigNodePropertyArray();
	xmpfilterapply_blacklist = ConfigNodePropertyBoolean();
	xmpfilterblacklist = ConfigNodePropertyArray();
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::~ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties()
{

}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *xmpfilterapply_whitelistKey = "xmp.filter.apply_whitelist";

    if(object.has_key(xmpfilterapply_whitelistKey))
    {
        bourne::json value = object[xmpfilterapply_whitelistKey];




        ConfigNodePropertyBoolean* obj = &xmpfilterapply_whitelist;
		obj->fromJson(value.dump());

    }

    const char *xmpfilterwhitelistKey = "xmp.filter.whitelist";

    if(object.has_key(xmpfilterwhitelistKey))
    {
        bourne::json value = object[xmpfilterwhitelistKey];




        ConfigNodePropertyArray* obj = &xmpfilterwhitelist;
		obj->fromJson(value.dump());

    }

    const char *xmpfilterapply_blacklistKey = "xmp.filter.apply_blacklist";

    if(object.has_key(xmpfilterapply_blacklistKey))
    {
        bourne::json value = object[xmpfilterapply_blacklistKey];




        ConfigNodePropertyBoolean* obj = &xmpfilterapply_blacklist;
		obj->fromJson(value.dump());

    }

    const char *xmpfilterblacklistKey = "xmp.filter.blacklist";

    if(object.has_key(xmpfilterblacklistKey))
    {
        bourne::json value = object[xmpfilterblacklistKey];




        ConfigNodePropertyArray* obj = &xmpfilterblacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["xmpfilterapply_whitelist"] = getXmpfilterapplyWhitelist().toJson();






	object["xmpfilterwhitelist"] = getXmpfilterwhitelist().toJson();






	object["xmpfilterapply_blacklist"] = getXmpfilterapplyBlacklist().toJson();






	object["xmpfilterblacklist"] = getXmpfilterblacklist().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterapplyWhitelist()
{
	return xmpfilterapply_whitelist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterapplyWhitelist(ConfigNodePropertyBoolean xmpfilterapply_whitelist)
{
	this->xmpfilterapply_whitelist = xmpfilterapply_whitelist;
}

ConfigNodePropertyArray
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterwhitelist()
{
	return xmpfilterwhitelist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterwhitelist(ConfigNodePropertyArray xmpfilterwhitelist)
{
	this->xmpfilterwhitelist = xmpfilterwhitelist;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterapplyBlacklist()
{
	return xmpfilterapply_blacklist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterapplyBlacklist(ConfigNodePropertyBoolean xmpfilterapply_blacklist)
{
	this->xmpfilterapply_blacklist = xmpfilterapply_blacklist;
}

ConfigNodePropertyArray
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::getXmpfilterblacklist()
{
	return xmpfilterblacklist;
}

void
ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties::setXmpfilterblacklist(ConfigNodePropertyArray xmpfilterblacklist)
{
	this->xmpfilterblacklist = xmpfilterblacklist;
}



