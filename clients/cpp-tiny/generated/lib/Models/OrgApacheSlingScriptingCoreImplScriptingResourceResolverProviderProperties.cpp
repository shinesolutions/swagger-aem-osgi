

#include "OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.h"

using namespace Tiny;

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties()
{
	logstacktraceonclose = ConfigNodePropertyBoolean();
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::~OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties()
{

}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *logstacktraceoncloseKey = "log.stacktrace.onclose";

    if(object.has_key(logstacktraceoncloseKey))
    {
        bourne::json value = object[logstacktraceoncloseKey];




        ConfigNodePropertyBoolean* obj = &logstacktraceonclose;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["logstacktraceonclose"] = getLogstacktraceonclose().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::getLogstacktraceonclose()
{
	return logstacktraceonclose;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties::setLogstacktraceonclose(ConfigNodePropertyBoolean logstacktraceonclose)
{
	this->logstacktraceonclose = logstacktraceonclose;
}



