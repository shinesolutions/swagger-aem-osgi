

#include "ComDayCqContentsyncImplContentSyncManagerImplProperties.h"

using namespace Tiny;

ComDayCqContentsyncImplContentSyncManagerImplProperties::ComDayCqContentsyncImplContentSyncManagerImplProperties()
{
	contentsyncfallbackauthorizable = ConfigNodePropertyString();
	contentsyncfallbackupdateuser = ConfigNodePropertyString();
}

ComDayCqContentsyncImplContentSyncManagerImplProperties::ComDayCqContentsyncImplContentSyncManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqContentsyncImplContentSyncManagerImplProperties::~ComDayCqContentsyncImplContentSyncManagerImplProperties()
{

}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *contentsyncfallbackauthorizableKey = "contentsync.fallback.authorizable";

    if(object.has_key(contentsyncfallbackauthorizableKey))
    {
        bourne::json value = object[contentsyncfallbackauthorizableKey];




        ConfigNodePropertyString* obj = &contentsyncfallbackauthorizable;
		obj->fromJson(value.dump());

    }

    const char *contentsyncfallbackupdateuserKey = "contentsync.fallback.updateuser";

    if(object.has_key(contentsyncfallbackupdateuserKey))
    {
        bourne::json value = object[contentsyncfallbackupdateuserKey];




        ConfigNodePropertyString* obj = &contentsyncfallbackupdateuser;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqContentsyncImplContentSyncManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["contentsyncfallbackauthorizable"] = getContentsyncfallbackauthorizable().toJson();






	object["contentsyncfallbackupdateuser"] = getContentsyncfallbackupdateuser().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncfallbackauthorizable()
{
	return contentsyncfallbackauthorizable;
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncfallbackauthorizable(ConfigNodePropertyString contentsyncfallbackauthorizable)
{
	this->contentsyncfallbackauthorizable = contentsyncfallbackauthorizable;
}

ConfigNodePropertyString
ComDayCqContentsyncImplContentSyncManagerImplProperties::getContentsyncfallbackupdateuser()
{
	return contentsyncfallbackupdateuser;
}

void
ComDayCqContentsyncImplContentSyncManagerImplProperties::setContentsyncfallbackupdateuser(ConfigNodePropertyString contentsyncfallbackupdateuser)
{
	this->contentsyncfallbackupdateuser = contentsyncfallbackupdateuser;
}



