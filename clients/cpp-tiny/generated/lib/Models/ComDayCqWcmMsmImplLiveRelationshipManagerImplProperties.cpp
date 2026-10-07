

#include "ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties()
{
	liverelationshipmgrrelationsconfigdefault = ConfigNodePropertyString();
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::~ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties()
{

}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *liverelationshipmgrrelationsconfigdefaultKey = "liverelationshipmgr.relationsconfig.default";

    if(object.has_key(liverelationshipmgrrelationsconfigdefaultKey))
    {
        bourne::json value = object[liverelationshipmgrrelationsconfigdefaultKey];




        ConfigNodePropertyString* obj = &liverelationshipmgrrelationsconfigdefault;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["liverelationshipmgrrelationsconfigdefault"] = getLiverelationshipmgrrelationsconfigdefault().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::getLiverelationshipmgrrelationsconfigdefault()
{
	return liverelationshipmgrrelationsconfigdefault;
}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties::setLiverelationshipmgrrelationsconfigdefault(ConfigNodePropertyString liverelationshipmgrrelationsconfigdefault)
{
	this->liverelationshipmgrrelationsconfigdefault = liverelationshipmgrrelationsconfigdefault;
}



