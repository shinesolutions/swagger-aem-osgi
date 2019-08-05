#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties()
{
	//__init();
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::~ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::__init()
{
	//translatelanguage = new ConfigNodePropertyDropDown();
	//translatedisplay = new ConfigNodePropertyDropDown();
	//translateattribution = new ConfigNodePropertyBoolean();
	//translatecaching = new ConfigNodePropertyDropDown();
	//translatesmartrendering = new ConfigNodePropertyDropDown();
	//translatecachingduration = new ConfigNodePropertyString();
	//translatesessionsaveinterval = new ConfigNodePropertyString();
	//translatesessionsavebatchLimit = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::__cleanup()
{
	//if(translatelanguage != NULL) {
	//
	//delete translatelanguage;
	//translatelanguage = NULL;
	//}
	//if(translatedisplay != NULL) {
	//
	//delete translatedisplay;
	//translatedisplay = NULL;
	//}
	//if(translateattribution != NULL) {
	//
	//delete translateattribution;
	//translateattribution = NULL;
	//}
	//if(translatecaching != NULL) {
	//
	//delete translatecaching;
	//translatecaching = NULL;
	//}
	//if(translatesmartrendering != NULL) {
	//
	//delete translatesmartrendering;
	//translatesmartrendering = NULL;
	//}
	//if(translatecachingduration != NULL) {
	//
	//delete translatecachingduration;
	//translatecachingduration = NULL;
	//}
	//if(translatesessionsaveinterval != NULL) {
	//
	//delete translatesessionsaveinterval;
	//translatesessionsaveinterval = NULL;
	//}
	//if(translatesessionsavebatchLimit != NULL) {
	//
	//delete translatesessionsavebatchLimit;
	//translatesessionsavebatchLimit = NULL;
	//}
	//
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *translatelanguageKey = "translate.language";
	node = json_object_get_member(pJsonObject, translatelanguageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&translatelanguage, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&translatelanguage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatedisplayKey = "translate.display";
	node = json_object_get_member(pJsonObject, translatedisplayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&translatedisplay, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&translatedisplay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translateattributionKey = "translate.attribution";
	node = json_object_get_member(pJsonObject, translateattributionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&translateattribution, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&translateattribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatecachingKey = "translate.caching";
	node = json_object_get_member(pJsonObject, translatecachingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&translatecaching, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&translatecaching);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatesmartrenderingKey = "translate.smart.rendering";
	node = json_object_get_member(pJsonObject, translatesmartrenderingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&translatesmartrendering, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&translatesmartrendering);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatecachingdurationKey = "translate.caching.duration";
	node = json_object_get_member(pJsonObject, translatecachingdurationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&translatecachingduration, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&translatecachingduration);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatesessionsaveintervalKey = "translate.session.save.interval";
	node = json_object_get_member(pJsonObject, translatesessionsaveintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&translatesessionsaveinterval, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&translatesessionsaveinterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *translatesessionsavebatchLimitKey = "translate.session.save.batchLimit";
	node = json_object_get_member(pJsonObject, translatesessionsavebatchLimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&translatesessionsavebatchLimit, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&translatesessionsavebatchLimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTranslatelanguage();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTranslatelanguage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatelanguageKey = "translate.language";
	json_object_set_member(pJsonObject, translatelanguageKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTranslatedisplay();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTranslatedisplay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatedisplayKey = "translate.display";
	json_object_set_member(pJsonObject, translatedisplayKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getTranslateattribution();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getTranslateattribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translateattributionKey = "translate.attribution";
	json_object_set_member(pJsonObject, translateattributionKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTranslatecaching();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTranslatecaching());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatecachingKey = "translate.caching";
	json_object_set_member(pJsonObject, translatecachingKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getTranslatesmartrendering();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getTranslatesmartrendering());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatesmartrenderingKey = "translate.smart.rendering";
	json_object_set_member(pJsonObject, translatesmartrenderingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTranslatecachingduration();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTranslatecachingduration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatecachingdurationKey = "translate.caching.duration";
	json_object_set_member(pJsonObject, translatecachingdurationKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTranslatesessionsaveinterval();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTranslatesessionsaveinterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatesessionsaveintervalKey = "translate.session.save.interval";
	json_object_set_member(pJsonObject, translatesessionsaveintervalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTranslatesessionsavebatchLimit();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTranslatesessionsavebatchLimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *translatesessionsavebatchLimitKey = "translate.session.save.batchLimit";
	json_object_set_member(pJsonObject, translatesessionsavebatchLimitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatelanguage()
{
	return translatelanguage;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatelanguage(ConfigNodePropertyDropDown  translatelanguage)
{
	this->translatelanguage = translatelanguage;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatedisplay()
{
	return translatedisplay;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatedisplay(ConfigNodePropertyDropDown  translatedisplay)
{
	this->translatedisplay = translatedisplay;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslateattribution()
{
	return translateattribution;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslateattribution(ConfigNodePropertyBoolean  translateattribution)
{
	this->translateattribution = translateattribution;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatecaching()
{
	return translatecaching;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatecaching(ConfigNodePropertyDropDown  translatecaching)
{
	this->translatecaching = translatecaching;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesmartrendering()
{
	return translatesmartrendering;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesmartrendering(ConfigNodePropertyDropDown  translatesmartrendering)
{
	this->translatesmartrendering = translatesmartrendering;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatecachingduration()
{
	return translatecachingduration;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatecachingduration(ConfigNodePropertyString  translatecachingduration)
{
	this->translatecachingduration = translatecachingduration;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesessionsaveinterval()
{
	return translatesessionsaveinterval;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesessionsaveinterval(ConfigNodePropertyString  translatesessionsaveinterval)
{
	this->translatesessionsaveinterval = translatesessionsaveinterval;
}

ConfigNodePropertyString
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::getTranslatesessionsavebatchLimit()
{
	return translatesessionsavebatchLimit;
}

void
ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties::setTranslatesessionsavebatchLimit(ConfigNodePropertyString  translatesessionsavebatchLimit)
{
	this->translatesessionsavebatchLimit = translatesessionsavebatchLimit;
}


