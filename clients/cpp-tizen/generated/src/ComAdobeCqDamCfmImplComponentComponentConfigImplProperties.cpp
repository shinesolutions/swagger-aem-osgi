#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::ComAdobeCqDamCfmImplComponentComponentConfigImplProperties()
{
	//__init();
}

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::~ComAdobeCqDamCfmImplComponentComponentConfigImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::__init()
{
	//damcfmcomponentresourceType = new ConfigNodePropertyString();
	//damcfmcomponentfileReferenceProp = new ConfigNodePropertyString();
	//damcfmcomponentelementsProp = new ConfigNodePropertyString();
	//damcfmcomponentvariationProp = new ConfigNodePropertyString();
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::__cleanup()
{
	//if(damcfmcomponentresourceType != NULL) {
	//
	//delete damcfmcomponentresourceType;
	//damcfmcomponentresourceType = NULL;
	//}
	//if(damcfmcomponentfileReferenceProp != NULL) {
	//
	//delete damcfmcomponentfileReferenceProp;
	//damcfmcomponentfileReferenceProp = NULL;
	//}
	//if(damcfmcomponentelementsProp != NULL) {
	//
	//delete damcfmcomponentelementsProp;
	//damcfmcomponentelementsProp = NULL;
	//}
	//if(damcfmcomponentvariationProp != NULL) {
	//
	//delete damcfmcomponentvariationProp;
	//damcfmcomponentvariationProp = NULL;
	//}
	//
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *damcfmcomponentresourceTypeKey = "dam.cfm.component.resourceType";
	node = json_object_get_member(pJsonObject, damcfmcomponentresourceTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&damcfmcomponentresourceType, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&damcfmcomponentresourceType);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damcfmcomponentfileReferencePropKey = "dam.cfm.component.fileReferenceProp";
	node = json_object_get_member(pJsonObject, damcfmcomponentfileReferencePropKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&damcfmcomponentfileReferenceProp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&damcfmcomponentfileReferenceProp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damcfmcomponentelementsPropKey = "dam.cfm.component.elementsProp";
	node = json_object_get_member(pJsonObject, damcfmcomponentelementsPropKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&damcfmcomponentelementsProp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&damcfmcomponentelementsProp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damcfmcomponentvariationPropKey = "dam.cfm.component.variationProp";
	node = json_object_get_member(pJsonObject, damcfmcomponentvariationPropKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&damcfmcomponentvariationProp, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&damcfmcomponentvariationProp);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDamcfmcomponentresourceType();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDamcfmcomponentresourceType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmcomponentresourceTypeKey = "dam.cfm.component.resourceType";
	json_object_set_member(pJsonObject, damcfmcomponentresourceTypeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDamcfmcomponentfileReferenceProp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDamcfmcomponentfileReferenceProp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmcomponentfileReferencePropKey = "dam.cfm.component.fileReferenceProp";
	json_object_set_member(pJsonObject, damcfmcomponentfileReferencePropKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDamcfmcomponentelementsProp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDamcfmcomponentelementsProp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmcomponentelementsPropKey = "dam.cfm.component.elementsProp";
	json_object_set_member(pJsonObject, damcfmcomponentelementsPropKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDamcfmcomponentvariationProp();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDamcfmcomponentvariationProp());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damcfmcomponentvariationPropKey = "dam.cfm.component.variationProp";
	json_object_set_member(pJsonObject, damcfmcomponentvariationPropKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentresourceType()
{
	return damcfmcomponentresourceType;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentresourceType(ConfigNodePropertyString  damcfmcomponentresourceType)
{
	this->damcfmcomponentresourceType = damcfmcomponentresourceType;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentfileReferenceProp()
{
	return damcfmcomponentfileReferenceProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentfileReferenceProp(ConfigNodePropertyString  damcfmcomponentfileReferenceProp)
{
	this->damcfmcomponentfileReferenceProp = damcfmcomponentfileReferenceProp;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentelementsProp()
{
	return damcfmcomponentelementsProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentelementsProp(ConfigNodePropertyString  damcfmcomponentelementsProp)
{
	this->damcfmcomponentelementsProp = damcfmcomponentelementsProp;
}

ConfigNodePropertyString
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::getDamcfmcomponentvariationProp()
{
	return damcfmcomponentvariationProp;
}

void
ComAdobeCqDamCfmImplComponentComponentConfigImplProperties::setDamcfmcomponentvariationProp(ConfigNodePropertyString  damcfmcomponentvariationProp)
{
	this->damcfmcomponentvariationProp = damcfmcomponentvariationProp;
}


