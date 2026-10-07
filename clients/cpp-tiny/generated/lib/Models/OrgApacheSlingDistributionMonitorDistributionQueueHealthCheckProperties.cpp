

#include "OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
	numberOfRetriesAllowed = ConfigNodePropertyInteger();
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::~OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{

}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::fromJson(std::string jsonObj)
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

    const char *numberOfRetriesAllowedKey = "numberOfRetriesAllowed";

    if(object.has_key(numberOfRetriesAllowedKey))
    {
        bourne::json value = object[numberOfRetriesAllowedKey];




        ConfigNodePropertyInteger* obj = &numberOfRetriesAllowed;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();






	object["numberOfRetriesAllowed"] = getNumberOfRetriesAllowed().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getNumberOfRetriesAllowed()
{
	return numberOfRetriesAllowed;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setNumberOfRetriesAllowed(ConfigNodePropertyInteger numberOfRetriesAllowed)
{
	this->numberOfRetriesAllowed = numberOfRetriesAllowed;
}



