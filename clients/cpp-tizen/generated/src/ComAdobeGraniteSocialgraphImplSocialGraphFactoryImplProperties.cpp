#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties()
{
	//__init();
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::~ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::__init()
{
	//group2memberrelationshipoutgoing = new ConfigNodePropertyString();
	//group2memberexcludedoutgoing = new ConfigNodePropertyArray();
	//group2memberrelationshipincoming = new ConfigNodePropertyString();
	//group2memberexcludedincoming = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::__cleanup()
{
	//if(group2memberrelationshipoutgoing != NULL) {
	//
	//delete group2memberrelationshipoutgoing;
	//group2memberrelationshipoutgoing = NULL;
	//}
	//if(group2memberexcludedoutgoing != NULL) {
	//
	//delete group2memberexcludedoutgoing;
	//group2memberexcludedoutgoing = NULL;
	//}
	//if(group2memberrelationshipincoming != NULL) {
	//
	//delete group2memberrelationshipincoming;
	//group2memberrelationshipincoming = NULL;
	//}
	//if(group2memberexcludedincoming != NULL) {
	//
	//delete group2memberexcludedincoming;
	//group2memberexcludedincoming = NULL;
	//}
	//
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *group2memberrelationshipoutgoingKey = "group2member.relationship.outgoing";
	node = json_object_get_member(pJsonObject, group2memberrelationshipoutgoingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&group2memberrelationshipoutgoing, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&group2memberrelationshipoutgoing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *group2memberexcludedoutgoingKey = "group2member.excluded.outgoing";
	node = json_object_get_member(pJsonObject, group2memberexcludedoutgoingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&group2memberexcludedoutgoing, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&group2memberexcludedoutgoing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *group2memberrelationshipincomingKey = "group2member.relationship.incoming";
	node = json_object_get_member(pJsonObject, group2memberrelationshipincomingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&group2memberrelationshipincoming, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&group2memberrelationshipincoming);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *group2memberexcludedincomingKey = "group2member.excluded.incoming";
	node = json_object_get_member(pJsonObject, group2memberexcludedincomingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&group2memberexcludedincoming, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&group2memberexcludedincoming);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroup2memberrelationshipoutgoing();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroup2memberrelationshipoutgoing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *group2memberrelationshipoutgoingKey = "group2member.relationship.outgoing";
	json_object_set_member(pJsonObject, group2memberrelationshipoutgoingKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroup2memberexcludedoutgoing();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroup2memberexcludedoutgoing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *group2memberexcludedoutgoingKey = "group2member.excluded.outgoing";
	json_object_set_member(pJsonObject, group2memberexcludedoutgoingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGroup2memberrelationshipincoming();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGroup2memberrelationshipincoming());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *group2memberrelationshipincomingKey = "group2member.relationship.incoming";
	json_object_set_member(pJsonObject, group2memberrelationshipincomingKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getGroup2memberexcludedincoming();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getGroup2memberexcludedincoming());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *group2memberexcludedincomingKey = "group2member.excluded.incoming";
	json_object_set_member(pJsonObject, group2memberexcludedincomingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberrelationshipoutgoing()
{
	return group2memberrelationshipoutgoing;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberrelationshipoutgoing(ConfigNodePropertyString  group2memberrelationshipoutgoing)
{
	this->group2memberrelationshipoutgoing = group2memberrelationshipoutgoing;
}

ConfigNodePropertyArray
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberexcludedoutgoing()
{
	return group2memberexcludedoutgoing;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberexcludedoutgoing(ConfigNodePropertyArray  group2memberexcludedoutgoing)
{
	this->group2memberexcludedoutgoing = group2memberexcludedoutgoing;
}

ConfigNodePropertyString
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberrelationshipincoming()
{
	return group2memberrelationshipincoming;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberrelationshipincoming(ConfigNodePropertyString  group2memberrelationshipincoming)
{
	this->group2memberrelationshipincoming = group2memberrelationshipincoming;
}

ConfigNodePropertyArray
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::getGroup2memberexcludedincoming()
{
	return group2memberexcludedincoming;
}

void
ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties::setGroup2memberexcludedincoming(ConfigNodePropertyArray  group2memberexcludedincoming)
{
	this->group2memberexcludedincoming = group2memberexcludedincoming;
}


