

#include "OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
}

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::~OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties()
{

}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hcnameKey = "hc.name";

    if(object.has_key(hcnameKey))
    {
        bourne::json value = object[hcnameKey];




        ConfigNodePropertyString* obj = &hcname;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *hcmbeannameKey = "hc.mbean.name";

    if(object.has_key(hcmbeannameKey))
    {
        bourne::json value = object[hcmbeannameKey];




        ConfigNodePropertyString* obj = &hcmbeanname;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}



