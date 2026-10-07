#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::__init()
{
	//patterntime = new ConfigNodePropertyString();
	//patternnewline = new ConfigNodePropertyString();
	//patterndayOfMonth = new ConfigNodePropertyString();
	//patternmonth = new ConfigNodePropertyString();
	//patternyear = new ConfigNodePropertyString();
	//patterndate = new ConfigNodePropertyString();
	//patterndateTime = new ConfigNodePropertyString();
	//patternemail = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::__cleanup()
{
	//if(patterntime != NULL) {
	//
	//delete patterntime;
	//patterntime = NULL;
	//}
	//if(patternnewline != NULL) {
	//
	//delete patternnewline;
	//patternnewline = NULL;
	//}
	//if(patterndayOfMonth != NULL) {
	//
	//delete patterndayOfMonth;
	//patterndayOfMonth = NULL;
	//}
	//if(patternmonth != NULL) {
	//
	//delete patternmonth;
	//patternmonth = NULL;
	//}
	//if(patternyear != NULL) {
	//
	//delete patternyear;
	//patternyear = NULL;
	//}
	//if(patterndate != NULL) {
	//
	//delete patterndate;
	//patterndate = NULL;
	//}
	//if(patterndateTime != NULL) {
	//
	//delete patterndateTime;
	//patterndateTime = NULL;
	//}
	//if(patternemail != NULL) {
	//
	//delete patternemail;
	//patternemail = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *patterntimeKey = "pattern.time";
	node = json_object_get_member(pJsonObject, patterntimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patterntime, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patterntime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patternnewlineKey = "pattern.newline";
	node = json_object_get_member(pJsonObject, patternnewlineKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patternnewline, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patternnewline);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patterndayOfMonthKey = "pattern.dayOfMonth";
	node = json_object_get_member(pJsonObject, patterndayOfMonthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patterndayOfMonth, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patterndayOfMonth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patternmonthKey = "pattern.month";
	node = json_object_get_member(pJsonObject, patternmonthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patternmonth, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patternmonth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patternyearKey = "pattern.year";
	node = json_object_get_member(pJsonObject, patternyearKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patternyear, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patternyear);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patterndateKey = "pattern.date";
	node = json_object_get_member(pJsonObject, patterndateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patterndate, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patterndate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patterndateTimeKey = "pattern.dateTime";
	node = json_object_get_member(pJsonObject, patterndateTimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patterndateTime, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patterndateTime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *patternemailKey = "pattern.email";
	node = json_object_get_member(pJsonObject, patternemailKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&patternemail, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&patternemail);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatterntime();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatterntime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patterntimeKey = "pattern.time";
	json_object_set_member(pJsonObject, patterntimeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatternnewline();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatternnewline());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patternnewlineKey = "pattern.newline";
	json_object_set_member(pJsonObject, patternnewlineKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatterndayOfMonth();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatterndayOfMonth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patterndayOfMonthKey = "pattern.dayOfMonth";
	json_object_set_member(pJsonObject, patterndayOfMonthKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatternmonth();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatternmonth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patternmonthKey = "pattern.month";
	json_object_set_member(pJsonObject, patternmonthKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatternyear();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatternyear());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patternyearKey = "pattern.year";
	json_object_set_member(pJsonObject, patternyearKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatterndate();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatterndate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patterndateKey = "pattern.date";
	json_object_set_member(pJsonObject, patterndateKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatterndateTime();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatterndateTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patterndateTimeKey = "pattern.dateTime";
	json_object_set_member(pJsonObject, patterndateTimeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPatternemail();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPatternemail());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *patternemailKey = "pattern.email";
	json_object_set_member(pJsonObject, patternemailKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterntime()
{
	return patterntime;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterntime(ConfigNodePropertyString  patterntime)
{
	this->patterntime = patterntime;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternnewline()
{
	return patternnewline;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternnewline(ConfigNodePropertyString  patternnewline)
{
	this->patternnewline = patternnewline;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndayOfMonth()
{
	return patterndayOfMonth;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndayOfMonth(ConfigNodePropertyString  patterndayOfMonth)
{
	this->patterndayOfMonth = patterndayOfMonth;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternmonth()
{
	return patternmonth;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternmonth(ConfigNodePropertyString  patternmonth)
{
	this->patternmonth = patternmonth;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternyear()
{
	return patternyear;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternyear(ConfigNodePropertyString  patternyear)
{
	this->patternyear = patternyear;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndate()
{
	return patterndate;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndate(ConfigNodePropertyString  patterndate)
{
	this->patterndate = patterndate;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndateTime()
{
	return patterndateTime;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndateTime(ConfigNodePropertyString  patterndateTime)
{
	this->patterndateTime = patterndateTime;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternemail()
{
	return patternemail;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternemail(ConfigNodePropertyString  patternemail)
{
	this->patternemail = patternemail;
}


