

#include "OrgApacheSlingEngineImplSlingMainServletProperties.h"

using namespace Tiny;

OrgApacheSlingEngineImplSlingMainServletProperties::OrgApacheSlingEngineImplSlingMainServletProperties()
{
	slingmaxcalls = ConfigNodePropertyInteger();
	slingmaxinclusions = ConfigNodePropertyInteger();
	slingtraceallow = ConfigNodePropertyBoolean();
	slingmaxrecordrequests = ConfigNodePropertyInteger();
	slingstorepatternrequests = ConfigNodePropertyArray();
	slingserverinfo = ConfigNodePropertyString();
	slingadditionalresponseheaders = ConfigNodePropertyArray();
}

OrgApacheSlingEngineImplSlingMainServletProperties::OrgApacheSlingEngineImplSlingMainServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplSlingMainServletProperties::~OrgApacheSlingEngineImplSlingMainServletProperties()
{

}

void
OrgApacheSlingEngineImplSlingMainServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingmaxcallsKey = "sling.max.calls";

    if(object.has_key(slingmaxcallsKey))
    {
        bourne::json value = object[slingmaxcallsKey];




        ConfigNodePropertyInteger* obj = &slingmaxcalls;
		obj->fromJson(value.dump());

    }

    const char *slingmaxinclusionsKey = "sling.max.inclusions";

    if(object.has_key(slingmaxinclusionsKey))
    {
        bourne::json value = object[slingmaxinclusionsKey];




        ConfigNodePropertyInteger* obj = &slingmaxinclusions;
		obj->fromJson(value.dump());

    }

    const char *slingtraceallowKey = "sling.trace.allow";

    if(object.has_key(slingtraceallowKey))
    {
        bourne::json value = object[slingtraceallowKey];




        ConfigNodePropertyBoolean* obj = &slingtraceallow;
		obj->fromJson(value.dump());

    }

    const char *slingmaxrecordrequestsKey = "sling.max.record.requests";

    if(object.has_key(slingmaxrecordrequestsKey))
    {
        bourne::json value = object[slingmaxrecordrequestsKey];




        ConfigNodePropertyInteger* obj = &slingmaxrecordrequests;
		obj->fromJson(value.dump());

    }

    const char *slingstorepatternrequestsKey = "sling.store.pattern.requests";

    if(object.has_key(slingstorepatternrequestsKey))
    {
        bourne::json value = object[slingstorepatternrequestsKey];




        ConfigNodePropertyArray* obj = &slingstorepatternrequests;
		obj->fromJson(value.dump());

    }

    const char *slingserverinfoKey = "sling.serverinfo";

    if(object.has_key(slingserverinfoKey))
    {
        bourne::json value = object[slingserverinfoKey];




        ConfigNodePropertyString* obj = &slingserverinfo;
		obj->fromJson(value.dump());

    }

    const char *slingadditionalresponseheadersKey = "sling.additional.response.headers";

    if(object.has_key(slingadditionalresponseheadersKey))
    {
        bourne::json value = object[slingadditionalresponseheadersKey];




        ConfigNodePropertyArray* obj = &slingadditionalresponseheaders;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplSlingMainServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingmaxcalls"] = getSlingmaxcalls().toJson();






	object["slingmaxinclusions"] = getSlingmaxinclusions().toJson();






	object["slingtraceallow"] = getSlingtraceallow().toJson();






	object["slingmaxrecordrequests"] = getSlingmaxrecordrequests().toJson();






	object["slingstorepatternrequests"] = getSlingstorepatternrequests().toJson();






	object["slingserverinfo"] = getSlingserverinfo().toJson();






	object["slingadditionalresponseheaders"] = getSlingadditionalresponseheaders().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxcalls()
{
	return slingmaxcalls;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxcalls(ConfigNodePropertyInteger slingmaxcalls)
{
	this->slingmaxcalls = slingmaxcalls;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxinclusions()
{
	return slingmaxinclusions;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxinclusions(ConfigNodePropertyInteger slingmaxinclusions)
{
	this->slingmaxinclusions = slingmaxinclusions;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingtraceallow()
{
	return slingtraceallow;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingtraceallow(ConfigNodePropertyBoolean slingtraceallow)
{
	this->slingtraceallow = slingtraceallow;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxrecordrequests()
{
	return slingmaxrecordrequests;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxrecordrequests(ConfigNodePropertyInteger slingmaxrecordrequests)
{
	this->slingmaxrecordrequests = slingmaxrecordrequests;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingstorepatternrequests()
{
	return slingstorepatternrequests;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingstorepatternrequests(ConfigNodePropertyArray slingstorepatternrequests)
{
	this->slingstorepatternrequests = slingstorepatternrequests;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingserverinfo()
{
	return slingserverinfo;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingserverinfo(ConfigNodePropertyString slingserverinfo)
{
	this->slingserverinfo = slingserverinfo;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingadditionalresponseheaders()
{
	return slingadditionalresponseheaders;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingadditionalresponseheaders(ConfigNodePropertyArray slingadditionalresponseheaders)
{
	this->slingadditionalresponseheaders = slingadditionalresponseheaders;
}



