

#include "OrgApacheSlingAuthCoreImplLogoutServletProperties.h"

using namespace Tiny;

OrgApacheSlingAuthCoreImplLogoutServletProperties::OrgApacheSlingAuthCoreImplLogoutServletProperties()
{
	slingservletmethods = ConfigNodePropertyArray();
	slingservletpaths = ConfigNodePropertyString();
}

OrgApacheSlingAuthCoreImplLogoutServletProperties::OrgApacheSlingAuthCoreImplLogoutServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingAuthCoreImplLogoutServletProperties::~OrgApacheSlingAuthCoreImplLogoutServletProperties()
{

}

void
OrgApacheSlingAuthCoreImplLogoutServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyArray* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }

    const char *slingservletpathsKey = "sling.servlet.paths";

    if(object.has_key(slingservletpathsKey))
    {
        bourne::json value = object[slingservletpathsKey];




        ConfigNodePropertyString* obj = &slingservletpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingAuthCoreImplLogoutServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletmethods"] = getSlingservletmethods().toJson();






	object["slingservletpaths"] = getSlingservletpaths().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingAuthCoreImplLogoutServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
OrgApacheSlingAuthCoreImplLogoutServletProperties::setSlingservletmethods(ConfigNodePropertyArray slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}

ConfigNodePropertyString
OrgApacheSlingAuthCoreImplLogoutServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
OrgApacheSlingAuthCoreImplLogoutServletProperties::setSlingservletpaths(ConfigNodePropertyString slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}



