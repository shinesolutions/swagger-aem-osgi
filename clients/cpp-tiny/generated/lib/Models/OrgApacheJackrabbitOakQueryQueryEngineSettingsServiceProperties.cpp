

#include "OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties()
{
	queryLimitInMemory = ConfigNodePropertyInteger();
	queryLimitReads = ConfigNodePropertyInteger();
	queryFailTraversal = ConfigNodePropertyBoolean();
	fastQuerySize = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties()
{

}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *queryLimitInMemoryKey = "queryLimitInMemory";

    if(object.has_key(queryLimitInMemoryKey))
    {
        bourne::json value = object[queryLimitInMemoryKey];




        ConfigNodePropertyInteger* obj = &queryLimitInMemory;
		obj->fromJson(value.dump());

    }

    const char *queryLimitReadsKey = "queryLimitReads";

    if(object.has_key(queryLimitReadsKey))
    {
        bourne::json value = object[queryLimitReadsKey];




        ConfigNodePropertyInteger* obj = &queryLimitReads;
		obj->fromJson(value.dump());

    }

    const char *queryFailTraversalKey = "queryFailTraversal";

    if(object.has_key(queryFailTraversalKey))
    {
        bourne::json value = object[queryFailTraversalKey];




        ConfigNodePropertyBoolean* obj = &queryFailTraversal;
		obj->fromJson(value.dump());

    }

    const char *fastQuerySizeKey = "fastQuerySize";

    if(object.has_key(fastQuerySizeKey))
    {
        bourne::json value = object[fastQuerySizeKey];




        ConfigNodePropertyBoolean* obj = &fastQuerySize;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["queryLimitInMemory"] = getQueryLimitInMemory().toJson();






	object["queryLimitReads"] = getQueryLimitReads().toJson();






	object["queryFailTraversal"] = getQueryFailTraversal().toJson();






	object["fastQuerySize"] = getFastQuerySize().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryLimitInMemory()
{
	return queryLimitInMemory;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory)
{
	this->queryLimitInMemory = queryLimitInMemory;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryLimitReads()
{
	return queryLimitReads;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads)
{
	this->queryLimitReads = queryLimitReads;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getQueryFailTraversal()
{
	return queryFailTraversal;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal)
{
	this->queryFailTraversal = queryFailTraversal;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::getFastQuerySize()
{
	return fastQuerySize;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties::setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize)
{
	this->fastQuerySize = fastQuerySize;
}



