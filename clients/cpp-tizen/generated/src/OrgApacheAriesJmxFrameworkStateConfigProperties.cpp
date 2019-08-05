#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheAriesJmxFrameworkStateConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheAriesJmxFrameworkStateConfigProperties::OrgApacheAriesJmxFrameworkStateConfigProperties()
{
	//__init();
}

OrgApacheAriesJmxFrameworkStateConfigProperties::~OrgApacheAriesJmxFrameworkStateConfigProperties()
{
	//__cleanup();
}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::__init()
{
	//attributeChangeNotificationEnabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::__cleanup()
{
	//if(attributeChangeNotificationEnabled != NULL) {
	//
	//delete attributeChangeNotificationEnabled;
	//attributeChangeNotificationEnabled = NULL;
	//}
	//
}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *attributeChangeNotificationEnabledKey = "attributeChangeNotificationEnabled";
	node = json_object_get_member(pJsonObject, attributeChangeNotificationEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&attributeChangeNotificationEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&attributeChangeNotificationEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheAriesJmxFrameworkStateConfigProperties::OrgApacheAriesJmxFrameworkStateConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheAriesJmxFrameworkStateConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAttributeChangeNotificationEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAttributeChangeNotificationEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *attributeChangeNotificationEnabledKey = "attributeChangeNotificationEnabled";
	json_object_set_member(pJsonObject, attributeChangeNotificationEnabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheAriesJmxFrameworkStateConfigProperties::getAttributeChangeNotificationEnabled()
{
	return attributeChangeNotificationEnabled;
}

void
OrgApacheAriesJmxFrameworkStateConfigProperties::setAttributeChangeNotificationEnabled(ConfigNodePropertyBoolean  attributeChangeNotificationEnabled)
{
	this->attributeChangeNotificationEnabled = attributeChangeNotificationEnabled;
}


