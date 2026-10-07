#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWidgetImplHtmlLibraryManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::ComDayCqWidgetImplHtmlLibraryManagerImplProperties()
{
	//__init();
}

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::~ComDayCqWidgetImplHtmlLibraryManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::__init()
{
	//htmllibmanagerclientmanager = new ConfigNodePropertyString();
	//htmllibmanagerdebug = new ConfigNodePropertyBoolean();
	//htmllibmanagerdebugconsole = new ConfigNodePropertyBoolean();
	//htmllibmanagerdebuginitjs = new ConfigNodePropertyString();
	//htmllibmanagerdefaultthemename = new ConfigNodePropertyString();
	//htmllibmanagerdefaultuserthemename = new ConfigNodePropertyString();
	//htmllibmanagerfirebuglitepath = new ConfigNodePropertyString();
	//htmllibmanagerforceCQUrlInfo = new ConfigNodePropertyBoolean();
	//htmllibmanagergzip = new ConfigNodePropertyBoolean();
	//htmllibmanagermaxage = new ConfigNodePropertyInteger();
	//htmllibmanagermaxDataUriSize = new ConfigNodePropertyInteger();
	//htmllibmanagerminify = new ConfigNodePropertyBoolean();
	//htmllibmanagerpathlist = new ConfigNodePropertyArray();
	//htmllibmanagertiming = new ConfigNodePropertyBoolean();
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::__cleanup()
{
	//if(htmllibmanagerclientmanager != NULL) {
	//
	//delete htmllibmanagerclientmanager;
	//htmllibmanagerclientmanager = NULL;
	//}
	//if(htmllibmanagerdebug != NULL) {
	//
	//delete htmllibmanagerdebug;
	//htmllibmanagerdebug = NULL;
	//}
	//if(htmllibmanagerdebugconsole != NULL) {
	//
	//delete htmllibmanagerdebugconsole;
	//htmllibmanagerdebugconsole = NULL;
	//}
	//if(htmllibmanagerdebuginitjs != NULL) {
	//
	//delete htmllibmanagerdebuginitjs;
	//htmllibmanagerdebuginitjs = NULL;
	//}
	//if(htmllibmanagerdefaultthemename != NULL) {
	//
	//delete htmllibmanagerdefaultthemename;
	//htmllibmanagerdefaultthemename = NULL;
	//}
	//if(htmllibmanagerdefaultuserthemename != NULL) {
	//
	//delete htmllibmanagerdefaultuserthemename;
	//htmllibmanagerdefaultuserthemename = NULL;
	//}
	//if(htmllibmanagerfirebuglitepath != NULL) {
	//
	//delete htmllibmanagerfirebuglitepath;
	//htmllibmanagerfirebuglitepath = NULL;
	//}
	//if(htmllibmanagerforceCQUrlInfo != NULL) {
	//
	//delete htmllibmanagerforceCQUrlInfo;
	//htmllibmanagerforceCQUrlInfo = NULL;
	//}
	//if(htmllibmanagergzip != NULL) {
	//
	//delete htmllibmanagergzip;
	//htmllibmanagergzip = NULL;
	//}
	//if(htmllibmanagermaxage != NULL) {
	//
	//delete htmllibmanagermaxage;
	//htmllibmanagermaxage = NULL;
	//}
	//if(htmllibmanagermaxDataUriSize != NULL) {
	//
	//delete htmllibmanagermaxDataUriSize;
	//htmllibmanagermaxDataUriSize = NULL;
	//}
	//if(htmllibmanagerminify != NULL) {
	//
	//delete htmllibmanagerminify;
	//htmllibmanagerminify = NULL;
	//}
	//if(htmllibmanagerpathlist != NULL) {
	//
	//delete htmllibmanagerpathlist;
	//htmllibmanagerpathlist = NULL;
	//}
	//if(htmllibmanagertiming != NULL) {
	//
	//delete htmllibmanagertiming;
	//htmllibmanagertiming = NULL;
	//}
	//
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *htmllibmanagerclientmanagerKey = "htmllibmanager.clientmanager";
	node = json_object_get_member(pJsonObject, htmllibmanagerclientmanagerKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerclientmanager, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerclientmanager);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdebugKey = "htmllibmanager.debug";
	node = json_object_get_member(pJsonObject, htmllibmanagerdebugKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagerdebug, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagerdebug);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdebugconsoleKey = "htmllibmanager.debug.console";
	node = json_object_get_member(pJsonObject, htmllibmanagerdebugconsoleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagerdebugconsole, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagerdebugconsole);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdebuginitjsKey = "htmllibmanager.debug.init.js";
	node = json_object_get_member(pJsonObject, htmllibmanagerdebuginitjsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerdebuginitjs, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerdebuginitjs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdefaultthemenameKey = "htmllibmanager.defaultthemename";
	node = json_object_get_member(pJsonObject, htmllibmanagerdefaultthemenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerdefaultthemename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerdefaultthemename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdefaultuserthemenameKey = "htmllibmanager.defaultuserthemename";
	node = json_object_get_member(pJsonObject, htmllibmanagerdefaultuserthemenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerdefaultuserthemename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerdefaultuserthemename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerfirebuglitepathKey = "htmllibmanager.firebuglite.path";
	node = json_object_get_member(pJsonObject, htmllibmanagerfirebuglitepathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerfirebuglitepath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerfirebuglitepath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerforceCQUrlInfoKey = "htmllibmanager.forceCQUrlInfo";
	node = json_object_get_member(pJsonObject, htmllibmanagerforceCQUrlInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagerforceCQUrlInfo, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagerforceCQUrlInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagergzipKey = "htmllibmanager.gzip";
	node = json_object_get_member(pJsonObject, htmllibmanagergzipKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagergzip, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagergzip);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagermaxageKey = "htmllibmanager.maxage";
	node = json_object_get_member(pJsonObject, htmllibmanagermaxageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&htmllibmanagermaxage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&htmllibmanagermaxage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagermaxDataUriSizeKey = "htmllibmanager.maxDataUriSize";
	node = json_object_get_member(pJsonObject, htmllibmanagermaxDataUriSizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&htmllibmanagermaxDataUriSize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&htmllibmanagermaxDataUriSize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerminifyKey = "htmllibmanager.minify";
	node = json_object_get_member(pJsonObject, htmllibmanagerminifyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagerminify, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagerminify);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerpathlistKey = "htmllibmanager.path.list";
	node = json_object_get_member(pJsonObject, htmllibmanagerpathlistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerpathlist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerpathlist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagertimingKey = "htmllibmanager.timing";
	node = json_object_get_member(pJsonObject, htmllibmanagertimingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanagertiming, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanagertiming);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::ComDayCqWidgetImplHtmlLibraryManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerclientmanager();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerclientmanager());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerclientmanagerKey = "htmllibmanager.clientmanager";
	json_object_set_member(pJsonObject, htmllibmanagerclientmanagerKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagerdebug();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagerdebug());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdebugKey = "htmllibmanager.debug";
	json_object_set_member(pJsonObject, htmllibmanagerdebugKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagerdebugconsole();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagerdebugconsole());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdebugconsoleKey = "htmllibmanager.debug.console";
	json_object_set_member(pJsonObject, htmllibmanagerdebugconsoleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerdebuginitjs();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerdebuginitjs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdebuginitjsKey = "htmllibmanager.debug.init.js";
	json_object_set_member(pJsonObject, htmllibmanagerdebuginitjsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerdefaultthemename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerdefaultthemename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdefaultthemenameKey = "htmllibmanager.defaultthemename";
	json_object_set_member(pJsonObject, htmllibmanagerdefaultthemenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerdefaultuserthemename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerdefaultuserthemename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdefaultuserthemenameKey = "htmllibmanager.defaultuserthemename";
	json_object_set_member(pJsonObject, htmllibmanagerdefaultuserthemenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerfirebuglitepath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerfirebuglitepath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerfirebuglitepathKey = "htmllibmanager.firebuglite.path";
	json_object_set_member(pJsonObject, htmllibmanagerfirebuglitepathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagerforceCQUrlInfo();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagerforceCQUrlInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerforceCQUrlInfoKey = "htmllibmanager.forceCQUrlInfo";
	json_object_set_member(pJsonObject, htmllibmanagerforceCQUrlInfoKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagergzip();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagergzip());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagergzipKey = "htmllibmanager.gzip";
	json_object_set_member(pJsonObject, htmllibmanagergzipKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHtmllibmanagermaxage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHtmllibmanagermaxage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagermaxageKey = "htmllibmanager.maxage";
	json_object_set_member(pJsonObject, htmllibmanagermaxageKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getHtmllibmanagermaxDataUriSize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getHtmllibmanagermaxDataUriSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagermaxDataUriSizeKey = "htmllibmanager.maxDataUriSize";
	json_object_set_member(pJsonObject, htmllibmanagermaxDataUriSizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagerminify();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagerminify());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerminifyKey = "htmllibmanager.minify";
	json_object_set_member(pJsonObject, htmllibmanagerminifyKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerpathlist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerpathlist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerpathlistKey = "htmllibmanager.path.list";
	json_object_set_member(pJsonObject, htmllibmanagerpathlistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanagertiming();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanagertiming());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagertimingKey = "htmllibmanager.timing";
	json_object_set_member(pJsonObject, htmllibmanagertimingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerclientmanager()
{
	return htmllibmanagerclientmanager;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerclientmanager(ConfigNodePropertyString  htmllibmanagerclientmanager)
{
	this->htmllibmanagerclientmanager = htmllibmanagerclientmanager;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebug()
{
	return htmllibmanagerdebug;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebug(ConfigNodePropertyBoolean  htmllibmanagerdebug)
{
	this->htmllibmanagerdebug = htmllibmanagerdebug;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebugconsole()
{
	return htmllibmanagerdebugconsole;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebugconsole(ConfigNodePropertyBoolean  htmllibmanagerdebugconsole)
{
	this->htmllibmanagerdebugconsole = htmllibmanagerdebugconsole;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebuginitjs()
{
	return htmllibmanagerdebuginitjs;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebuginitjs(ConfigNodePropertyString  htmllibmanagerdebuginitjs)
{
	this->htmllibmanagerdebuginitjs = htmllibmanagerdebuginitjs;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultthemename()
{
	return htmllibmanagerdefaultthemename;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultthemename(ConfigNodePropertyString  htmllibmanagerdefaultthemename)
{
	this->htmllibmanagerdefaultthemename = htmllibmanagerdefaultthemename;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultuserthemename()
{
	return htmllibmanagerdefaultuserthemename;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString  htmllibmanagerdefaultuserthemename)
{
	this->htmllibmanagerdefaultuserthemename = htmllibmanagerdefaultuserthemename;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerfirebuglitepath()
{
	return htmllibmanagerfirebuglitepath;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerfirebuglitepath(ConfigNodePropertyString  htmllibmanagerfirebuglitepath)
{
	this->htmllibmanagerfirebuglitepath = htmllibmanagerfirebuglitepath;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerforceCQUrlInfo()
{
	return htmllibmanagerforceCQUrlInfo;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean  htmllibmanagerforceCQUrlInfo)
{
	this->htmllibmanagerforceCQUrlInfo = htmllibmanagerforceCQUrlInfo;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagergzip()
{
	return htmllibmanagergzip;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagergzip(ConfigNodePropertyBoolean  htmllibmanagergzip)
{
	this->htmllibmanagergzip = htmllibmanagergzip;
}

ConfigNodePropertyInteger
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxage()
{
	return htmllibmanagermaxage;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxage(ConfigNodePropertyInteger  htmllibmanagermaxage)
{
	this->htmllibmanagermaxage = htmllibmanagermaxage;
}

ConfigNodePropertyInteger
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxDataUriSize()
{
	return htmllibmanagermaxDataUriSize;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger  htmllibmanagermaxDataUriSize)
{
	this->htmllibmanagermaxDataUriSize = htmllibmanagermaxDataUriSize;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerminify()
{
	return htmllibmanagerminify;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerminify(ConfigNodePropertyBoolean  htmllibmanagerminify)
{
	this->htmllibmanagerminify = htmllibmanagerminify;
}

ConfigNodePropertyArray
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerpathlist()
{
	return htmllibmanagerpathlist;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerpathlist(ConfigNodePropertyArray  htmllibmanagerpathlist)
{
	this->htmllibmanagerpathlist = htmllibmanagerpathlist;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagertiming()
{
	return htmllibmanagertiming;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagertiming(ConfigNodePropertyBoolean  htmllibmanagertiming)
{
	this->htmllibmanagertiming = htmllibmanagertiming;
}


