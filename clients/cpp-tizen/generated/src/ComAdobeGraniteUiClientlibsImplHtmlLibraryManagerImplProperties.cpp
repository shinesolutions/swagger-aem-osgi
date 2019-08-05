#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties()
{
	//__init();
}

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::~ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::__init()
{
	//htmllibmanagertiming = new ConfigNodePropertyBoolean();
	//htmllibmanagerdebuginitjs = new ConfigNodePropertyString();
	//htmllibmanagerminify = new ConfigNodePropertyBoolean();
	//htmllibmanagerdebug = new ConfigNodePropertyBoolean();
	//htmllibmanagergzip = new ConfigNodePropertyBoolean();
	//htmllibmanagermaxDataUriSize = new ConfigNodePropertyInteger();
	//htmllibmanagermaxage = new ConfigNodePropertyInteger();
	//htmllibmanagerforceCQUrlInfo = new ConfigNodePropertyBoolean();
	//htmllibmanagerdefaultthemename = new ConfigNodePropertyString();
	//htmllibmanagerdefaultuserthemename = new ConfigNodePropertyString();
	//htmllibmanagerclientmanager = new ConfigNodePropertyString();
	//htmllibmanagerpathlist = new ConfigNodePropertyArray();
	//htmllibmanagerexcludedpathlist = new ConfigNodePropertyArray();
	//htmllibmanagerprocessorjs = new ConfigNodePropertyArray();
	//htmllibmanagerprocessorcss = new ConfigNodePropertyArray();
	//htmllibmanagerlongcachepatterns = new ConfigNodePropertyArray();
	//htmllibmanagerlongcacheformat = new ConfigNodePropertyString();
	//htmllibmanageruseFileSystemOutputCache = new ConfigNodePropertyBoolean();
	//htmllibmanagerfileSystemOutputCacheLocation = new ConfigNodePropertyString();
	//htmllibmanagerdisablereplacement = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::__cleanup()
{
	//if(htmllibmanagertiming != NULL) {
	//
	//delete htmllibmanagertiming;
	//htmllibmanagertiming = NULL;
	//}
	//if(htmllibmanagerdebuginitjs != NULL) {
	//
	//delete htmllibmanagerdebuginitjs;
	//htmllibmanagerdebuginitjs = NULL;
	//}
	//if(htmllibmanagerminify != NULL) {
	//
	//delete htmllibmanagerminify;
	//htmllibmanagerminify = NULL;
	//}
	//if(htmllibmanagerdebug != NULL) {
	//
	//delete htmllibmanagerdebug;
	//htmllibmanagerdebug = NULL;
	//}
	//if(htmllibmanagergzip != NULL) {
	//
	//delete htmllibmanagergzip;
	//htmllibmanagergzip = NULL;
	//}
	//if(htmllibmanagermaxDataUriSize != NULL) {
	//
	//delete htmllibmanagermaxDataUriSize;
	//htmllibmanagermaxDataUriSize = NULL;
	//}
	//if(htmllibmanagermaxage != NULL) {
	//
	//delete htmllibmanagermaxage;
	//htmllibmanagermaxage = NULL;
	//}
	//if(htmllibmanagerforceCQUrlInfo != NULL) {
	//
	//delete htmllibmanagerforceCQUrlInfo;
	//htmllibmanagerforceCQUrlInfo = NULL;
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
	//if(htmllibmanagerclientmanager != NULL) {
	//
	//delete htmllibmanagerclientmanager;
	//htmllibmanagerclientmanager = NULL;
	//}
	//if(htmllibmanagerpathlist != NULL) {
	//
	//delete htmllibmanagerpathlist;
	//htmllibmanagerpathlist = NULL;
	//}
	//if(htmllibmanagerexcludedpathlist != NULL) {
	//
	//delete htmllibmanagerexcludedpathlist;
	//htmllibmanagerexcludedpathlist = NULL;
	//}
	//if(htmllibmanagerprocessorjs != NULL) {
	//
	//delete htmllibmanagerprocessorjs;
	//htmllibmanagerprocessorjs = NULL;
	//}
	//if(htmllibmanagerprocessorcss != NULL) {
	//
	//delete htmllibmanagerprocessorcss;
	//htmllibmanagerprocessorcss = NULL;
	//}
	//if(htmllibmanagerlongcachepatterns != NULL) {
	//
	//delete htmllibmanagerlongcachepatterns;
	//htmllibmanagerlongcachepatterns = NULL;
	//}
	//if(htmllibmanagerlongcacheformat != NULL) {
	//
	//delete htmllibmanagerlongcacheformat;
	//htmllibmanagerlongcacheformat = NULL;
	//}
	//if(htmllibmanageruseFileSystemOutputCache != NULL) {
	//
	//delete htmllibmanageruseFileSystemOutputCache;
	//htmllibmanageruseFileSystemOutputCache = NULL;
	//}
	//if(htmllibmanagerfileSystemOutputCacheLocation != NULL) {
	//
	//delete htmllibmanagerfileSystemOutputCacheLocation;
	//htmllibmanagerfileSystemOutputCacheLocation = NULL;
	//}
	//if(htmllibmanagerdisablereplacement != NULL) {
	//
	//delete htmllibmanagerdisablereplacement;
	//htmllibmanagerdisablereplacement = NULL;
	//}
	//
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *htmllibmanagerexcludedpathlistKey = "htmllibmanager.excluded.path.list";
	node = json_object_get_member(pJsonObject, htmllibmanagerexcludedpathlistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerexcludedpathlist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerexcludedpathlist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerprocessorjsKey = "htmllibmanager.processor.js";
	node = json_object_get_member(pJsonObject, htmllibmanagerprocessorjsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerprocessorjs, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerprocessorjs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerprocessorcssKey = "htmllibmanager.processor.css";
	node = json_object_get_member(pJsonObject, htmllibmanagerprocessorcssKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerprocessorcss, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerprocessorcss);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerlongcachepatternsKey = "htmllibmanager.longcache.patterns";
	node = json_object_get_member(pJsonObject, htmllibmanagerlongcachepatternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerlongcachepatterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerlongcachepatterns);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerlongcacheformatKey = "htmllibmanager.longcache.format";
	node = json_object_get_member(pJsonObject, htmllibmanagerlongcacheformatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerlongcacheformat, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerlongcacheformat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanageruseFileSystemOutputCacheKey = "htmllibmanager.useFileSystemOutputCache";
	node = json_object_get_member(pJsonObject, htmllibmanageruseFileSystemOutputCacheKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&htmllibmanageruseFileSystemOutputCache, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&htmllibmanageruseFileSystemOutputCache);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerfileSystemOutputCacheLocationKey = "htmllibmanager.fileSystemOutputCacheLocation";
	node = json_object_get_member(pJsonObject, htmllibmanagerfileSystemOutputCacheLocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&htmllibmanagerfileSystemOutputCacheLocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&htmllibmanagerfileSystemOutputCacheLocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *htmllibmanagerdisablereplacementKey = "htmllibmanager.disable.replacement";
	node = json_object_get_member(pJsonObject, htmllibmanagerdisablereplacementKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&htmllibmanagerdisablereplacement, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&htmllibmanagerdisablereplacement);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerexcludedpathlist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerexcludedpathlist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerexcludedpathlistKey = "htmllibmanager.excluded.path.list";
	json_object_set_member(pJsonObject, htmllibmanagerexcludedpathlistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerprocessorjs();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerprocessorjs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerprocessorjsKey = "htmllibmanager.processor.js";
	json_object_set_member(pJsonObject, htmllibmanagerprocessorjsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerprocessorcss();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerprocessorcss());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerprocessorcssKey = "htmllibmanager.processor.css";
	json_object_set_member(pJsonObject, htmllibmanagerprocessorcssKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerlongcachepatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerlongcachepatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerlongcachepatternsKey = "htmllibmanager.longcache.patterns";
	json_object_set_member(pJsonObject, htmllibmanagerlongcachepatternsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerlongcacheformat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerlongcacheformat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerlongcacheformatKey = "htmllibmanager.longcache.format";
	json_object_set_member(pJsonObject, htmllibmanagerlongcacheformatKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getHtmllibmanageruseFileSystemOutputCache();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getHtmllibmanageruseFileSystemOutputCache());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanageruseFileSystemOutputCacheKey = "htmllibmanager.useFileSystemOutputCache";
	json_object_set_member(pJsonObject, htmllibmanageruseFileSystemOutputCacheKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHtmllibmanagerfileSystemOutputCacheLocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHtmllibmanagerfileSystemOutputCacheLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerfileSystemOutputCacheLocationKey = "htmllibmanager.fileSystemOutputCacheLocation";
	json_object_set_member(pJsonObject, htmllibmanagerfileSystemOutputCacheLocationKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHtmllibmanagerdisablereplacement();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHtmllibmanagerdisablereplacement());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *htmllibmanagerdisablereplacementKey = "htmllibmanager.disable.replacement";
	json_object_set_member(pJsonObject, htmllibmanagerdisablereplacementKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagertiming()
{
	return htmllibmanagertiming;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagertiming(ConfigNodePropertyBoolean  htmllibmanagertiming)
{
	this->htmllibmanagertiming = htmllibmanagertiming;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebuginitjs()
{
	return htmllibmanagerdebuginitjs;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebuginitjs(ConfigNodePropertyString  htmllibmanagerdebuginitjs)
{
	this->htmllibmanagerdebuginitjs = htmllibmanagerdebuginitjs;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerminify()
{
	return htmllibmanagerminify;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerminify(ConfigNodePropertyBoolean  htmllibmanagerminify)
{
	this->htmllibmanagerminify = htmllibmanagerminify;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebug()
{
	return htmllibmanagerdebug;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebug(ConfigNodePropertyBoolean  htmllibmanagerdebug)
{
	this->htmllibmanagerdebug = htmllibmanagerdebug;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagergzip()
{
	return htmllibmanagergzip;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagergzip(ConfigNodePropertyBoolean  htmllibmanagergzip)
{
	this->htmllibmanagergzip = htmllibmanagergzip;
}

ConfigNodePropertyInteger
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxDataUriSize()
{
	return htmllibmanagermaxDataUriSize;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger  htmllibmanagermaxDataUriSize)
{
	this->htmllibmanagermaxDataUriSize = htmllibmanagermaxDataUriSize;
}

ConfigNodePropertyInteger
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxage()
{
	return htmllibmanagermaxage;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxage(ConfigNodePropertyInteger  htmllibmanagermaxage)
{
	this->htmllibmanagermaxage = htmllibmanagermaxage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerforceCQUrlInfo()
{
	return htmllibmanagerforceCQUrlInfo;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean  htmllibmanagerforceCQUrlInfo)
{
	this->htmllibmanagerforceCQUrlInfo = htmllibmanagerforceCQUrlInfo;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultthemename()
{
	return htmllibmanagerdefaultthemename;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultthemename(ConfigNodePropertyString  htmllibmanagerdefaultthemename)
{
	this->htmllibmanagerdefaultthemename = htmllibmanagerdefaultthemename;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultuserthemename()
{
	return htmllibmanagerdefaultuserthemename;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString  htmllibmanagerdefaultuserthemename)
{
	this->htmllibmanagerdefaultuserthemename = htmllibmanagerdefaultuserthemename;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerclientmanager()
{
	return htmllibmanagerclientmanager;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerclientmanager(ConfigNodePropertyString  htmllibmanagerclientmanager)
{
	this->htmllibmanagerclientmanager = htmllibmanagerclientmanager;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerpathlist()
{
	return htmllibmanagerpathlist;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerpathlist(ConfigNodePropertyArray  htmllibmanagerpathlist)
{
	this->htmllibmanagerpathlist = htmllibmanagerpathlist;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerexcludedpathlist()
{
	return htmllibmanagerexcludedpathlist;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerexcludedpathlist(ConfigNodePropertyArray  htmllibmanagerexcludedpathlist)
{
	this->htmllibmanagerexcludedpathlist = htmllibmanagerexcludedpathlist;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerprocessorjs()
{
	return htmllibmanagerprocessorjs;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerprocessorjs(ConfigNodePropertyArray  htmllibmanagerprocessorjs)
{
	this->htmllibmanagerprocessorjs = htmllibmanagerprocessorjs;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerprocessorcss()
{
	return htmllibmanagerprocessorcss;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerprocessorcss(ConfigNodePropertyArray  htmllibmanagerprocessorcss)
{
	this->htmllibmanagerprocessorcss = htmllibmanagerprocessorcss;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerlongcachepatterns()
{
	return htmllibmanagerlongcachepatterns;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerlongcachepatterns(ConfigNodePropertyArray  htmllibmanagerlongcachepatterns)
{
	this->htmllibmanagerlongcachepatterns = htmllibmanagerlongcachepatterns;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerlongcacheformat()
{
	return htmllibmanagerlongcacheformat;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerlongcacheformat(ConfigNodePropertyString  htmllibmanagerlongcacheformat)
{
	this->htmllibmanagerlongcacheformat = htmllibmanagerlongcacheformat;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanageruseFileSystemOutputCache()
{
	return htmllibmanageruseFileSystemOutputCache;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanageruseFileSystemOutputCache(ConfigNodePropertyBoolean  htmllibmanageruseFileSystemOutputCache)
{
	this->htmllibmanageruseFileSystemOutputCache = htmllibmanageruseFileSystemOutputCache;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerfileSystemOutputCacheLocation()
{
	return htmllibmanagerfileSystemOutputCacheLocation;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerfileSystemOutputCacheLocation(ConfigNodePropertyString  htmllibmanagerfileSystemOutputCacheLocation)
{
	this->htmllibmanagerfileSystemOutputCacheLocation = htmllibmanagerfileSystemOutputCacheLocation;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdisablereplacement()
{
	return htmllibmanagerdisablereplacement;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdisablereplacement(ConfigNodePropertyArray  htmllibmanagerdisablereplacement)
{
	this->htmllibmanagerdisablereplacement = htmllibmanagerdisablereplacement;
}


