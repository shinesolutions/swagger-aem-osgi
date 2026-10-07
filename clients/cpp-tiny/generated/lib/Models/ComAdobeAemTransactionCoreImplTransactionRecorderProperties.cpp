

#include "ComAdobeAemTransactionCoreImplTransactionRecorderProperties.h"

using namespace Tiny;

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::ComAdobeAemTransactionCoreImplTransactionRecorderProperties()
{
	isTransactionRecordingEnabled = ConfigNodePropertyBoolean();
}

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::ComAdobeAemTransactionCoreImplTransactionRecorderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemTransactionCoreImplTransactionRecorderProperties::~ComAdobeAemTransactionCoreImplTransactionRecorderProperties()
{

}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isTransactionRecordingEnabledKey = "isTransactionRecordingEnabled";

    if(object.has_key(isTransactionRecordingEnabledKey))
    {
        bourne::json value = object[isTransactionRecordingEnabledKey];




        ConfigNodePropertyBoolean* obj = &isTransactionRecordingEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isTransactionRecordingEnabled"] = getIsTransactionRecordingEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::getIsTransactionRecordingEnabled()
{
	return isTransactionRecordingEnabled;
}

void
ComAdobeAemTransactionCoreImplTransactionRecorderProperties::setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean isTransactionRecordingEnabled)
{
	this->isTransactionRecordingEnabled = isTransactionRecordingEnabled;
}



