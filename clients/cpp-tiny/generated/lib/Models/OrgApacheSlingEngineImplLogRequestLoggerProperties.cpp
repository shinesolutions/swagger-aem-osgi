

#include "OrgApacheSlingEngineImplLogRequestLoggerProperties.h"

using namespace Tiny;

OrgApacheSlingEngineImplLogRequestLoggerProperties::OrgApacheSlingEngineImplLogRequestLoggerProperties()
{
	requestlogoutput = ConfigNodePropertyString();
	requestlogoutputtype = ConfigNodePropertyDropDown();
	requestlogenabled = ConfigNodePropertyBoolean();
	accesslogoutput = ConfigNodePropertyString();
	accesslogoutputtype = ConfigNodePropertyDropDown();
	accesslogenabled = ConfigNodePropertyBoolean();
}

OrgApacheSlingEngineImplLogRequestLoggerProperties::OrgApacheSlingEngineImplLogRequestLoggerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplLogRequestLoggerProperties::~OrgApacheSlingEngineImplLogRequestLoggerProperties()
{

}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *requestlogoutputKey = "request.log.output";

    if(object.has_key(requestlogoutputKey))
    {
        bourne::json value = object[requestlogoutputKey];




        ConfigNodePropertyString* obj = &requestlogoutput;
		obj->fromJson(value.dump());

    }

    const char *requestlogoutputtypeKey = "request.log.outputtype";

    if(object.has_key(requestlogoutputtypeKey))
    {
        bourne::json value = object[requestlogoutputtypeKey];




        ConfigNodePropertyDropDown* obj = &requestlogoutputtype;
		obj->fromJson(value.dump());

    }

    const char *requestlogenabledKey = "request.log.enabled";

    if(object.has_key(requestlogenabledKey))
    {
        bourne::json value = object[requestlogenabledKey];




        ConfigNodePropertyBoolean* obj = &requestlogenabled;
		obj->fromJson(value.dump());

    }

    const char *accesslogoutputKey = "access.log.output";

    if(object.has_key(accesslogoutputKey))
    {
        bourne::json value = object[accesslogoutputKey];




        ConfigNodePropertyString* obj = &accesslogoutput;
		obj->fromJson(value.dump());

    }

    const char *accesslogoutputtypeKey = "access.log.outputtype";

    if(object.has_key(accesslogoutputtypeKey))
    {
        bourne::json value = object[accesslogoutputtypeKey];




        ConfigNodePropertyDropDown* obj = &accesslogoutputtype;
		obj->fromJson(value.dump());

    }

    const char *accesslogenabledKey = "access.log.enabled";

    if(object.has_key(accesslogenabledKey))
    {
        bourne::json value = object[accesslogenabledKey];




        ConfigNodePropertyBoolean* obj = &accesslogenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplLogRequestLoggerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["requestlogoutput"] = getRequestlogoutput().toJson();






	object["requestlogoutputtype"] = getRequestlogoutputtype().toJson();






	object["requestlogenabled"] = getRequestlogenabled().toJson();






	object["accesslogoutput"] = getAccesslogoutput().toJson();






	object["accesslogoutputtype"] = getAccesslogoutputtype().toJson();






	object["accesslogenabled"] = getAccesslogenabled().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogoutput()
{
	return requestlogoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogoutput(ConfigNodePropertyString requestlogoutput)
{
	this->requestlogoutput = requestlogoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogoutputtype()
{
	return requestlogoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogoutputtype(ConfigNodePropertyDropDown requestlogoutputtype)
{
	this->requestlogoutputtype = requestlogoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogenabled()
{
	return requestlogenabled;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogenabled(ConfigNodePropertyBoolean requestlogenabled)
{
	this->requestlogenabled = requestlogenabled;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogoutput()
{
	return accesslogoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogoutput(ConfigNodePropertyString accesslogoutput)
{
	this->accesslogoutput = accesslogoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogoutputtype()
{
	return accesslogoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogoutputtype(ConfigNodePropertyDropDown accesslogoutputtype)
{
	this->accesslogoutputtype = accesslogoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogenabled()
{
	return accesslogenabled;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogenabled(ConfigNodePropertyBoolean accesslogenabled)
{
	this->accesslogenabled = accesslogenabled;
}



