

#include "ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::ComDayCqWcmCoreImplCommandsWCMCommandServletProperties()
{
	wcmcommandservletdelete_whitelist = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::~ComDayCqWcmCoreImplCommandsWCMCommandServletProperties()
{

}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *wcmcommandservletdelete_whitelistKey = "wcmcommandservlet.delete_whitelist";

    if(object.has_key(wcmcommandservletdelete_whitelistKey))
    {
        bourne::json value = object[wcmcommandservletdelete_whitelistKey];




        ConfigNodePropertyArray* obj = &wcmcommandservletdelete_whitelist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["wcmcommandservletdelete_whitelist"] = getWcmcommandservletdeleteWhitelist().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::getWcmcommandservletdeleteWhitelist()
{
	return wcmcommandservletdelete_whitelist;
}

void
ComDayCqWcmCoreImplCommandsWCMCommandServletProperties::setWcmcommandservletdeleteWhitelist(ConfigNodePropertyArray wcmcommandservletdelete_whitelist)
{
	this->wcmcommandservletdelete_whitelist = wcmcommandservletdelete_whitelist;
}



