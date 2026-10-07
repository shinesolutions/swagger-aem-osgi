

#include "ComDayCqWcmFoundationFormsImplMailServletProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplMailServletProperties::ComDayCqWcmFoundationFormsImplMailServletProperties()
{
	slingservletresourceTypes = ConfigNodePropertyString();
	slingservletselectors = ConfigNodePropertyString();
	resourcewhitelist = ConfigNodePropertyArray();
	resourceblacklist = ConfigNodePropertyString();
}

ComDayCqWcmFoundationFormsImplMailServletProperties::ComDayCqWcmFoundationFormsImplMailServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplMailServletProperties::~ComDayCqWcmFoundationFormsImplMailServletProperties()
{

}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletresourceTypesKey = "sling.servlet.resourceTypes";

    if(object.has_key(slingservletresourceTypesKey))
    {
        bourne::json value = object[slingservletresourceTypesKey];




        ConfigNodePropertyString* obj = &slingservletresourceTypes;
		obj->fromJson(value.dump());

    }

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyString* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }

    const char *resourcewhitelistKey = "resource.whitelist";

    if(object.has_key(resourcewhitelistKey))
    {
        bourne::json value = object[resourcewhitelistKey];




        ConfigNodePropertyArray* obj = &resourcewhitelist;
		obj->fromJson(value.dump());

    }

    const char *resourceblacklistKey = "resource.blacklist";

    if(object.has_key(resourceblacklistKey))
    {
        bourne::json value = object[resourceblacklistKey];




        ConfigNodePropertyString* obj = &resourceblacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplMailServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletresourceTypes"] = getSlingservletresourceTypes().toJson();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["resourcewhitelist"] = getResourcewhitelist().toJson();






	object["resourceblacklist"] = getResourceblacklist().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getSlingservletresourceTypes()
{
	return slingservletresourceTypes;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setSlingservletresourceTypes(ConfigNodePropertyString slingservletresourceTypes)
{
	this->slingservletresourceTypes = slingservletresourceTypes;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationFormsImplMailServletProperties::getResourcewhitelist()
{
	return resourcewhitelist;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setResourcewhitelist(ConfigNodePropertyArray resourcewhitelist)
{
	this->resourcewhitelist = resourcewhitelist;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplMailServletProperties::getResourceblacklist()
{
	return resourceblacklist;
}

void
ComDayCqWcmFoundationFormsImplMailServletProperties::setResourceblacklist(ConfigNodePropertyString resourceblacklist)
{
	this->resourceblacklist = resourceblacklist;
}



