

#include "ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	diskspacewarnthreshold = ConfigNodePropertyInteger();
	diskspaceerrorthreshold = ConfigNodePropertyInteger();
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *diskspacewarnthresholdKey = "disk.space.warn.threshold";

    if(object.has_key(diskspacewarnthresholdKey))
    {
        bourne::json value = object[diskspacewarnthresholdKey];




        ConfigNodePropertyInteger* obj = &diskspacewarnthreshold;
		obj->fromJson(value.dump());

    }

    const char *diskspaceerrorthresholdKey = "disk.space.error.threshold";

    if(object.has_key(diskspaceerrorthresholdKey))
    {
        bourne::json value = object[diskspaceerrorthresholdKey];




        ConfigNodePropertyInteger* obj = &diskspaceerrorthreshold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["diskspacewarnthreshold"] = getDiskspacewarnthreshold().toJson();






	object["diskspaceerrorthreshold"] = getDiskspaceerrorthreshold().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getDiskspacewarnthreshold()
{
	return diskspacewarnthreshold;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setDiskspacewarnthreshold(ConfigNodePropertyInteger diskspacewarnthreshold)
{
	this->diskspacewarnthreshold = diskspacewarnthreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::getDiskspaceerrorthreshold()
{
	return diskspaceerrorthreshold;
}

void
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties::setDiskspaceerrorthreshold(ConfigNodePropertyInteger diskspaceerrorthreshold)
{
	this->diskspaceerrorthreshold = diskspaceerrorthreshold;
}



