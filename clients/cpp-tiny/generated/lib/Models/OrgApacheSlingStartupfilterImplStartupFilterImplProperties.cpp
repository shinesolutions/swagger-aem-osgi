

#include "OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h"

using namespace Tiny;

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::OrgApacheSlingStartupfilterImplStartupFilterImplProperties()
{
	activebydefault = ConfigNodePropertyBoolean();
	defaultmessage = ConfigNodePropertyString();
}

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::OrgApacheSlingStartupfilterImplStartupFilterImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingStartupfilterImplStartupFilterImplProperties::~OrgApacheSlingStartupfilterImplStartupFilterImplProperties()
{

}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *activebydefaultKey = "active.by.default";

    if(object.has_key(activebydefaultKey))
    {
        bourne::json value = object[activebydefaultKey];




        ConfigNodePropertyBoolean* obj = &activebydefault;
		obj->fromJson(value.dump());

    }

    const char *defaultmessageKey = "default.message";

    if(object.has_key(defaultmessageKey))
    {
        bourne::json value = object[defaultmessageKey];




        ConfigNodePropertyString* obj = &defaultmessage;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["activebydefault"] = getActivebydefault().toJson();






	object["defaultmessage"] = getDefaultmessage().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::getActivebydefault()
{
	return activebydefault;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::setActivebydefault(ConfigNodePropertyBoolean activebydefault)
{
	this->activebydefault = activebydefault;
}

ConfigNodePropertyString
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::getDefaultmessage()
{
	return defaultmessage;
}

void
OrgApacheSlingStartupfilterImplStartupFilterImplProperties::setDefaultmessage(ConfigNodePropertyString defaultmessage)
{
	this->defaultmessage = defaultmessage;
}



