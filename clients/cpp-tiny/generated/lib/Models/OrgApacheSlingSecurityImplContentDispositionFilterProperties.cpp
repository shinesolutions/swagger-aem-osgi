

#include "OrgApacheSlingSecurityImplContentDispositionFilterProperties.h"

using namespace Tiny;

OrgApacheSlingSecurityImplContentDispositionFilterProperties::OrgApacheSlingSecurityImplContentDispositionFilterProperties()
{
	slingcontentdispositionpaths = ConfigNodePropertyArray();
	slingcontentdispositionexcludedpaths = ConfigNodePropertyArray();
	slingcontentdispositionallpaths = ConfigNodePropertyBoolean();
}

OrgApacheSlingSecurityImplContentDispositionFilterProperties::OrgApacheSlingSecurityImplContentDispositionFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingSecurityImplContentDispositionFilterProperties::~OrgApacheSlingSecurityImplContentDispositionFilterProperties()
{

}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingcontentdispositionpathsKey = "sling.content.disposition.paths";

    if(object.has_key(slingcontentdispositionpathsKey))
    {
        bourne::json value = object[slingcontentdispositionpathsKey];




        ConfigNodePropertyArray* obj = &slingcontentdispositionpaths;
		obj->fromJson(value.dump());

    }

    const char *slingcontentdispositionexcludedpathsKey = "sling.content.disposition.excluded.paths";

    if(object.has_key(slingcontentdispositionexcludedpathsKey))
    {
        bourne::json value = object[slingcontentdispositionexcludedpathsKey];




        ConfigNodePropertyArray* obj = &slingcontentdispositionexcludedpaths;
		obj->fromJson(value.dump());

    }

    const char *slingcontentdispositionallpathsKey = "sling.content.disposition.all.paths";

    if(object.has_key(slingcontentdispositionallpathsKey))
    {
        bourne::json value = object[slingcontentdispositionallpathsKey];




        ConfigNodePropertyBoolean* obj = &slingcontentdispositionallpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingSecurityImplContentDispositionFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingcontentdispositionpaths"] = getSlingcontentdispositionpaths().toJson();






	object["slingcontentdispositionexcludedpaths"] = getSlingcontentdispositionexcludedpaths().toJson();






	object["slingcontentdispositionallpaths"] = getSlingcontentdispositionallpaths().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionpaths()
{
	return slingcontentdispositionpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionpaths(ConfigNodePropertyArray slingcontentdispositionpaths)
{
	this->slingcontentdispositionpaths = slingcontentdispositionpaths;
}

ConfigNodePropertyArray
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionexcludedpaths()
{
	return slingcontentdispositionexcludedpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionexcludedpaths(ConfigNodePropertyArray slingcontentdispositionexcludedpaths)
{
	this->slingcontentdispositionexcludedpaths = slingcontentdispositionexcludedpaths;
}

ConfigNodePropertyBoolean
OrgApacheSlingSecurityImplContentDispositionFilterProperties::getSlingcontentdispositionallpaths()
{
	return slingcontentdispositionallpaths;
}

void
OrgApacheSlingSecurityImplContentDispositionFilterProperties::setSlingcontentdispositionallpaths(ConfigNodePropertyBoolean slingcontentdispositionallpaths)
{
	this->slingcontentdispositionallpaths = slingcontentdispositionallpaths;
}



