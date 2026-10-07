

#include "ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties()
{
	disableSmartSync = ConfigNodePropertyBoolean();
}

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::~ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties()
{

}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *disableSmartSyncKey = "disableSmartSync";

    if(object.has_key(disableSmartSyncKey))
    {
        bourne::json value = object[disableSmartSyncKey];




        ConfigNodePropertyBoolean* obj = &disableSmartSync;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disableSmartSync"] = getDisableSmartSync().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::getDisableSmartSync()
{
	return disableSmartSync;
}

void
ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties::setDisableSmartSync(ConfigNodePropertyBoolean disableSmartSync)
{
	this->disableSmartSync = disableSmartSync;
}



