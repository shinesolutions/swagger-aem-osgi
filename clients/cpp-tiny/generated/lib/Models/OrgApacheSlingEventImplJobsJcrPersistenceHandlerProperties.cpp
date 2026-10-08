

#include "OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.h"

using namespace Tiny;

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties()
{
	jobconsumermanagerdisableDistribution = ConfigNodePropertyBoolean();
	startupdelay = ConfigNodePropertyInteger();
	cleanupperiod = ConfigNodePropertyInteger();
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::~OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties()
{

}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jobconsumermanagerdisableDistributionKey = "job.consumermanager.disableDistribution";

    if(object.has_key(jobconsumermanagerdisableDistributionKey))
    {
        bourne::json value = object[jobconsumermanagerdisableDistributionKey];




        ConfigNodePropertyBoolean* obj = &jobconsumermanagerdisableDistribution;
		obj->fromJson(value.dump());

    }

    const char *startupdelayKey = "startup.delay";

    if(object.has_key(startupdelayKey))
    {
        bourne::json value = object[startupdelayKey];




        ConfigNodePropertyInteger* obj = &startupdelay;
		obj->fromJson(value.dump());

    }

    const char *cleanupperiodKey = "cleanup.period";

    if(object.has_key(cleanupperiodKey))
    {
        bourne::json value = object[cleanupperiodKey];




        ConfigNodePropertyInteger* obj = &cleanupperiod;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jobconsumermanagerdisableDistribution"] = getJobconsumermanagerdisableDistribution().toJson();






	object["startupdelay"] = getStartupdelay().toJson();






	object["cleanupperiod"] = getCleanupperiod().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getJobconsumermanagerdisableDistribution()
{
	return jobconsumermanagerdisableDistribution;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setJobconsumermanagerdisableDistribution(ConfigNodePropertyBoolean jobconsumermanagerdisableDistribution)
{
	this->jobconsumermanagerdisableDistribution = jobconsumermanagerdisableDistribution;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getStartupdelay()
{
	return startupdelay;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setStartupdelay(ConfigNodePropertyInteger startupdelay)
{
	this->startupdelay = startupdelay;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getCleanupperiod()
{
	return cleanupperiod;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setCleanupperiod(ConfigNodePropertyInteger cleanupperiod)
{
	this->cleanupperiod = cleanupperiod;
}



