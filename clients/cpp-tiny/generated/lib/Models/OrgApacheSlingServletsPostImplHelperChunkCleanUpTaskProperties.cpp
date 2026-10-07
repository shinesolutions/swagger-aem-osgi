

#include "OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.h"

using namespace Tiny;

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	schedulerconcurrent = ConfigNodePropertyBoolean();
	chunkcleanupage = ConfigNodePropertyInteger();
}

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::~OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties()
{

}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *schedulerconcurrentKey = "scheduler.concurrent";

    if(object.has_key(schedulerconcurrentKey))
    {
        bourne::json value = object[schedulerconcurrentKey];




        ConfigNodePropertyBoolean* obj = &schedulerconcurrent;
		obj->fromJson(value.dump());

    }

    const char *chunkcleanupageKey = "chunk.cleanup.age";

    if(object.has_key(chunkcleanupageKey))
    {
        bourne::json value = object[chunkcleanupageKey];




        ConfigNodePropertyInteger* obj = &chunkcleanupage;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["schedulerconcurrent"] = getSchedulerconcurrent().toJson();






	object["chunkcleanupage"] = getChunkcleanupage().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::getChunkcleanupage()
{
	return chunkcleanupage;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties::setChunkcleanupage(ConfigNodePropertyInteger chunkcleanupage)
{
	this->chunkcleanupage = chunkcleanupage;
}



