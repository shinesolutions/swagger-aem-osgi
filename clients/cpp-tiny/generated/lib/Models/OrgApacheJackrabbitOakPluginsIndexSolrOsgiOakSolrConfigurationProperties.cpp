

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties()
{
	pathdescfield = ConfigNodePropertyString();
	pathchildfield = ConfigNodePropertyString();
	pathparentfield = ConfigNodePropertyString();
	pathexactfield = ConfigNodePropertyString();
	catchallfield = ConfigNodePropertyString();
	collapsedpathfield = ConfigNodePropertyString();
	pathdepthfield = ConfigNodePropertyString();
	commitpolicy = ConfigNodePropertyDropDown();
	rows = ConfigNodePropertyInteger();
	pathrestrictions = ConfigNodePropertyBoolean();
	propertyrestrictions = ConfigNodePropertyBoolean();
	primarytypesrestrictions = ConfigNodePropertyBoolean();
	ignoredproperties = ConfigNodePropertyArray();
	usedproperties = ConfigNodePropertyArray();
	typemappings = ConfigNodePropertyArray();
	propertymappings = ConfigNodePropertyArray();
	collapsejcrcontentnodes = ConfigNodePropertyBoolean();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathdescfieldKey = "path.desc.field";

    if(object.has_key(pathdescfieldKey))
    {
        bourne::json value = object[pathdescfieldKey];




        ConfigNodePropertyString* obj = &pathdescfield;
		obj->fromJson(value.dump());

    }

    const char *pathchildfieldKey = "path.child.field";

    if(object.has_key(pathchildfieldKey))
    {
        bourne::json value = object[pathchildfieldKey];




        ConfigNodePropertyString* obj = &pathchildfield;
		obj->fromJson(value.dump());

    }

    const char *pathparentfieldKey = "path.parent.field";

    if(object.has_key(pathparentfieldKey))
    {
        bourne::json value = object[pathparentfieldKey];




        ConfigNodePropertyString* obj = &pathparentfield;
		obj->fromJson(value.dump());

    }

    const char *pathexactfieldKey = "path.exact.field";

    if(object.has_key(pathexactfieldKey))
    {
        bourne::json value = object[pathexactfieldKey];




        ConfigNodePropertyString* obj = &pathexactfield;
		obj->fromJson(value.dump());

    }

    const char *catchallfieldKey = "catch.all.field";

    if(object.has_key(catchallfieldKey))
    {
        bourne::json value = object[catchallfieldKey];




        ConfigNodePropertyString* obj = &catchallfield;
		obj->fromJson(value.dump());

    }

    const char *collapsedpathfieldKey = "collapsed.path.field";

    if(object.has_key(collapsedpathfieldKey))
    {
        bourne::json value = object[collapsedpathfieldKey];




        ConfigNodePropertyString* obj = &collapsedpathfield;
		obj->fromJson(value.dump());

    }

    const char *pathdepthfieldKey = "path.depth.field";

    if(object.has_key(pathdepthfieldKey))
    {
        bourne::json value = object[pathdepthfieldKey];




        ConfigNodePropertyString* obj = &pathdepthfield;
		obj->fromJson(value.dump());

    }

    const char *commitpolicyKey = "commit.policy";

    if(object.has_key(commitpolicyKey))
    {
        bourne::json value = object[commitpolicyKey];




        ConfigNodePropertyDropDown* obj = &commitpolicy;
		obj->fromJson(value.dump());

    }

    const char *rowsKey = "rows";

    if(object.has_key(rowsKey))
    {
        bourne::json value = object[rowsKey];




        ConfigNodePropertyInteger* obj = &rows;
		obj->fromJson(value.dump());

    }

    const char *pathrestrictionsKey = "path.restrictions";

    if(object.has_key(pathrestrictionsKey))
    {
        bourne::json value = object[pathrestrictionsKey];




        ConfigNodePropertyBoolean* obj = &pathrestrictions;
		obj->fromJson(value.dump());

    }

    const char *propertyrestrictionsKey = "property.restrictions";

    if(object.has_key(propertyrestrictionsKey))
    {
        bourne::json value = object[propertyrestrictionsKey];




        ConfigNodePropertyBoolean* obj = &propertyrestrictions;
		obj->fromJson(value.dump());

    }

    const char *primarytypesrestrictionsKey = "primarytypes.restrictions";

    if(object.has_key(primarytypesrestrictionsKey))
    {
        bourne::json value = object[primarytypesrestrictionsKey];




        ConfigNodePropertyBoolean* obj = &primarytypesrestrictions;
		obj->fromJson(value.dump());

    }

    const char *ignoredpropertiesKey = "ignored.properties";

    if(object.has_key(ignoredpropertiesKey))
    {
        bourne::json value = object[ignoredpropertiesKey];




        ConfigNodePropertyArray* obj = &ignoredproperties;
		obj->fromJson(value.dump());

    }

    const char *usedpropertiesKey = "used.properties";

    if(object.has_key(usedpropertiesKey))
    {
        bourne::json value = object[usedpropertiesKey];




        ConfigNodePropertyArray* obj = &usedproperties;
		obj->fromJson(value.dump());

    }

    const char *typemappingsKey = "type.mappings";

    if(object.has_key(typemappingsKey))
    {
        bourne::json value = object[typemappingsKey];




        ConfigNodePropertyArray* obj = &typemappings;
		obj->fromJson(value.dump());

    }

    const char *propertymappingsKey = "property.mappings";

    if(object.has_key(propertymappingsKey))
    {
        bourne::json value = object[propertymappingsKey];




        ConfigNodePropertyArray* obj = &propertymappings;
		obj->fromJson(value.dump());

    }

    const char *collapsejcrcontentnodesKey = "collapse.jcrcontent.nodes";

    if(object.has_key(collapsejcrcontentnodesKey))
    {
        bourne::json value = object[collapsejcrcontentnodesKey];




        ConfigNodePropertyBoolean* obj = &collapsejcrcontentnodes;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pathdescfield"] = getPathdescfield().toJson();






	object["pathchildfield"] = getPathchildfield().toJson();






	object["pathparentfield"] = getPathparentfield().toJson();






	object["pathexactfield"] = getPathexactfield().toJson();






	object["catchallfield"] = getCatchallfield().toJson();






	object["collapsedpathfield"] = getCollapsedpathfield().toJson();






	object["pathdepthfield"] = getPathdepthfield().toJson();






	object["commitpolicy"] = getCommitpolicy().toJson();






	object["rows"] = getRows().toJson();






	object["pathrestrictions"] = getPathrestrictions().toJson();






	object["propertyrestrictions"] = getPropertyrestrictions().toJson();






	object["primarytypesrestrictions"] = getPrimarytypesrestrictions().toJson();






	object["ignoredproperties"] = getIgnoredproperties().toJson();






	object["usedproperties"] = getUsedproperties().toJson();






	object["typemappings"] = getTypemappings().toJson();






	object["propertymappings"] = getPropertymappings().toJson();






	object["collapsejcrcontentnodes"] = getCollapsejcrcontentnodes().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathdescfield()
{
	return pathdescfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathdescfield(ConfigNodePropertyString pathdescfield)
{
	this->pathdescfield = pathdescfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathchildfield()
{
	return pathchildfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathchildfield(ConfigNodePropertyString pathchildfield)
{
	this->pathchildfield = pathchildfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathparentfield()
{
	return pathparentfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathparentfield(ConfigNodePropertyString pathparentfield)
{
	this->pathparentfield = pathparentfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathexactfield()
{
	return pathexactfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathexactfield(ConfigNodePropertyString pathexactfield)
{
	this->pathexactfield = pathexactfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCatchallfield()
{
	return catchallfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCatchallfield(ConfigNodePropertyString catchallfield)
{
	this->catchallfield = catchallfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCollapsedpathfield()
{
	return collapsedpathfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCollapsedpathfield(ConfigNodePropertyString collapsedpathfield)
{
	this->collapsedpathfield = collapsedpathfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathdepthfield()
{
	return pathdepthfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathdepthfield(ConfigNodePropertyString pathdepthfield)
{
	this->pathdepthfield = pathdepthfield;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCommitpolicy()
{
	return commitpolicy;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCommitpolicy(ConfigNodePropertyDropDown commitpolicy)
{
	this->commitpolicy = commitpolicy;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getRows()
{
	return rows;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setRows(ConfigNodePropertyInteger rows)
{
	this->rows = rows;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathrestrictions()
{
	return pathrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathrestrictions(ConfigNodePropertyBoolean pathrestrictions)
{
	this->pathrestrictions = pathrestrictions;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPropertyrestrictions()
{
	return propertyrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPropertyrestrictions(ConfigNodePropertyBoolean propertyrestrictions)
{
	this->propertyrestrictions = propertyrestrictions;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPrimarytypesrestrictions()
{
	return primarytypesrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPrimarytypesrestrictions(ConfigNodePropertyBoolean primarytypesrestrictions)
{
	this->primarytypesrestrictions = primarytypesrestrictions;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getIgnoredproperties()
{
	return ignoredproperties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setIgnoredproperties(ConfigNodePropertyArray ignoredproperties)
{
	this->ignoredproperties = ignoredproperties;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getUsedproperties()
{
	return usedproperties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setUsedproperties(ConfigNodePropertyArray usedproperties)
{
	this->usedproperties = usedproperties;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getTypemappings()
{
	return typemappings;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setTypemappings(ConfigNodePropertyArray typemappings)
{
	this->typemappings = typemappings;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPropertymappings()
{
	return propertymappings;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPropertymappings(ConfigNodePropertyArray propertymappings)
{
	this->propertymappings = propertymappings;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCollapsejcrcontentnodes()
{
	return collapsejcrcontentnodes;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCollapsejcrcontentnodes(ConfigNodePropertyBoolean collapsejcrcontentnodes)
{
	this->collapsejcrcontentnodes = collapsejcrcontentnodes;
}



