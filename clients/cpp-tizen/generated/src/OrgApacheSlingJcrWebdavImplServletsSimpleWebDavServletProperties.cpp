#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties()
{
	//__init();
}

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::~OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::__init()
{
	//davroot = new ConfigNodePropertyString();
	//davcreateabsoluteuri = new ConfigNodePropertyBoolean();
	//davrealm = new ConfigNodePropertyString();
	//collectiontypes = new ConfigNodePropertyArray();
	//filterprefixes = new ConfigNodePropertyArray();
	//filtertypes = new ConfigNodePropertyString();
	//filteruris = new ConfigNodePropertyString();
	//typecollections = new ConfigNodePropertyString();
	//typenoncollections = new ConfigNodePropertyString();
	//typecontent = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::__cleanup()
{
	//if(davroot != NULL) {
	//
	//delete davroot;
	//davroot = NULL;
	//}
	//if(davcreateabsoluteuri != NULL) {
	//
	//delete davcreateabsoluteuri;
	//davcreateabsoluteuri = NULL;
	//}
	//if(davrealm != NULL) {
	//
	//delete davrealm;
	//davrealm = NULL;
	//}
	//if(collectiontypes != NULL) {
	//
	//delete collectiontypes;
	//collectiontypes = NULL;
	//}
	//if(filterprefixes != NULL) {
	//
	//delete filterprefixes;
	//filterprefixes = NULL;
	//}
	//if(filtertypes != NULL) {
	//
	//delete filtertypes;
	//filtertypes = NULL;
	//}
	//if(filteruris != NULL) {
	//
	//delete filteruris;
	//filteruris = NULL;
	//}
	//if(typecollections != NULL) {
	//
	//delete typecollections;
	//typecollections = NULL;
	//}
	//if(typenoncollections != NULL) {
	//
	//delete typenoncollections;
	//typenoncollections = NULL;
	//}
	//if(typecontent != NULL) {
	//
	//delete typecontent;
	//typecontent = NULL;
	//}
	//
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *davrootKey = "dav.root";
	node = json_object_get_member(pJsonObject, davrootKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&davroot, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&davroot);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *davcreateabsoluteuriKey = "dav.create-absolute-uri";
	node = json_object_get_member(pJsonObject, davcreateabsoluteuriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&davcreateabsoluteuri, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&davcreateabsoluteuri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *davrealmKey = "dav.realm";
	node = json_object_get_member(pJsonObject, davrealmKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&davrealm, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&davrealm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *collectiontypesKey = "collection.types";
	node = json_object_get_member(pJsonObject, collectiontypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&collectiontypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&collectiontypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filterprefixesKey = "filter.prefixes";
	node = json_object_get_member(pJsonObject, filterprefixesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filterprefixes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filterprefixes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filtertypesKey = "filter.types";
	node = json_object_get_member(pJsonObject, filtertypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&filtertypes, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&filtertypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filterurisKey = "filter.uris";
	node = json_object_get_member(pJsonObject, filterurisKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&filteruris, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&filteruris);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typecollectionsKey = "type.collections";
	node = json_object_get_member(pJsonObject, typecollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typecollections, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typecollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typenoncollectionsKey = "type.noncollections";
	node = json_object_get_member(pJsonObject, typenoncollectionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typenoncollections, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typenoncollections);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typecontentKey = "type.content";
	node = json_object_get_member(pJsonObject, typecontentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&typecontent, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&typecontent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDavroot();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDavroot());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *davrootKey = "dav.root";
	json_object_set_member(pJsonObject, davrootKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDavcreateabsoluteuri();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDavcreateabsoluteuri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *davcreateabsoluteuriKey = "dav.create-absolute-uri";
	json_object_set_member(pJsonObject, davcreateabsoluteuriKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDavrealm();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDavrealm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *davrealmKey = "dav.realm";
	json_object_set_member(pJsonObject, davrealmKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCollectiontypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCollectiontypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *collectiontypesKey = "collection.types";
	json_object_set_member(pJsonObject, collectiontypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFilterprefixes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFilterprefixes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filterprefixesKey = "filter.prefixes";
	json_object_set_member(pJsonObject, filterprefixesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFiltertypes();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFiltertypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filtertypesKey = "filter.types";
	json_object_set_member(pJsonObject, filtertypesKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFilteruris();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFilteruris());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filterurisKey = "filter.uris";
	json_object_set_member(pJsonObject, filterurisKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTypecollections();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypecollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typecollectionsKey = "type.collections";
	json_object_set_member(pJsonObject, typecollectionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTypenoncollections();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypenoncollections());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typenoncollectionsKey = "type.noncollections";
	json_object_set_member(pJsonObject, typenoncollectionsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getTypecontent();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getTypecontent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typecontentKey = "type.content";
	json_object_set_member(pJsonObject, typecontentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavroot()
{
	return davroot;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavroot(ConfigNodePropertyString  davroot)
{
	this->davroot = davroot;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavcreateabsoluteuri()
{
	return davcreateabsoluteuri;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavcreateabsoluteuri(ConfigNodePropertyBoolean  davcreateabsoluteuri)
{
	this->davcreateabsoluteuri = davcreateabsoluteuri;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavrealm()
{
	return davrealm;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavrealm(ConfigNodePropertyString  davrealm)
{
	this->davrealm = davrealm;
}

ConfigNodePropertyArray
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getCollectiontypes()
{
	return collectiontypes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setCollectiontypes(ConfigNodePropertyArray  collectiontypes)
{
	this->collectiontypes = collectiontypes;
}

ConfigNodePropertyArray
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFilterprefixes()
{
	return filterprefixes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFilterprefixes(ConfigNodePropertyArray  filterprefixes)
{
	this->filterprefixes = filterprefixes;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFiltertypes()
{
	return filtertypes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFiltertypes(ConfigNodePropertyString  filtertypes)
{
	this->filtertypes = filtertypes;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFilteruris()
{
	return filteruris;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFilteruris(ConfigNodePropertyString  filteruris)
{
	this->filteruris = filteruris;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypecollections()
{
	return typecollections;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypecollections(ConfigNodePropertyString  typecollections)
{
	this->typecollections = typecollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypenoncollections()
{
	return typenoncollections;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypenoncollections(ConfigNodePropertyString  typenoncollections)
{
	this->typenoncollections = typenoncollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypecontent()
{
	return typecontent;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypecontent(ConfigNodePropertyString  typecontent)
{
	this->typecontent = typecontent;
}


