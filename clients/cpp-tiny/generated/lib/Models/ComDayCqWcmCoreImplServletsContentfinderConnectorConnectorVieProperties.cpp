

#include "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties()
{
	itemresourcetypes = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemresourcetypesKey = "item.resource.types";

    if(object.has_key(itemresourcetypesKey))
    {
        bourne::json value = object[itemresourcetypesKey];




        ConfigNodePropertyArray* obj = &itemresourcetypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["itemresourcetypes"] = getItemresourcetypes().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::getItemresourcetypes()
{
	return itemresourcetypes;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::setItemresourcetypes(ConfigNodePropertyArray itemresourcetypes)
{
	this->itemresourcetypes = itemresourcetypes;
}



