#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::__init()
{
	//solrhomepath = new ConfigNodePropertyString();
	//solrcorename = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::__cleanup()
{
	//if(solrhomepath != NULL) {
	//
	//delete solrhomepath;
	//solrhomepath = NULL;
	//}
	//if(solrcorename != NULL) {
	//
	//delete solrcorename;
	//solrcorename = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *solrhomepathKey = "solr.home.path";
	node = json_object_get_member(pJsonObject, solrhomepathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrhomepath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrhomepath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *solrcorenameKey = "solr.core.name";
	node = json_object_get_member(pJsonObject, solrcorenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&solrcorename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&solrcorename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrhomepath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrhomepath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrhomepathKey = "solr.home.path";
	json_object_set_member(pJsonObject, solrhomepathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSolrcorename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSolrcorename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *solrcorenameKey = "solr.core.name";
	json_object_set_member(pJsonObject, solrcorenameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrhomepath()
{
	return solrhomepath;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrhomepath(ConfigNodePropertyString  solrhomepath)
{
	this->solrhomepath = solrhomepath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::getSolrcorename()
{
	return solrcorename;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties::setSolrcorename(ConfigNodePropertyString  solrcorename)
{
	this->solrcorename = solrcorename;
}


