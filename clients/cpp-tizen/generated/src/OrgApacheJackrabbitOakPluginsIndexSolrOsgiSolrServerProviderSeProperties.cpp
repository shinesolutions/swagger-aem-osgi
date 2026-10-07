#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::__init()
{
	//servertype = new ConfigNodePropertyDropDown();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::__cleanup()
{
	//if(servertype != NULL) {
	//
	//delete servertype;
	//servertype = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servertypeKey = "server.type";
	node = json_object_get_member(pJsonObject, servertypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&servertype, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&servertype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getServertype();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getServertype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servertypeKey = "server.type";
	json_object_set_member(pJsonObject, servertypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::getServertype()
{
	return servertype;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties::setServertype(ConfigNodePropertyDropDown  servertype)
{
	this->servertype = servertype;
}


