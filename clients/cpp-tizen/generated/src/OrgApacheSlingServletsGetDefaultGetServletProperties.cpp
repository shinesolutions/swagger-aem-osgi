#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingServletsGetDefaultGetServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingServletsGetDefaultGetServletProperties::OrgApacheSlingServletsGetDefaultGetServletProperties()
{
	//__init();
}

OrgApacheSlingServletsGetDefaultGetServletProperties::~OrgApacheSlingServletsGetDefaultGetServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::__init()
{
	//aliases = new ConfigNodePropertyArray();
	//index = new ConfigNodePropertyBoolean();
	//indexfiles = new ConfigNodePropertyArray();
	//enablehtml = new ConfigNodePropertyBoolean();
	//enablejson = new ConfigNodePropertyBoolean();
	//enabletxt = new ConfigNodePropertyBoolean();
	//enablexml = new ConfigNodePropertyBoolean();
	//jsonmaximumresults = new ConfigNodePropertyInteger();
	//ecmaSuport = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::__cleanup()
{
	//if(aliases != NULL) {
	//
	//delete aliases;
	//aliases = NULL;
	//}
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
	//if(indexfiles != NULL) {
	//
	//delete indexfiles;
	//indexfiles = NULL;
	//}
	//if(enablehtml != NULL) {
	//
	//delete enablehtml;
	//enablehtml = NULL;
	//}
	//if(enablejson != NULL) {
	//
	//delete enablejson;
	//enablejson = NULL;
	//}
	//if(enabletxt != NULL) {
	//
	//delete enabletxt;
	//enabletxt = NULL;
	//}
	//if(enablexml != NULL) {
	//
	//delete enablexml;
	//enablexml = NULL;
	//}
	//if(jsonmaximumresults != NULL) {
	//
	//delete jsonmaximumresults;
	//jsonmaximumresults = NULL;
	//}
	//if(ecmaSuport != NULL) {
	//
	//delete ecmaSuport;
	//ecmaSuport = NULL;
	//}
	//
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aliasesKey = "aliases";
	node = json_object_get_member(pJsonObject, aliasesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&aliases, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&aliases);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&index, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&index);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *indexfilesKey = "index.files";
	node = json_object_get_member(pJsonObject, indexfilesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&indexfiles, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&indexfiles);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enablehtmlKey = "enable.html";
	node = json_object_get_member(pJsonObject, enablehtmlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enablehtml, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enablehtml);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enablejsonKey = "enable.json";
	node = json_object_get_member(pJsonObject, enablejsonKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enablejson, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enablejson);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enabletxtKey = "enable.txt";
	node = json_object_get_member(pJsonObject, enabletxtKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabletxt, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabletxt);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enablexmlKey = "enable.xml";
	node = json_object_get_member(pJsonObject, enablexmlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enablexml, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enablexml);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jsonmaximumresultsKey = "json.maximumresults";
	node = json_object_get_member(pJsonObject, jsonmaximumresultsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&jsonmaximumresults, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&jsonmaximumresults);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ecmaSuportKey = "ecmaSuport";
	node = json_object_get_member(pJsonObject, ecmaSuportKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&ecmaSuport, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&ecmaSuport);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingServletsGetDefaultGetServletProperties::OrgApacheSlingServletsGetDefaultGetServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingServletsGetDefaultGetServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAliases();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAliases());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aliasesKey = "aliases";
	json_object_set_member(pJsonObject, aliasesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIndex();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIndex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIndexfiles();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIndexfiles());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *indexfilesKey = "index.files";
	json_object_set_member(pJsonObject, indexfilesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnablehtml();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnablehtml());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enablehtmlKey = "enable.html";
	json_object_set_member(pJsonObject, enablehtmlKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnablejson();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnablejson());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enablejsonKey = "enable.json";
	json_object_set_member(pJsonObject, enablejsonKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabletxt();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabletxt());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabletxtKey = "enable.txt";
	json_object_set_member(pJsonObject, enabletxtKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnablexml();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnablexml());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enablexmlKey = "enable.xml";
	json_object_set_member(pJsonObject, enablexmlKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getJsonmaximumresults();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getJsonmaximumresults());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jsonmaximumresultsKey = "json.maximumresults";
	json_object_set_member(pJsonObject, jsonmaximumresultsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEcmaSuport();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEcmaSuport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ecmaSuportKey = "ecmaSuport";
	json_object_set_member(pJsonObject, ecmaSuportKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingServletsGetDefaultGetServletProperties::getAliases()
{
	return aliases;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setAliases(ConfigNodePropertyArray  aliases)
{
	this->aliases = aliases;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getIndex()
{
	return index;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setIndex(ConfigNodePropertyBoolean  index)
{
	this->index = index;
}

ConfigNodePropertyArray
OrgApacheSlingServletsGetDefaultGetServletProperties::getIndexfiles()
{
	return indexfiles;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setIndexfiles(ConfigNodePropertyArray  indexfiles)
{
	this->indexfiles = indexfiles;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablehtml()
{
	return enablehtml;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablehtml(ConfigNodePropertyBoolean  enablehtml)
{
	this->enablehtml = enablehtml;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablejson()
{
	return enablejson;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablejson(ConfigNodePropertyBoolean  enablejson)
{
	this->enablejson = enablejson;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnabletxt()
{
	return enabletxt;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnabletxt(ConfigNodePropertyBoolean  enabletxt)
{
	this->enabletxt = enabletxt;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEnablexml()
{
	return enablexml;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEnablexml(ConfigNodePropertyBoolean  enablexml)
{
	this->enablexml = enablexml;
}

ConfigNodePropertyInteger
OrgApacheSlingServletsGetDefaultGetServletProperties::getJsonmaximumresults()
{
	return jsonmaximumresults;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setJsonmaximumresults(ConfigNodePropertyInteger  jsonmaximumresults)
{
	this->jsonmaximumresults = jsonmaximumresults;
}

ConfigNodePropertyBoolean
OrgApacheSlingServletsGetDefaultGetServletProperties::getEcmaSuport()
{
	return ecmaSuport;
}

void
OrgApacheSlingServletsGetDefaultGetServletProperties::setEcmaSuport(ConfigNodePropertyBoolean  ecmaSuport)
{
	this->ecmaSuport = ecmaSuport;
}


