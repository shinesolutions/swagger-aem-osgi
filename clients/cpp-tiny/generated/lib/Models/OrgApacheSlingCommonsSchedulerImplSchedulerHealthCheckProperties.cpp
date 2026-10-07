

#include "OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties()
{
	maxquartzJobdurationacceptable = ConfigNodePropertyInteger();
}

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::~OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties()
{

}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxquartzJobdurationacceptableKey = "max.quartzJob.duration.acceptable";

    if(object.has_key(maxquartzJobdurationacceptableKey))
    {
        bourne::json value = object[maxquartzJobdurationacceptableKey];




        ConfigNodePropertyInteger* obj = &maxquartzJobdurationacceptable;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxquartzJobdurationacceptable"] = getMaxquartzJobdurationacceptable().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::getMaxquartzJobdurationacceptable()
{
	return maxquartzJobdurationacceptable;
}

void
OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties::setMaxquartzJobdurationacceptable(ConfigNodePropertyInteger maxquartzJobdurationacceptable)
{
	this->maxquartzJobdurationacceptable = maxquartzJobdurationacceptable;
}



