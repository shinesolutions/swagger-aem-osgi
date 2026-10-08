

#include "ComDayCqDamCoreImplServletAssetStatusServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetStatusServletProperties::ComDayCqDamCoreImplServletAssetStatusServletProperties()
{
	cqdambatchstatusmaxassets = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplServletAssetStatusServletProperties::ComDayCqDamCoreImplServletAssetStatusServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetStatusServletProperties::~ComDayCqDamCoreImplServletAssetStatusServletProperties()
{

}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdambatchstatusmaxassetsKey = "cq.dam.batch.status.maxassets";

    if(object.has_key(cqdambatchstatusmaxassetsKey))
    {
        bourne::json value = object[cqdambatchstatusmaxassetsKey];




        ConfigNodePropertyInteger* obj = &cqdambatchstatusmaxassets;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletAssetStatusServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdambatchstatusmaxassets"] = getCqdambatchstatusmaxassets().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletAssetStatusServletProperties::getCqdambatchstatusmaxassets()
{
	return cqdambatchstatusmaxassets;
}

void
ComDayCqDamCoreImplServletAssetStatusServletProperties::setCqdambatchstatusmaxassets(ConfigNodePropertyInteger cqdambatchstatusmaxassets)
{
	this->cqdambatchstatusmaxassets = cqdambatchstatusmaxassets;
}



