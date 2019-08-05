#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplLanguageManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplLanguageManagerImplProperties::ComDayCqWcmCoreImplLanguageManagerImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplLanguageManagerImplProperties::~ComDayCqWcmCoreImplLanguageManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::__init()
{
	//langmgrlistpath = new ConfigNodePropertyString();
	//langmgrcountrydefault = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::__cleanup()
{
	//if(langmgrlistpath != NULL) {
	//
	//delete langmgrlistpath;
	//langmgrlistpath = NULL;
	//}
	//if(langmgrcountrydefault != NULL) {
	//
	//delete langmgrcountrydefault;
	//langmgrcountrydefault = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *langmgrlistpathKey = "langmgr.list.path";
	node = json_object_get_member(pJsonObject, langmgrlistpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&langmgrlistpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&langmgrlistpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *langmgrcountrydefaultKey = "langmgr.country.default";
	node = json_object_get_member(pJsonObject, langmgrcountrydefaultKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&langmgrcountrydefault, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&langmgrcountrydefault);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplLanguageManagerImplProperties::ComDayCqWcmCoreImplLanguageManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplLanguageManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLangmgrlistpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLangmgrlistpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *langmgrlistpathKey = "langmgr.list.path";
	json_object_set_member(pJsonObject, langmgrlistpathKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLangmgrcountrydefault();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLangmgrcountrydefault());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *langmgrcountrydefaultKey = "langmgr.country.default";
	json_object_set_member(pJsonObject, langmgrcountrydefaultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLanguageManagerImplProperties::getLangmgrlistpath()
{
	return langmgrlistpath;
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::setLangmgrlistpath(ConfigNodePropertyString  langmgrlistpath)
{
	this->langmgrlistpath = langmgrlistpath;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplLanguageManagerImplProperties::getLangmgrcountrydefault()
{
	return langmgrcountrydefault;
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::setLangmgrcountrydefault(ConfigNodePropertyArray  langmgrcountrydefault)
{
	this->langmgrcountrydefault = langmgrcountrydefault;
}


