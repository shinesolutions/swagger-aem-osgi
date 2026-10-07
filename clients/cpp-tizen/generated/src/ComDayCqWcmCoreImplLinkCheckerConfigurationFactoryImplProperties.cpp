#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::__init()
{
	//linkexpiredprefix = new ConfigNodePropertyString();
	//linkexpiredremove = new ConfigNodePropertyBoolean();
	//linkexpiredsuffix = new ConfigNodePropertyString();
	//linkinvalidprefix = new ConfigNodePropertyString();
	//linkinvalidremove = new ConfigNodePropertyBoolean();
	//linkinvalidsuffix = new ConfigNodePropertyString();
	//linkpredatedprefix = new ConfigNodePropertyString();
	//linkpredatedremove = new ConfigNodePropertyBoolean();
	//linkpredatedsuffix = new ConfigNodePropertyString();
	//linkwcmmodes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::__cleanup()
{
	//if(linkexpiredprefix != NULL) {
	//
	//delete linkexpiredprefix;
	//linkexpiredprefix = NULL;
	//}
	//if(linkexpiredremove != NULL) {
	//
	//delete linkexpiredremove;
	//linkexpiredremove = NULL;
	//}
	//if(linkexpiredsuffix != NULL) {
	//
	//delete linkexpiredsuffix;
	//linkexpiredsuffix = NULL;
	//}
	//if(linkinvalidprefix != NULL) {
	//
	//delete linkinvalidprefix;
	//linkinvalidprefix = NULL;
	//}
	//if(linkinvalidremove != NULL) {
	//
	//delete linkinvalidremove;
	//linkinvalidremove = NULL;
	//}
	//if(linkinvalidsuffix != NULL) {
	//
	//delete linkinvalidsuffix;
	//linkinvalidsuffix = NULL;
	//}
	//if(linkpredatedprefix != NULL) {
	//
	//delete linkpredatedprefix;
	//linkpredatedprefix = NULL;
	//}
	//if(linkpredatedremove != NULL) {
	//
	//delete linkpredatedremove;
	//linkpredatedremove = NULL;
	//}
	//if(linkpredatedsuffix != NULL) {
	//
	//delete linkpredatedsuffix;
	//linkpredatedsuffix = NULL;
	//}
	//if(linkwcmmodes != NULL) {
	//
	//delete linkwcmmodes;
	//linkwcmmodes = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *linkexpiredprefixKey = "link.expired.prefix";
	node = json_object_get_member(pJsonObject, linkexpiredprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkexpiredprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkexpiredprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkexpiredremoveKey = "link.expired.remove";
	node = json_object_get_member(pJsonObject, linkexpiredremoveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkexpiredremove, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkexpiredremove);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkexpiredsuffixKey = "link.expired.suffix";
	node = json_object_get_member(pJsonObject, linkexpiredsuffixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkexpiredsuffix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkexpiredsuffix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkinvalidprefixKey = "link.invalid.prefix";
	node = json_object_get_member(pJsonObject, linkinvalidprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkinvalidprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkinvalidprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkinvalidremoveKey = "link.invalid.remove";
	node = json_object_get_member(pJsonObject, linkinvalidremoveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkinvalidremove, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkinvalidremove);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkinvalidsuffixKey = "link.invalid.suffix";
	node = json_object_get_member(pJsonObject, linkinvalidsuffixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkinvalidsuffix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkinvalidsuffix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkpredatedprefixKey = "link.predated.prefix";
	node = json_object_get_member(pJsonObject, linkpredatedprefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkpredatedprefix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkpredatedprefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkpredatedremoveKey = "link.predated.remove";
	node = json_object_get_member(pJsonObject, linkpredatedremoveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&linkpredatedremove, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&linkpredatedremove);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkpredatedsuffixKey = "link.predated.suffix";
	node = json_object_get_member(pJsonObject, linkpredatedsuffixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&linkpredatedsuffix, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&linkpredatedsuffix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkwcmmodesKey = "link.wcmmodes";
	node = json_object_get_member(pJsonObject, linkwcmmodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&linkwcmmodes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&linkwcmmodes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkexpiredprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkexpiredprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkexpiredprefixKey = "link.expired.prefix";
	json_object_set_member(pJsonObject, linkexpiredprefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkexpiredremove();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkexpiredremove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkexpiredremoveKey = "link.expired.remove";
	json_object_set_member(pJsonObject, linkexpiredremoveKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkexpiredsuffix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkexpiredsuffix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkexpiredsuffixKey = "link.expired.suffix";
	json_object_set_member(pJsonObject, linkexpiredsuffixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkinvalidprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkinvalidprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkinvalidprefixKey = "link.invalid.prefix";
	json_object_set_member(pJsonObject, linkinvalidprefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkinvalidremove();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkinvalidremove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkinvalidremoveKey = "link.invalid.remove";
	json_object_set_member(pJsonObject, linkinvalidremoveKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkinvalidsuffix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkinvalidsuffix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkinvalidsuffixKey = "link.invalid.suffix";
	json_object_set_member(pJsonObject, linkinvalidsuffixKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkpredatedprefix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkpredatedprefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkpredatedprefixKey = "link.predated.prefix";
	json_object_set_member(pJsonObject, linkpredatedprefixKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLinkpredatedremove();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLinkpredatedremove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkpredatedremoveKey = "link.predated.remove";
	json_object_set_member(pJsonObject, linkpredatedremoveKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getLinkpredatedsuffix();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getLinkpredatedsuffix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkpredatedsuffixKey = "link.predated.suffix";
	json_object_set_member(pJsonObject, linkpredatedsuffixKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLinkwcmmodes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLinkwcmmodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkwcmmodesKey = "link.wcmmodes";
	json_object_set_member(pJsonObject, linkwcmmodesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredprefix()
{
	return linkexpiredprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredprefix(ConfigNodePropertyString  linkexpiredprefix)
{
	this->linkexpiredprefix = linkexpiredprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredremove()
{
	return linkexpiredremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredremove(ConfigNodePropertyBoolean  linkexpiredremove)
{
	this->linkexpiredremove = linkexpiredremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkexpiredsuffix()
{
	return linkexpiredsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkexpiredsuffix(ConfigNodePropertyString  linkexpiredsuffix)
{
	this->linkexpiredsuffix = linkexpiredsuffix;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidprefix()
{
	return linkinvalidprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidprefix(ConfigNodePropertyString  linkinvalidprefix)
{
	this->linkinvalidprefix = linkinvalidprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidremove()
{
	return linkinvalidremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidremove(ConfigNodePropertyBoolean  linkinvalidremove)
{
	this->linkinvalidremove = linkinvalidremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkinvalidsuffix()
{
	return linkinvalidsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkinvalidsuffix(ConfigNodePropertyString  linkinvalidsuffix)
{
	this->linkinvalidsuffix = linkinvalidsuffix;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedprefix()
{
	return linkpredatedprefix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedprefix(ConfigNodePropertyString  linkpredatedprefix)
{
	this->linkpredatedprefix = linkpredatedprefix;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedremove()
{
	return linkpredatedremove;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedremove(ConfigNodePropertyBoolean  linkpredatedremove)
{
	this->linkpredatedremove = linkpredatedremove;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkpredatedsuffix()
{
	return linkpredatedsuffix;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkpredatedsuffix(ConfigNodePropertyString  linkpredatedsuffix)
{
	this->linkpredatedsuffix = linkpredatedsuffix;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::getLinkwcmmodes()
{
	return linkwcmmodes;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties::setLinkwcmmodes(ConfigNodePropertyArray  linkwcmmodes)
{
	this->linkwcmmodes = linkwcmmodes;
}


