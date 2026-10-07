#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamIdsImplIDSJobProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamIdsImplIDSJobProcessorProperties::ComDayCqDamIdsImplIDSJobProcessorProperties()
{
	//__init();
}

ComDayCqDamIdsImplIDSJobProcessorProperties::~ComDayCqDamIdsImplIDSJobProcessorProperties()
{
	//__cleanup();
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::__init()
{
	//enablemultisession = new ConfigNodePropertyBoolean();
	//idsccenable = new ConfigNodePropertyBoolean();
	//enableretry = new ConfigNodePropertyBoolean();
	//enableretryscripterror = new ConfigNodePropertyBoolean();
	//externalizerdomaincqhost = new ConfigNodePropertyString();
	//externalizerdomainhttp = new ConfigNodePropertyString();
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::__cleanup()
{
	//if(enablemultisession != NULL) {
	//
	//delete enablemultisession;
	//enablemultisession = NULL;
	//}
	//if(idsccenable != NULL) {
	//
	//delete idsccenable;
	//idsccenable = NULL;
	//}
	//if(enableretry != NULL) {
	//
	//delete enableretry;
	//enableretry = NULL;
	//}
	//if(enableretryscripterror != NULL) {
	//
	//delete enableretryscripterror;
	//enableretryscripterror = NULL;
	//}
	//if(externalizerdomaincqhost != NULL) {
	//
	//delete externalizerdomaincqhost;
	//externalizerdomaincqhost = NULL;
	//}
	//if(externalizerdomainhttp != NULL) {
	//
	//delete externalizerdomainhttp;
	//externalizerdomainhttp = NULL;
	//}
	//
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enablemultisessionKey = "enable.multisession";
	node = json_object_get_member(pJsonObject, enablemultisessionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enablemultisession, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enablemultisession);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idsccenableKey = "ids.cc.enable";
	node = json_object_get_member(pJsonObject, idsccenableKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&idsccenable, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&idsccenable);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableretryKey = "enable.retry";
	node = json_object_get_member(pJsonObject, enableretryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableretry, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableretry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *enableretryscripterrorKey = "enable.retry.scripterror";
	node = json_object_get_member(pJsonObject, enableretryscripterrorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableretryscripterror, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableretryscripterror);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalizerdomaincqhostKey = "externalizer.domain.cqhost";
	node = json_object_get_member(pJsonObject, externalizerdomaincqhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&externalizerdomaincqhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&externalizerdomaincqhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalizerdomainhttpKey = "externalizer.domain.http";
	node = json_object_get_member(pJsonObject, externalizerdomainhttpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&externalizerdomainhttp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&externalizerdomainhttp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamIdsImplIDSJobProcessorProperties::ComDayCqDamIdsImplIDSJobProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamIdsImplIDSJobProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnablemultisession();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnablemultisession());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enablemultisessionKey = "enable.multisession";
	json_object_set_member(pJsonObject, enablemultisessionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIdsccenable();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIdsccenable());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idsccenableKey = "ids.cc.enable";
	json_object_set_member(pJsonObject, idsccenableKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableretry();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableretry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableretryKey = "enable.retry";
	json_object_set_member(pJsonObject, enableretryKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableretryscripterror();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableretryscripterror());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableretryscripterrorKey = "enable.retry.scripterror";
	json_object_set_member(pJsonObject, enableretryscripterrorKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExternalizerdomaincqhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExternalizerdomaincqhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizerdomaincqhostKey = "externalizer.domain.cqhost";
	json_object_set_member(pJsonObject, externalizerdomaincqhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExternalizerdomainhttp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExternalizerdomainhttp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizerdomainhttpKey = "externalizer.domain.http";
	json_object_set_member(pJsonObject, externalizerdomainhttpKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnablemultisession()
{
	return enablemultisession;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnablemultisession(ConfigNodePropertyBoolean  enablemultisession)
{
	this->enablemultisession = enablemultisession;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getIdsccenable()
{
	return idsccenable;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setIdsccenable(ConfigNodePropertyBoolean  idsccenable)
{
	this->idsccenable = idsccenable;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnableretry()
{
	return enableretry;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnableretry(ConfigNodePropertyBoolean  enableretry)
{
	this->enableretry = enableretry;
}

ConfigNodePropertyBoolean
ComDayCqDamIdsImplIDSJobProcessorProperties::getEnableretryscripterror()
{
	return enableretryscripterror;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setEnableretryscripterror(ConfigNodePropertyBoolean  enableretryscripterror)
{
	this->enableretryscripterror = enableretryscripterror;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSJobProcessorProperties::getExternalizerdomaincqhost()
{
	return externalizerdomaincqhost;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setExternalizerdomaincqhost(ConfigNodePropertyString  externalizerdomaincqhost)
{
	this->externalizerdomaincqhost = externalizerdomaincqhost;
}

ConfigNodePropertyString
ComDayCqDamIdsImplIDSJobProcessorProperties::getExternalizerdomainhttp()
{
	return externalizerdomainhttp;
}

void
ComDayCqDamIdsImplIDSJobProcessorProperties::setExternalizerdomainhttp(ConfigNodePropertyString  externalizerdomainhttp)
{
	this->externalizerdomainhttp = externalizerdomainhttp;
}


