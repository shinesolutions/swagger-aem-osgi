

#include "ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties()
{
	preupgrademaintenancetasks = ConfigNodePropertyArray();
	preupgradehctags = ConfigNodePropertyArray();
}

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::~ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties()
{

}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *preupgrademaintenancetasksKey = "pre-upgrade.maintenance.tasks";

    if(object.has_key(preupgrademaintenancetasksKey))
    {
        bourne::json value = object[preupgrademaintenancetasksKey];




        ConfigNodePropertyArray* obj = &preupgrademaintenancetasks;
		obj->fromJson(value.dump());

    }

    const char *preupgradehctagsKey = "pre-upgrade.hc.tags";

    if(object.has_key(preupgradehctagsKey))
    {
        bourne::json value = object[preupgradehctagsKey];




        ConfigNodePropertyArray* obj = &preupgradehctags;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["preupgrademaintenancetasks"] = getPreupgrademaintenancetasks().toJson();






	object["preupgradehctags"] = getPreupgradehctags().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::getPreupgrademaintenancetasks()
{
	return preupgrademaintenancetasks;
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::setPreupgrademaintenancetasks(ConfigNodePropertyArray preupgrademaintenancetasks)
{
	this->preupgrademaintenancetasks = preupgrademaintenancetasks;
}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::getPreupgradehctags()
{
	return preupgradehctags;
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::setPreupgradehctags(ConfigNodePropertyArray preupgradehctags)
{
	this->preupgradehctags = preupgradehctags;
}



