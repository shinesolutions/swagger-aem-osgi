

#include "ComDayCqStatisticsImplStatisticsServiceImplProperties.h"

using namespace Tiny;

ComDayCqStatisticsImplStatisticsServiceImplProperties::ComDayCqStatisticsImplStatisticsServiceImplProperties()
{
	schedulerperiod = ConfigNodePropertyInteger();
	schedulerconcurrent = ConfigNodePropertyBoolean();
	path = ConfigNodePropertyString();
	workspace = ConfigNodePropertyString();
	keywordsPath = ConfigNodePropertyString();
	asyncEntries = ConfigNodePropertyBoolean();
}

ComDayCqStatisticsImplStatisticsServiceImplProperties::ComDayCqStatisticsImplStatisticsServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqStatisticsImplStatisticsServiceImplProperties::~ComDayCqStatisticsImplStatisticsServiceImplProperties()
{

}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerperiodKey = "scheduler.period";

    if(object.has_key(schedulerperiodKey))
    {
        bourne::json value = object[schedulerperiodKey];




        ConfigNodePropertyInteger* obj = &schedulerperiod;
		obj->fromJson(value.dump());

    }

    const char *schedulerconcurrentKey = "scheduler.concurrent";

    if(object.has_key(schedulerconcurrentKey))
    {
        bourne::json value = object[schedulerconcurrentKey];




        ConfigNodePropertyBoolean* obj = &schedulerconcurrent;
		obj->fromJson(value.dump());

    }

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *workspaceKey = "workspace";

    if(object.has_key(workspaceKey))
    {
        bourne::json value = object[workspaceKey];




        ConfigNodePropertyString* obj = &workspace;
		obj->fromJson(value.dump());

    }

    const char *keywordsPathKey = "keywordsPath";

    if(object.has_key(keywordsPathKey))
    {
        bourne::json value = object[keywordsPathKey];




        ConfigNodePropertyString* obj = &keywordsPath;
		obj->fromJson(value.dump());

    }

    const char *asyncEntriesKey = "asyncEntries";

    if(object.has_key(asyncEntriesKey))
    {
        bourne::json value = object[asyncEntriesKey];




        ConfigNodePropertyBoolean* obj = &asyncEntries;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqStatisticsImplStatisticsServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerperiod"] = getSchedulerperiod().toJson();






	object["schedulerconcurrent"] = getSchedulerconcurrent().toJson();






	object["path"] = getPath().toJson();






	object["workspace"] = getWorkspace().toJson();






	object["keywordsPath"] = getKeywordsPath().toJson();






	object["asyncEntries"] = getAsyncEntries().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqStatisticsImplStatisticsServiceImplProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqStatisticsImplStatisticsServiceImplProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getPath()
{
	return path;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getWorkspace()
{
	return workspace;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setWorkspace(ConfigNodePropertyString workspace)
{
	this->workspace = workspace;
}

ConfigNodePropertyString
ComDayCqStatisticsImplStatisticsServiceImplProperties::getKeywordsPath()
{
	return keywordsPath;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setKeywordsPath(ConfigNodePropertyString keywordsPath)
{
	this->keywordsPath = keywordsPath;
}

ConfigNodePropertyBoolean
ComDayCqStatisticsImplStatisticsServiceImplProperties::getAsyncEntries()
{
	return asyncEntries;
}

void
ComDayCqStatisticsImplStatisticsServiceImplProperties::setAsyncEntries(ConfigNodePropertyBoolean asyncEntries)
{
	this->asyncEntries = asyncEntries;
}



