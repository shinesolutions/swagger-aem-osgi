#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties()
{
	//__init();
}

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::~OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::__init()
{
	//handlerschemes = new ConfigNodePropertyArray();
	//slingjcrinstallfoldernameregexp = new ConfigNodePropertyString();
	//slingjcrinstallfoldermaxdepth = new ConfigNodePropertyInteger();
	//slingjcrinstallsearchpath = new ConfigNodePropertyArray();
	//slingjcrinstallnewconfigpath = new ConfigNodePropertyString();
	//slingjcrinstallsignalpath = new ConfigNodePropertyString();
	//slingjcrinstallenablewriteback = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::__cleanup()
{
	//if(handlerschemes != NULL) {
	//
	//delete handlerschemes;
	//handlerschemes = NULL;
	//}
	//if(slingjcrinstallfoldernameregexp != NULL) {
	//
	//delete slingjcrinstallfoldernameregexp;
	//slingjcrinstallfoldernameregexp = NULL;
	//}
	//if(slingjcrinstallfoldermaxdepth != NULL) {
	//
	//delete slingjcrinstallfoldermaxdepth;
	//slingjcrinstallfoldermaxdepth = NULL;
	//}
	//if(slingjcrinstallsearchpath != NULL) {
	//
	//delete slingjcrinstallsearchpath;
	//slingjcrinstallsearchpath = NULL;
	//}
	//if(slingjcrinstallnewconfigpath != NULL) {
	//
	//delete slingjcrinstallnewconfigpath;
	//slingjcrinstallnewconfigpath = NULL;
	//}
	//if(slingjcrinstallsignalpath != NULL) {
	//
	//delete slingjcrinstallsignalpath;
	//slingjcrinstallsignalpath = NULL;
	//}
	//if(slingjcrinstallenablewriteback != NULL) {
	//
	//delete slingjcrinstallenablewriteback;
	//slingjcrinstallenablewriteback = NULL;
	//}
	//
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *handlerschemesKey = "handler.schemes";
	node = json_object_get_member(pJsonObject, handlerschemesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&handlerschemes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&handlerschemes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallfoldernameregexpKey = "sling.jcrinstall.folder.name.regexp";
	node = json_object_get_member(pJsonObject, slingjcrinstallfoldernameregexpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingjcrinstallfoldernameregexp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingjcrinstallfoldernameregexp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallfoldermaxdepthKey = "sling.jcrinstall.folder.max.depth";
	node = json_object_get_member(pJsonObject, slingjcrinstallfoldermaxdepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slingjcrinstallfoldermaxdepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slingjcrinstallfoldermaxdepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallsearchpathKey = "sling.jcrinstall.search.path";
	node = json_object_get_member(pJsonObject, slingjcrinstallsearchpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingjcrinstallsearchpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingjcrinstallsearchpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallnewconfigpathKey = "sling.jcrinstall.new.config.path";
	node = json_object_get_member(pJsonObject, slingjcrinstallnewconfigpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingjcrinstallnewconfigpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingjcrinstallnewconfigpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallsignalpathKey = "sling.jcrinstall.signal.path";
	node = json_object_get_member(pJsonObject, slingjcrinstallsignalpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingjcrinstallsignalpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingjcrinstallsignalpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingjcrinstallenablewritebackKey = "sling.jcrinstall.enable.writeback";
	node = json_object_get_member(pJsonObject, slingjcrinstallenablewritebackKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&slingjcrinstallenablewriteback, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&slingjcrinstallenablewriteback);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHandlerschemes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHandlerschemes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *handlerschemesKey = "handler.schemes";
	json_object_set_member(pJsonObject, handlerschemesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingjcrinstallfoldernameregexp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingjcrinstallfoldernameregexp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallfoldernameregexpKey = "sling.jcrinstall.folder.name.regexp";
	json_object_set_member(pJsonObject, slingjcrinstallfoldernameregexpKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlingjcrinstallfoldermaxdepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlingjcrinstallfoldermaxdepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallfoldermaxdepthKey = "sling.jcrinstall.folder.max.depth";
	json_object_set_member(pJsonObject, slingjcrinstallfoldermaxdepthKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingjcrinstallsearchpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingjcrinstallsearchpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallsearchpathKey = "sling.jcrinstall.search.path";
	json_object_set_member(pJsonObject, slingjcrinstallsearchpathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingjcrinstallnewconfigpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingjcrinstallnewconfigpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallnewconfigpathKey = "sling.jcrinstall.new.config.path";
	json_object_set_member(pJsonObject, slingjcrinstallnewconfigpathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingjcrinstallsignalpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingjcrinstallsignalpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallsignalpathKey = "sling.jcrinstall.signal.path";
	json_object_set_member(pJsonObject, slingjcrinstallsignalpathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSlingjcrinstallenablewriteback();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSlingjcrinstallenablewriteback());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingjcrinstallenablewritebackKey = "sling.jcrinstall.enable.writeback";
	json_object_set_member(pJsonObject, slingjcrinstallenablewritebackKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getHandlerschemes()
{
	return handlerschemes;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setHandlerschemes(ConfigNodePropertyArray  handlerschemes)
{
	this->handlerschemes = handlerschemes;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallfoldernameregexp()
{
	return slingjcrinstallfoldernameregexp;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallfoldernameregexp(ConfigNodePropertyString  slingjcrinstallfoldernameregexp)
{
	this->slingjcrinstallfoldernameregexp = slingjcrinstallfoldernameregexp;
}

ConfigNodePropertyInteger
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallfoldermaxdepth()
{
	return slingjcrinstallfoldermaxdepth;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallfoldermaxdepth(ConfigNodePropertyInteger  slingjcrinstallfoldermaxdepth)
{
	this->slingjcrinstallfoldermaxdepth = slingjcrinstallfoldermaxdepth;
}

ConfigNodePropertyArray
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallsearchpath()
{
	return slingjcrinstallsearchpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallsearchpath(ConfigNodePropertyArray  slingjcrinstallsearchpath)
{
	this->slingjcrinstallsearchpath = slingjcrinstallsearchpath;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallnewconfigpath()
{
	return slingjcrinstallnewconfigpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallnewconfigpath(ConfigNodePropertyString  slingjcrinstallnewconfigpath)
{
	this->slingjcrinstallnewconfigpath = slingjcrinstallnewconfigpath;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallsignalpath()
{
	return slingjcrinstallsignalpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallsignalpath(ConfigNodePropertyString  slingjcrinstallsignalpath)
{
	this->slingjcrinstallsignalpath = slingjcrinstallsignalpath;
}

ConfigNodePropertyBoolean
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallenablewriteback()
{
	return slingjcrinstallenablewriteback;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallenablewriteback(ConfigNodePropertyBoolean  slingjcrinstallenablewriteback)
{
	this->slingjcrinstallenablewriteback = slingjcrinstallenablewriteback;
}


