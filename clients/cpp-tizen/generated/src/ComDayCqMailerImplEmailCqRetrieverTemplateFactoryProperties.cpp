#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties()
{
	//__init();
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties()
{
	//__cleanup();
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::__init()
{
	//maileremailembed = new ConfigNodePropertyBoolean();
	//maileremailcharset = new ConfigNodePropertyString();
	//maileremailretrieverUserID = new ConfigNodePropertyString();
	//maileremailretrieverUserPWD = new ConfigNodePropertyString();
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::__cleanup()
{
	//if(maileremailembed != NULL) {
	//
	//delete maileremailembed;
	//maileremailembed = NULL;
	//}
	//if(maileremailcharset != NULL) {
	//
	//delete maileremailcharset;
	//maileremailcharset = NULL;
	//}
	//if(maileremailretrieverUserID != NULL) {
	//
	//delete maileremailretrieverUserID;
	//maileremailretrieverUserID = NULL;
	//}
	//if(maileremailretrieverUserPWD != NULL) {
	//
	//delete maileremailretrieverUserPWD;
	//maileremailretrieverUserPWD = NULL;
	//}
	//
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maileremailembedKey = "mailer.email.embed";
	node = json_object_get_member(pJsonObject, maileremailembedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&maileremailembed, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&maileremailembed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *maileremailretrieverUserIDKey = "mailer.email.retrieverUserID";
	node = json_object_get_member(pJsonObject, maileremailretrieverUserIDKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maileremailretrieverUserID, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maileremailretrieverUserID);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maileremailretrieverUserPWDKey = "mailer.email.retrieverUserPWD";
	node = json_object_get_member(pJsonObject, maileremailretrieverUserPWDKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&maileremailretrieverUserPWD, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&maileremailretrieverUserPWD);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getMaileremailembed();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getMaileremailembed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maileremailembedKey = "mailer.email.embed";
	json_object_set_member(pJsonObject, maileremailembedKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaileremailretrieverUserID();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaileremailretrieverUserID());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maileremailretrieverUserIDKey = "mailer.email.retrieverUserID";
	json_object_set_member(pJsonObject, maileremailretrieverUserIDKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMaileremailretrieverUserPWD();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMaileremailretrieverUserPWD());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maileremailretrieverUserPWDKey = "mailer.email.retrieverUserPWD";
	json_object_set_member(pJsonObject, maileremailretrieverUserPWDKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailembed()
{
	return maileremailembed;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailembed(ConfigNodePropertyBoolean  maileremailembed)
{
	this->maileremailembed = maileremailembed;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailcharset()
{
	return maileremailcharset;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailcharset(ConfigNodePropertyString  maileremailcharset)
{
	this->maileremailcharset = maileremailcharset;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailretrieverUserID()
{
	return maileremailretrieverUserID;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailretrieverUserID(ConfigNodePropertyString  maileremailretrieverUserID)
{
	this->maileremailretrieverUserID = maileremailretrieverUserID;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailretrieverUserPWD()
{
	return maileremailretrieverUserPWD;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailretrieverUserPWD(ConfigNodePropertyString  maileremailretrieverUserPWD)
{
	this->maileremailretrieverUserPWD = maileremailretrieverUserPWD;
}


