

#include "ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties()
{
	upgradeTaskIgnoreList = ConfigNodePropertyArray();
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::~ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties()
{

}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *upgradeTaskIgnoreListKey = "upgradeTaskIgnoreList";

    if(object.has_key(upgradeTaskIgnoreListKey))
    {
        bourne::json value = object[upgradeTaskIgnoreListKey];




        ConfigNodePropertyArray* obj = &upgradeTaskIgnoreList;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["upgradeTaskIgnoreList"] = getUpgradeTaskIgnoreList().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::getUpgradeTaskIgnoreList()
{
	return upgradeTaskIgnoreList;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::setUpgradeTaskIgnoreList(ConfigNodePropertyArray upgradeTaskIgnoreList)
{
	this->upgradeTaskIgnoreList = upgradeTaskIgnoreList;
}



