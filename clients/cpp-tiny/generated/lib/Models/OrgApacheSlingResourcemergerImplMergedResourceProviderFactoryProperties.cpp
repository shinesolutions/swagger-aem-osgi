

#include "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties()
{
	mergeroot = ConfigNodePropertyString();
	mergereadOnly = ConfigNodePropertyBoolean();
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties()
{

}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mergerootKey = "merge.root";

    if(object.has_key(mergerootKey))
    {
        bourne::json value = object[mergerootKey];




        ConfigNodePropertyString* obj = &mergeroot;
		obj->fromJson(value.dump());

    }

    const char *mergereadOnlyKey = "merge.readOnly";

    if(object.has_key(mergereadOnlyKey))
    {
        bourne::json value = object[mergereadOnlyKey];




        ConfigNodePropertyBoolean* obj = &mergereadOnly;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mergeroot"] = getMergeroot().toJson();






	object["mergereadOnly"] = getMergereadOnly().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::getMergeroot()
{
	return mergeroot;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::setMergeroot(ConfigNodePropertyString mergeroot)
{
	this->mergeroot = mergeroot;
}

ConfigNodePropertyBoolean
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::getMergereadOnly()
{
	return mergereadOnly;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties::setMergereadOnly(ConfigNodePropertyBoolean mergereadOnly)
{
	this->mergereadOnly = mergereadOnly;
}



