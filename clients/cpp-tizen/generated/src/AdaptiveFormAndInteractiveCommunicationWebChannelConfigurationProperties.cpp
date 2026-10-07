#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties()
{
	//__init();
}

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::~AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties()
{
	//__cleanup();
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::__init()
{
	//showPlaceholder = new ConfigNodePropertyBoolean();
	//maximumCacheEntries = new ConfigNodePropertyInteger();
	//afscriptingcompatversion = new ConfigNodePropertyDropDown();
	//makeFileNameUnique = new ConfigNodePropertyBoolean();
	//generatingCompliantData = new ConfigNodePropertyBoolean();
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::__cleanup()
{
	//if(showPlaceholder != NULL) {
	//
	//delete showPlaceholder;
	//showPlaceholder = NULL;
	//}
	//if(maximumCacheEntries != NULL) {
	//
	//delete maximumCacheEntries;
	//maximumCacheEntries = NULL;
	//}
	//if(afscriptingcompatversion != NULL) {
	//
	//delete afscriptingcompatversion;
	//afscriptingcompatversion = NULL;
	//}
	//if(makeFileNameUnique != NULL) {
	//
	//delete makeFileNameUnique;
	//makeFileNameUnique = NULL;
	//}
	//if(generatingCompliantData != NULL) {
	//
	//delete generatingCompliantData;
	//generatingCompliantData = NULL;
	//}
	//
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *showPlaceholderKey = "showPlaceholder";
	node = json_object_get_member(pJsonObject, showPlaceholderKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&showPlaceholder, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&showPlaceholder);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maximumCacheEntriesKey = "maximumCacheEntries";
	node = json_object_get_member(pJsonObject, maximumCacheEntriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maximumCacheEntries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maximumCacheEntries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *afscriptingcompatversionKey = "af.scripting.compatversion";
	node = json_object_get_member(pJsonObject, afscriptingcompatversionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&afscriptingcompatversion, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&afscriptingcompatversion);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *makeFileNameUniqueKey = "makeFileNameUnique";
	node = json_object_get_member(pJsonObject, makeFileNameUniqueKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&makeFileNameUnique, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&makeFileNameUnique);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *generatingCompliantDataKey = "generatingCompliantData";
	node = json_object_get_member(pJsonObject, generatingCompliantDataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&generatingCompliantData, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&generatingCompliantData);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getShowPlaceholder();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getShowPlaceholder());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *showPlaceholderKey = "showPlaceholder";
	json_object_set_member(pJsonObject, showPlaceholderKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaximumCacheEntries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaximumCacheEntries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maximumCacheEntriesKey = "maximumCacheEntries";
	json_object_set_member(pJsonObject, maximumCacheEntriesKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getAfscriptingcompatversion();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getAfscriptingcompatversion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *afscriptingcompatversionKey = "af.scripting.compatversion";
	json_object_set_member(pJsonObject, afscriptingcompatversionKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getMakeFileNameUnique();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getMakeFileNameUnique());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *makeFileNameUniqueKey = "makeFileNameUnique";
	json_object_set_member(pJsonObject, makeFileNameUniqueKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGeneratingCompliantData();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGeneratingCompliantData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generatingCompliantDataKey = "generatingCompliantData";
	json_object_set_member(pJsonObject, generatingCompliantDataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getShowPlaceholder()
{
	return showPlaceholder;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setShowPlaceholder(ConfigNodePropertyBoolean  showPlaceholder)
{
	this->showPlaceholder = showPlaceholder;
}

ConfigNodePropertyInteger
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getMaximumCacheEntries()
{
	return maximumCacheEntries;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setMaximumCacheEntries(ConfigNodePropertyInteger  maximumCacheEntries)
{
	this->maximumCacheEntries = maximumCacheEntries;
}

ConfigNodePropertyDropDown
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getAfscriptingcompatversion()
{
	return afscriptingcompatversion;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setAfscriptingcompatversion(ConfigNodePropertyDropDown  afscriptingcompatversion)
{
	this->afscriptingcompatversion = afscriptingcompatversion;
}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getMakeFileNameUnique()
{
	return makeFileNameUnique;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setMakeFileNameUnique(ConfigNodePropertyBoolean  makeFileNameUnique)
{
	this->makeFileNameUnique = makeFileNameUnique;
}

ConfigNodePropertyBoolean
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::getGeneratingCompliantData()
{
	return generatingCompliantData;
}

void
AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties::setGeneratingCompliantData(ConfigNodePropertyBoolean  generatingCompliantData)
{
	this->generatingCompliantData = generatingCompliantData;
}


