

#include "ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	maxqueuedjobs = ConfigNodePropertyInteger();
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::~ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties()
{

}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *maxqueuedjobsKey = "max.queued.jobs";

    if(object.has_key(maxqueuedjobsKey))
    {
        bourne::json value = object[maxqueuedjobsKey];




        ConfigNodePropertyInteger* obj = &maxqueuedjobs;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["maxqueuedjobs"] = getMaxqueuedjobs().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::getMaxqueuedjobs()
{
	return maxqueuedjobs;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::setMaxqueuedjobs(ConfigNodePropertyInteger maxqueuedjobs)
{
	this->maxqueuedjobs = maxqueuedjobs;
}



