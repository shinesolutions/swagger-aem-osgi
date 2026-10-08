

#include "ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties.h"

using namespace Tiny;

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties()
{
	cqstorelisteneradditionalStorePaths = ConfigNodePropertyArray();
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::~ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties()
{

}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqstorelisteneradditionalStorePathsKey = "cq.store.listener.additionalStorePaths";

    if(object.has_key(cqstorelisteneradditionalStorePathsKey))
    {
        bourne::json value = object[cqstorelisteneradditionalStorePathsKey];




        ConfigNodePropertyArray* obj = &cqstorelisteneradditionalStorePaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqstorelisteneradditionalStorePaths"] = getCqstorelisteneradditionalStorePaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::getCqstorelisteneradditionalStorePaths()
{
	return cqstorelisteneradditionalStorePaths;
}

void
ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties::setCqstorelisteneradditionalStorePaths(ConfigNodePropertyArray cqstorelisteneradditionalStorePaths)
{
	this->cqstorelisteneradditionalStorePaths = cqstorelisteneradditionalStorePaths;
}



