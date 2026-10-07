

#include "OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.h"

using namespace Tiny;

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties()
{
	name = ConfigNodePropertyString();
	queue = ConfigNodePropertyString();
	dropinvaliditems = ConfigNodePropertyBoolean();
	agenttarget = ConfigNodePropertyString();
}

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::~OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties()
{

}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *queueKey = "queue";

    if(object.has_key(queueKey))
    {
        bourne::json value = object[queueKey];




        ConfigNodePropertyString* obj = &queue;
		obj->fromJson(value.dump());

    }

    const char *dropinvaliditemsKey = "drop.invalid.items";

    if(object.has_key(dropinvaliditemsKey))
    {
        bourne::json value = object[dropinvaliditemsKey];




        ConfigNodePropertyBoolean* obj = &dropinvaliditems;
		obj->fromJson(value.dump());

    }

    const char *agenttargetKey = "agent.target";

    if(object.has_key(agenttargetKey))
    {
        bourne::json value = object[agenttargetKey];




        ConfigNodePropertyString* obj = &agenttarget;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["queue"] = getQueue().toJson();






	object["dropinvaliditems"] = getDropinvaliditems().toJson();






	object["agenttarget"] = getAgenttarget().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getQueue()
{
	return queue;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setQueue(ConfigNodePropertyString queue)
{
	this->queue = queue;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getDropinvaliditems()
{
	return dropinvaliditems;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setDropinvaliditems(ConfigNodePropertyBoolean dropinvaliditems)
{
	this->dropinvaliditems = dropinvaliditems;
}

ConfigNodePropertyString
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::getAgenttarget()
{
	return agenttarget;
}

void
OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties::setAgenttarget(ConfigNodePropertyString agenttarget)
{
	this->agenttarget = agenttarget;
}



