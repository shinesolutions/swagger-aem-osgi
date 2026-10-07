#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo()
{
	//__init();
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::~OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::__init()
{
	//pid = std::string();
	//title = std::string();
	//description = std::string();
	//properties = new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties();
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::__cleanup()
{
	//if(pid != NULL) {
	//
	//delete pid;
	//pid = NULL;
	//}
	//if(title != NULL) {
	//
	//delete title;
	//title = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(properties != NULL) {
	//
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pidKey = "pid";
	node = json_object_get_member(pJsonObject, pidKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pid, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *titleKey = "title";
	node = json_object_get_member(pJsonObject, titleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&title, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties")) {
			jsonToValue(&properties, node, "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties", "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties");
		} else {
			
			OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties* obj = static_cast<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPid();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pidKey = "pid";
	json_object_set_member(pJsonObject, pidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTitle();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *titleKey = "title";
	json_object_set_member(pJsonObject, titleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties")) {
		OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties obj = getProperties();
		node = converttoJson(&obj, "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties", "");
	}
	else {
		
		OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties obj = static_cast<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties> (getProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setPid(std::string  pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setTitle(std::string  title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setDescription(std::string  description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo::setProperties(OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties  properties)
{
	this->properties = properties;
}


