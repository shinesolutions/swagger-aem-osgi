

#include "ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.h"

using namespace Tiny;

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties()
{
	cqsearchpromoteconfighandlerenabled = ConfigNodePropertyBoolean();
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::~ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties()
{

}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsearchpromoteconfighandlerenabledKey = "cq.searchpromote.confighandler.enabled";

    if(object.has_key(cqsearchpromoteconfighandlerenabledKey))
    {
        bourne::json value = object[cqsearchpromoteconfighandlerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqsearchpromoteconfighandlerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsearchpromoteconfighandlerenabled"] = getCqsearchpromoteconfighandlerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::getCqsearchpromoteconfighandlerenabled()
{
	return cqsearchpromoteconfighandlerenabled;
}

void
ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties::setCqsearchpromoteconfighandlerenabled(ConfigNodePropertyBoolean cqsearchpromoteconfighandlerenabled)
{
	this->cqsearchpromoteconfighandlerenabled = cqsearchpromoteconfighandlerenabled;
}



