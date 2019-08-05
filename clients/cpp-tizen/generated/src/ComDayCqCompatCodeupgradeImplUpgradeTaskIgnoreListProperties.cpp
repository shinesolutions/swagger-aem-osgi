#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties()
{
	//__init();
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::~ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties()
{
	//__cleanup();
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::__init()
{
	//upgradeTaskIgnoreList = new ConfigNodePropertyArray();
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::__cleanup()
{
	//if(upgradeTaskIgnoreList != NULL) {
	//
	//delete upgradeTaskIgnoreList;
	//upgradeTaskIgnoreList = NULL;
	//}
	//
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *upgradeTaskIgnoreListKey = "upgradeTaskIgnoreList";
	node = json_object_get_member(pJsonObject, upgradeTaskIgnoreListKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&upgradeTaskIgnoreList, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&upgradeTaskIgnoreList);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUpgradeTaskIgnoreList();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUpgradeTaskIgnoreList());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *upgradeTaskIgnoreListKey = "upgradeTaskIgnoreList";
	json_object_set_member(pJsonObject, upgradeTaskIgnoreListKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::getUpgradeTaskIgnoreList()
{
	return upgradeTaskIgnoreList;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties::setUpgradeTaskIgnoreList(ConfigNodePropertyArray  upgradeTaskIgnoreList)
{
	this->upgradeTaskIgnoreList = upgradeTaskIgnoreList;
}


