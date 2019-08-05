#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{
	//__init();
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::~ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::__init()
{
	//maileremailcharset = new ConfigNodePropertyString();
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::__cleanup()
{
	//if(maileremailcharset != NULL) {
	//
	//delete maileremailcharset;
	//maileremailcharset = NULL;
	//}
	//
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maileremailcharsetKey = "mailer.email.charset";
	node = json_object_get_member(pJsonObject, maileremailcharsetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maileremailcharset, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maileremailcharset);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaileremailcharset();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaileremailcharset());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maileremailcharsetKey = "mailer.email.charset";
	json_object_set_member(pJsonObject, maileremailcharsetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::getMaileremailcharset()
{
	return maileremailcharset;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::setMaileremailcharset(ConfigNodePropertyString  maileremailcharset)
{
	this->maileremailcharset = maileremailcharset;
}


