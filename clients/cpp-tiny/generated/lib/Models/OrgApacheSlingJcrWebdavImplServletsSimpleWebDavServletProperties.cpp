

#include "OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.h"

using namespace Tiny;

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties()
{
	davroot = ConfigNodePropertyString();
	davcreateabsoluteuri = ConfigNodePropertyBoolean();
	davrealm = ConfigNodePropertyString();
	collectiontypes = ConfigNodePropertyArray();
	filterprefixes = ConfigNodePropertyArray();
	filtertypes = ConfigNodePropertyString();
	filteruris = ConfigNodePropertyString();
	typecollections = ConfigNodePropertyString();
	typenoncollections = ConfigNodePropertyString();
	typecontent = ConfigNodePropertyString();
}

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::~OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties()
{

}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *davrootKey = "dav.root";

    if(object.has_key(davrootKey))
    {
        bourne::json value = object[davrootKey];




        ConfigNodePropertyString* obj = &davroot;
		obj->fromJson(value.dump());

    }

    const char *davcreateabsoluteuriKey = "dav.create-absolute-uri";

    if(object.has_key(davcreateabsoluteuriKey))
    {
        bourne::json value = object[davcreateabsoluteuriKey];




        ConfigNodePropertyBoolean* obj = &davcreateabsoluteuri;
		obj->fromJson(value.dump());

    }

    const char *davrealmKey = "dav.realm";

    if(object.has_key(davrealmKey))
    {
        bourne::json value = object[davrealmKey];




        ConfigNodePropertyString* obj = &davrealm;
		obj->fromJson(value.dump());

    }

    const char *collectiontypesKey = "collection.types";

    if(object.has_key(collectiontypesKey))
    {
        bourne::json value = object[collectiontypesKey];




        ConfigNodePropertyArray* obj = &collectiontypes;
		obj->fromJson(value.dump());

    }

    const char *filterprefixesKey = "filter.prefixes";

    if(object.has_key(filterprefixesKey))
    {
        bourne::json value = object[filterprefixesKey];




        ConfigNodePropertyArray* obj = &filterprefixes;
		obj->fromJson(value.dump());

    }

    const char *filtertypesKey = "filter.types";

    if(object.has_key(filtertypesKey))
    {
        bourne::json value = object[filtertypesKey];




        ConfigNodePropertyString* obj = &filtertypes;
		obj->fromJson(value.dump());

    }

    const char *filterurisKey = "filter.uris";

    if(object.has_key(filterurisKey))
    {
        bourne::json value = object[filterurisKey];




        ConfigNodePropertyString* obj = &filteruris;
		obj->fromJson(value.dump());

    }

    const char *typecollectionsKey = "type.collections";

    if(object.has_key(typecollectionsKey))
    {
        bourne::json value = object[typecollectionsKey];




        ConfigNodePropertyString* obj = &typecollections;
		obj->fromJson(value.dump());

    }

    const char *typenoncollectionsKey = "type.noncollections";

    if(object.has_key(typenoncollectionsKey))
    {
        bourne::json value = object[typenoncollectionsKey];




        ConfigNodePropertyString* obj = &typenoncollections;
		obj->fromJson(value.dump());

    }

    const char *typecontentKey = "type.content";

    if(object.has_key(typecontentKey))
    {
        bourne::json value = object[typecontentKey];




        ConfigNodePropertyString* obj = &typecontent;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["davroot"] = getDavroot().toJson();






	object["davcreateabsoluteuri"] = getDavcreateabsoluteuri().toJson();






	object["davrealm"] = getDavrealm().toJson();






	object["collectiontypes"] = getCollectiontypes().toJson();






	object["filterprefixes"] = getFilterprefixes().toJson();






	object["filtertypes"] = getFiltertypes().toJson();






	object["filteruris"] = getFilteruris().toJson();






	object["typecollections"] = getTypecollections().toJson();






	object["typenoncollections"] = getTypenoncollections().toJson();






	object["typecontent"] = getTypecontent().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavroot()
{
	return davroot;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavroot(ConfigNodePropertyString davroot)
{
	this->davroot = davroot;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavcreateabsoluteuri()
{
	return davcreateabsoluteuri;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavcreateabsoluteuri(ConfigNodePropertyBoolean davcreateabsoluteuri)
{
	this->davcreateabsoluteuri = davcreateabsoluteuri;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getDavrealm()
{
	return davrealm;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setDavrealm(ConfigNodePropertyString davrealm)
{
	this->davrealm = davrealm;
}

ConfigNodePropertyArray
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getCollectiontypes()
{
	return collectiontypes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setCollectiontypes(ConfigNodePropertyArray collectiontypes)
{
	this->collectiontypes = collectiontypes;
}

ConfigNodePropertyArray
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFilterprefixes()
{
	return filterprefixes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFilterprefixes(ConfigNodePropertyArray filterprefixes)
{
	this->filterprefixes = filterprefixes;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFiltertypes()
{
	return filtertypes;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFiltertypes(ConfigNodePropertyString filtertypes)
{
	this->filtertypes = filtertypes;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getFilteruris()
{
	return filteruris;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setFilteruris(ConfigNodePropertyString filteruris)
{
	this->filteruris = filteruris;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypecollections()
{
	return typecollections;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypecollections(ConfigNodePropertyString typecollections)
{
	this->typecollections = typecollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypenoncollections()
{
	return typenoncollections;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypenoncollections(ConfigNodePropertyString typenoncollections)
{
	this->typenoncollections = typenoncollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::getTypecontent()
{
	return typecontent;
}

void
OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties::setTypecontent(ConfigNodePropertyString typecontent)
{
	this->typecontent = typecontent;
}



