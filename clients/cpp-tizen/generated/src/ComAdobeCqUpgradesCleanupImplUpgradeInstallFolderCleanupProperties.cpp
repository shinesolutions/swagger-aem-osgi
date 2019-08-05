#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties()
{
	//__init();
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::~ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties()
{
	//__cleanup();
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::__init()
{
	//deletenameregexps = new ConfigNodePropertyArray();
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::__cleanup()
{
	//if(deletenameregexps != NULL) {
	//
	//delete deletenameregexps;
	//deletenameregexps = NULL;
	//}
	//
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deletenameregexpsKey = "delete.name.regexps";
	node = json_object_get_member(pJsonObject, deletenameregexpsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&deletenameregexps, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&deletenameregexps);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDeletenameregexps();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDeletenameregexps());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletenameregexpsKey = "delete.name.regexps";
	json_object_set_member(pJsonObject, deletenameregexpsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::getDeletenameregexps()
{
	return deletenameregexps;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties::setDeletenameregexps(ConfigNodePropertyArray  deletenameregexps)
{
	this->deletenameregexps = deletenameregexps;
}


