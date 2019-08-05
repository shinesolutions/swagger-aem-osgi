#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties()
{
	//__init();
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::~ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//excludesearchpath = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(excludesearchpath != NULL) {
	//
	//delete excludesearchpath;
	//excludesearchpath = NULL;
	//}
	//
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *excludesearchpathKey = "exclude.search.path";
	node = json_object_get_member(pJsonObject, excludesearchpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludesearchpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludesearchpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludesearchpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludesearchpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludesearchpathKey = "exclude.search.path";
	json_object_set_member(pJsonObject, excludesearchpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::getExcludesearchpath()
{
	return excludesearchpath;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::setExcludesearchpath(ConfigNodePropertyArray  excludesearchpath)
{
	this->excludesearchpath = excludesearchpath;
}


