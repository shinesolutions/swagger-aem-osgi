#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::~OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::__init()
{
	//providerType = new ConfigNodePropertyDropDown();
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::__cleanup()
{
	//if(providerType != NULL) {
	//
	//delete providerType;
	//providerType = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providerTypeKey = "providerType";
	node = json_object_get_member(pJsonObject, providerTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&providerType, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&providerType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getProviderType();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getProviderType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerTypeKey = "providerType";
	json_object_set_member(pJsonObject, providerTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::getProviderType()
{
	return providerType;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties::setProviderType(ConfigNodePropertyDropDown  providerType)
{
	this->providerType = providerType;
}


