#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::__init()
{
	//automoderationsequence = new ConfigNodePropertyArray();
	//automoderationonfailurestop = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::__cleanup()
{
	//if(automoderationsequence != NULL) {
	//
	//delete automoderationsequence;
	//automoderationsequence = NULL;
	//}
	//if(automoderationonfailurestop != NULL) {
	//
	//delete automoderationonfailurestop;
	//automoderationonfailurestop = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *automoderationsequenceKey = "automoderation.sequence";
	node = json_object_get_member(pJsonObject, automoderationsequenceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&automoderationsequence, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&automoderationsequence);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *automoderationonfailurestopKey = "automoderation.onfailurestop";
	node = json_object_get_member(pJsonObject, automoderationonfailurestopKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&automoderationonfailurestop, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&automoderationonfailurestop);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAutomoderationsequence();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAutomoderationsequence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *automoderationsequenceKey = "automoderation.sequence";
	json_object_set_member(pJsonObject, automoderationsequenceKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAutomoderationonfailurestop();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAutomoderationonfailurestop());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *automoderationonfailurestopKey = "automoderation.onfailurestop";
	json_object_set_member(pJsonObject, automoderationonfailurestopKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::getAutomoderationsequence()
{
	return automoderationsequence;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::setAutomoderationsequence(ConfigNodePropertyArray  automoderationsequence)
{
	this->automoderationsequence = automoderationsequence;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::getAutomoderationonfailurestop()
{
	return automoderationonfailurestop;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::setAutomoderationonfailurestop(ConfigNodePropertyBoolean  automoderationonfailurestop)
{
	this->automoderationonfailurestop = automoderationonfailurestop;
}


