#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::~ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::__init()
{
	//watchwordspositive = new ConfigNodePropertyArray();
	//watchwordsnegative = new ConfigNodePropertyArray();
	//watchwordspath = new ConfigNodePropertyString();
	//sentimentpath = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::__cleanup()
{
	//if(watchwordspositive != NULL) {
	//
	//delete watchwordspositive;
	//watchwordspositive = NULL;
	//}
	//if(watchwordsnegative != NULL) {
	//
	//delete watchwordsnegative;
	//watchwordsnegative = NULL;
	//}
	//if(watchwordspath != NULL) {
	//
	//delete watchwordspath;
	//watchwordspath = NULL;
	//}
	//if(sentimentpath != NULL) {
	//
	//delete sentimentpath;
	//sentimentpath = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *watchwordspositiveKey = "watchwords.positive";
	node = json_object_get_member(pJsonObject, watchwordspositiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&watchwordspositive, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&watchwordspositive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *watchwordsnegativeKey = "watchwords.negative";
	node = json_object_get_member(pJsonObject, watchwordsnegativeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&watchwordsnegative, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&watchwordsnegative);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *watchwordspathKey = "watchwords.path";
	node = json_object_get_member(pJsonObject, watchwordspathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&watchwordspath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&watchwordspath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sentimentpathKey = "sentiment.path";
	node = json_object_get_member(pJsonObject, sentimentpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&sentimentpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&sentimentpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getWatchwordspositive();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getWatchwordspositive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *watchwordspositiveKey = "watchwords.positive";
	json_object_set_member(pJsonObject, watchwordspositiveKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getWatchwordsnegative();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getWatchwordsnegative());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *watchwordsnegativeKey = "watchwords.negative";
	json_object_set_member(pJsonObject, watchwordsnegativeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getWatchwordspath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getWatchwordspath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *watchwordspathKey = "watchwords.path";
	json_object_set_member(pJsonObject, watchwordspathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSentimentpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSentimentpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sentimentpathKey = "sentiment.path";
	json_object_set_member(pJsonObject, sentimentpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordspositive()
{
	return watchwordspositive;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordspositive(ConfigNodePropertyArray  watchwordspositive)
{
	this->watchwordspositive = watchwordspositive;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordsnegative()
{
	return watchwordsnegative;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordsnegative(ConfigNodePropertyArray  watchwordsnegative)
{
	this->watchwordsnegative = watchwordsnegative;
}

ConfigNodePropertyString
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordspath()
{
	return watchwordspath;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordspath(ConfigNodePropertyString  watchwordspath)
{
	this->watchwordspath = watchwordspath;
}

ConfigNodePropertyString
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getSentimentpath()
{
	return sentimentpath;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setSentimentpath(ConfigNodePropertyString  sentimentpath)
{
	this->sentimentpath = sentimentpath;
}


