

#include "OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h"

using namespace Tiny;

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::OrgApacheSlingEngineImplLogRequestLoggerServiceProperties()
{
	requestlogserviceformat = ConfigNodePropertyString();
	requestlogserviceoutput = ConfigNodePropertyString();
	requestlogserviceoutputtype = ConfigNodePropertyDropDown();
	requestlogserviceonentry = ConfigNodePropertyBoolean();
}

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::~OrgApacheSlingEngineImplLogRequestLoggerServiceProperties()
{

}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *requestlogserviceformatKey = "request.log.service.format";

    if(object.has_key(requestlogserviceformatKey))
    {
        bourne::json value = object[requestlogserviceformatKey];




        ConfigNodePropertyString* obj = &requestlogserviceformat;
		obj->fromJson(value.dump());

    }

    const char *requestlogserviceoutputKey = "request.log.service.output";

    if(object.has_key(requestlogserviceoutputKey))
    {
        bourne::json value = object[requestlogserviceoutputKey];




        ConfigNodePropertyString* obj = &requestlogserviceoutput;
		obj->fromJson(value.dump());

    }

    const char *requestlogserviceoutputtypeKey = "request.log.service.outputtype";

    if(object.has_key(requestlogserviceoutputtypeKey))
    {
        bourne::json value = object[requestlogserviceoutputtypeKey];




        ConfigNodePropertyDropDown* obj = &requestlogserviceoutputtype;
		obj->fromJson(value.dump());

    }

    const char *requestlogserviceonentryKey = "request.log.service.onentry";

    if(object.has_key(requestlogserviceonentryKey))
    {
        bourne::json value = object[requestlogserviceonentryKey];




        ConfigNodePropertyBoolean* obj = &requestlogserviceonentry;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["requestlogserviceformat"] = getRequestlogserviceformat().toJson();






	object["requestlogserviceoutput"] = getRequestlogserviceoutput().toJson();






	object["requestlogserviceoutputtype"] = getRequestlogserviceoutputtype().toJson();






	object["requestlogserviceonentry"] = getRequestlogserviceonentry().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceformat()
{
	return requestlogserviceformat;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceformat(ConfigNodePropertyString requestlogserviceformat)
{
	this->requestlogserviceformat = requestlogserviceformat;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceoutput()
{
	return requestlogserviceoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceoutput(ConfigNodePropertyString requestlogserviceoutput)
{
	this->requestlogserviceoutput = requestlogserviceoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceoutputtype()
{
	return requestlogserviceoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceoutputtype(ConfigNodePropertyDropDown requestlogserviceoutputtype)
{
	this->requestlogserviceoutputtype = requestlogserviceoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceonentry()
{
	return requestlogserviceonentry;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceonentry(ConfigNodePropertyBoolean requestlogserviceonentry)
{
	this->requestlogserviceonentry = requestlogserviceonentry;
}



