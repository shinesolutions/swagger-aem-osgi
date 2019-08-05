#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties()
{
	//__init();
}

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::~ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties()
{
	//__cleanup();
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::__init()
{
	//preupgrademaintenancetasks = new ConfigNodePropertyArray();
	//preupgradehctags = new ConfigNodePropertyArray();
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::__cleanup()
{
	//if(preupgrademaintenancetasks != NULL) {
	//
	//delete preupgrademaintenancetasks;
	//preupgrademaintenancetasks = NULL;
	//}
	//if(preupgradehctags != NULL) {
	//
	//delete preupgradehctags;
	//preupgradehctags = NULL;
	//}
	//
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *preupgrademaintenancetasksKey = "pre-upgrade.maintenance.tasks";
	node = json_object_get_member(pJsonObject, preupgrademaintenancetasksKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&preupgrademaintenancetasks, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&preupgrademaintenancetasks);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preupgradehctagsKey = "pre-upgrade.hc.tags";
	node = json_object_get_member(pJsonObject, preupgradehctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&preupgradehctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&preupgradehctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPreupgrademaintenancetasks();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPreupgrademaintenancetasks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preupgrademaintenancetasksKey = "pre-upgrade.maintenance.tasks";
	json_object_set_member(pJsonObject, preupgrademaintenancetasksKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPreupgradehctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPreupgradehctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preupgradehctagsKey = "pre-upgrade.hc.tags";
	json_object_set_member(pJsonObject, preupgradehctagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::getPreupgrademaintenancetasks()
{
	return preupgrademaintenancetasks;
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::setPreupgrademaintenancetasks(ConfigNodePropertyArray  preupgrademaintenancetasks)
{
	this->preupgrademaintenancetasks = preupgrademaintenancetasks;
}

ConfigNodePropertyArray
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::getPreupgradehctags()
{
	return preupgradehctags;
}

void
ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties::setPreupgradehctags(ConfigNodePropertyArray  preupgradehctags)
{
	this->preupgradehctags = preupgradehctags;
}


