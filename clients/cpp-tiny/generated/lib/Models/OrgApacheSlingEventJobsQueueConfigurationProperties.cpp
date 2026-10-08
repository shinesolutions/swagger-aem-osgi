

#include "OrgApacheSlingEventJobsQueueConfigurationProperties.h"

using namespace Tiny;

OrgApacheSlingEventJobsQueueConfigurationProperties::OrgApacheSlingEventJobsQueueConfigurationProperties()
{
	queuename = ConfigNodePropertyString();
	queuetopics = ConfigNodePropertyArray();
	queuetype = ConfigNodePropertyDropDown();
	queuepriority = ConfigNodePropertyDropDown();
	queueretries = ConfigNodePropertyInteger();
	queueretrydelay = ConfigNodePropertyInteger();
	queuemaxparallel = ConfigNodePropertyFloat();
	queuekeepJobs = ConfigNodePropertyBoolean();
	queuepreferRunOnCreationInstance = ConfigNodePropertyBoolean();
	queuethreadPoolSize = ConfigNodePropertyInteger();
	serviceranking = ConfigNodePropertyInteger();
}

OrgApacheSlingEventJobsQueueConfigurationProperties::OrgApacheSlingEventJobsQueueConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventJobsQueueConfigurationProperties::~OrgApacheSlingEventJobsQueueConfigurationProperties()
{

}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *queuenameKey = "queue.name";

    if(object.has_key(queuenameKey))
    {
        bourne::json value = object[queuenameKey];




        ConfigNodePropertyString* obj = &queuename;
		obj->fromJson(value.dump());

    }

    const char *queuetopicsKey = "queue.topics";

    if(object.has_key(queuetopicsKey))
    {
        bourne::json value = object[queuetopicsKey];




        ConfigNodePropertyArray* obj = &queuetopics;
		obj->fromJson(value.dump());

    }

    const char *queuetypeKey = "queue.type";

    if(object.has_key(queuetypeKey))
    {
        bourne::json value = object[queuetypeKey];




        ConfigNodePropertyDropDown* obj = &queuetype;
		obj->fromJson(value.dump());

    }

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




        ConfigNodePropertyFloat* obj = &queuemaxparallel;
		obj->fromJson(value.dump());

    }

    const char *queuekeepJobsKey = "queue.keepJobs";

    if(object.has_key(queuekeepJobsKey))
    {
        bourne::json value = object[queuekeepJobsKey];




        ConfigNodePropertyBoolean* obj = &queuekeepJobs;
		obj->fromJson(value.dump());

    }

    const char *queuepreferRunOnCreationInstanceKey = "queue.preferRunOnCreationInstance";

    if(object.has_key(queuepreferRunOnCreationInstanceKey))
    {
        bourne::json value = object[queuepreferRunOnCreationInstanceKey];




        ConfigNodePropertyBoolean* obj = &queuepreferRunOnCreationInstance;
		obj->fromJson(value.dump());

    }

    const char *queuethreadPoolSizeKey = "queue.threadPoolSize";

    if(object.has_key(queuethreadPoolSizeKey))
    {
        bourne::json value = object[queuethreadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &queuethreadPoolSize;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventJobsQueueConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["queuename"] = getQueuename().toJson();






	object["queuetopics"] = getQueuetopics().toJson();






	object["queuetype"] = getQueuetype().toJson();






	object["queuepriority"] = getQueuepriority().toJson();






	object["queueretries"] = getQueueretries().toJson();






	object["queueretrydelay"] = getQueueretrydelay().toJson();






	object["queuemaxparallel"] = getQueuemaxparallel().toJson();






	object["queuekeepJobs"] = getQueuekeepJobs().toJson();






	object["queuepreferRunOnCreationInstance"] = getQueuepreferRunOnCreationInstance().toJson();






	object["queuethreadPoolSize"] = getQueuethreadPoolSize().toJson();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuename()
{
	return queuename;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuename(ConfigNodePropertyString queuename)
{
	this->queuename = queuename;
}

ConfigNodePropertyArray
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuetopics()
{
	return queuetopics;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuetopics(ConfigNodePropertyArray queuetopics)
{
	this->queuetopics = queuetopics;
}

ConfigNodePropertyDropDown
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuetype()
{
	return queuetype;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuetype(ConfigNodePropertyDropDown queuetype)
{
	this->queuetype = queuetype;
}

ConfigNodePropertyDropDown
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuepriority()
{
	return queuepriority;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuepriority(ConfigNodePropertyDropDown queuepriority)
{
	this->queuepriority = queuepriority;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueueretries()
{
	return queueretries;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueueretries(ConfigNodePropertyInteger queueretries)
{
	this->queueretries = queueretries;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueueretrydelay()
{
	return queueretrydelay;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueueretrydelay(ConfigNodePropertyInteger queueretrydelay)
{
	this->queueretrydelay = queueretrydelay;
}

ConfigNodePropertyFloat
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuemaxparallel()
{
	return queuemaxparallel;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuemaxparallel(ConfigNodePropertyFloat queuemaxparallel)
{
	this->queuemaxparallel = queuemaxparallel;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuekeepJobs()
{
	return queuekeepJobs;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuekeepJobs(ConfigNodePropertyBoolean queuekeepJobs)
{
	this->queuekeepJobs = queuekeepJobs;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuepreferRunOnCreationInstance()
{
	return queuepreferRunOnCreationInstance;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuepreferRunOnCreationInstance(ConfigNodePropertyBoolean queuepreferRunOnCreationInstance)
{
	this->queuepreferRunOnCreationInstance = queuepreferRunOnCreationInstance;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getQueuethreadPoolSize()
{
	return queuethreadPoolSize;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setQueuethreadPoolSize(ConfigNodePropertyInteger queuethreadPoolSize)
{
	this->queuethreadPoolSize = queuethreadPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingEventJobsQueueConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingEventJobsQueueConfigurationProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



