#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties()
{
	//__init();
}

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::~ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::__init()
{
	//jmxobjectname = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::__cleanup()
{
	//if(jmxobjectname != NULL) {
	//
	//delete jmxobjectname;
	//jmxobjectname = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jmxobjectnameKey = "jmx.objectname";
	node = json_object_get_member(pJsonObject, jmxobjectnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jmxobjectname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jmxobjectname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJmxobjectname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJmxobjectname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jmxobjectnameKey = "jmx.objectname";
	json_object_set_member(pJsonObject, jmxobjectnameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties::setJmxobjectname(ConfigNodePropertyString  jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}


