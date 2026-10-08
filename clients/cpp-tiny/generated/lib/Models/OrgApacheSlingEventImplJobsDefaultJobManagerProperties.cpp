

#include "OrgApacheSlingEventImplJobsDefaultJobManagerProperties.h"

using namespace Tiny;

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::OrgApacheSlingEventImplJobsDefaultJobManagerProperties()
{
	queuepriority = ConfigNodePropertyDropDown();
	queueretries = ConfigNodePropertyInteger();
	queueretrydelay = ConfigNodePropertyInteger();
	queuemaxparallel = ConfigNodePropertyInteger();
}

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::OrgApacheSlingEventImplJobsDefaultJobManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplJobsDefaultJobManagerProperties::~OrgApacheSlingEventImplJobsDefaultJobManagerProperties()
{

}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *queuepriorityKey = "queue.priority";

    if(object.has_key(queuepriorityKey))
    {
        bourne::json value = object[queuepriorityKey];




        ConfigNodePropertyDropDown* obj = &queuepriority;
		obj->fromJson(value.dump());

    }

    const char *queueretriesKey = "queue.retries";

    if(object.has_key(queueretriesKey))
    {
        bourne::json value = object[queueretriesKey];




        ConfigNodePropertyInteger* obj = &queueretries;
		obj->fromJson(value.dump());

    }

    const char *queueretrydelayKey = "queue.retrydelay";

    if(object.has_key(queueretrydelayKey))
    {
        bourne::json value = object[queueretrydelayKey];




        ConfigNodePropertyInteger* obj = &queueretrydelay;
		obj->fromJson(value.dump());

    }

    const char *queuemaxparallelKey = "queue.maxparallel";

    if(object.has_key(queuemaxparallelKey))
    {
        bourne::json value = object[queuemaxparallelKey];




        ConfigNodePropertyInteger* obj = &queuemaxparallel;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["queuepriority"] = getQueuepriority().toJson();






	object["queueretries"] = getQueueretries().toJson();






	object["queueretrydelay"] = getQueueretrydelay().toJson();






	object["queuemaxparallel"] = getQueuemaxparallel().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueuepriority()
{
	return queuepriority;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueuepriority(ConfigNodePropertyDropDown queuepriority)
{
	this->queuepriority = queuepriority;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueueretries()
{
	return queueretries;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueueretries(ConfigNodePropertyInteger queueretries)
{
	this->queueretries = queueretries;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueueretrydelay()
{
	return queueretrydelay;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueueretrydelay(ConfigNodePropertyInteger queueretrydelay)
{
	this->queueretrydelay = queueretrydelay;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::getQueuemaxparallel()
{
	return queuemaxparallel;
}

void
OrgApacheSlingEventImplJobsDefaultJobManagerProperties::setQueuemaxparallel(ConfigNodePropertyInteger queuemaxparallel)
{
	this->queuemaxparallel = queuemaxparallel;
}



