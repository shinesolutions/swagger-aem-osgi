

#include "ComDayCqDamCoreImplServletAssetXMPSearchServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::ComDayCqDamCoreImplServletAssetXMPSearchServletProperties()
{
	cqdambatchindesignmaxassets = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::~ComDayCqDamCoreImplServletAssetXMPSearchServletProperties()
{

}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdambatchindesignmaxassetsKey = "cq.dam.batch.indesign.maxassets";

    if(object.has_key(cqdambatchindesignmaxassetsKey))
    {
        bourne::json value = object[cqdambatchindesignmaxassetsKey];




        ConfigNodePropertyInteger* obj = &cqdambatchindesignmaxassets;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdambatchindesignmaxassets"] = getCqdambatchindesignmaxassets().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::getCqdambatchindesignmaxassets()
{
	return cqdambatchindesignmaxassets;
}

void
ComDayCqDamCoreImplServletAssetXMPSearchServletProperties::setCqdambatchindesignmaxassets(ConfigNodePropertyInteger cqdambatchindesignmaxassets)
{
	this->cqdambatchindesignmaxassets = cqdambatchindesignmaxassets;
}



