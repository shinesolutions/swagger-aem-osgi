

#include "ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	jobpurgethreshold = ConfigNodePropertyInteger();
	jobpurgemaxjobs = ConfigNodePropertyInteger();
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *jobpurgethresholdKey = "job.purge.threshold";

    if(object.has_key(jobpurgethresholdKey))
    {
        bourne::json value = object[jobpurgethresholdKey];




        ConfigNodePropertyInteger* obj = &jobpurgethreshold;
		obj->fromJson(value.dump());

    }

    const char *jobpurgemaxjobsKey = "job.purge.max.jobs";

    if(object.has_key(jobpurgemaxjobsKey))
    {
        bourne::json value = object[jobpurgemaxjobsKey];




        ConfigNodePropertyInteger* obj = &jobpurgemaxjobs;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["jobpurgethreshold"] = getJobpurgethreshold().toJson();






	object["jobpurgemaxjobs"] = getJobpurgemaxjobs().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobpurgethreshold()
{
	return jobpurgethreshold;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobpurgethreshold(ConfigNodePropertyInteger jobpurgethreshold)
{
	this->jobpurgethreshold = jobpurgethreshold;
}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobpurgemaxjobs()
{
	return jobpurgemaxjobs;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobpurgemaxjobs(ConfigNodePropertyInteger jobpurgemaxjobs)
{
	this->jobpurgemaxjobs = jobpurgemaxjobs;
}



