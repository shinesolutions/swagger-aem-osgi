

#include "OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties()
{
	osgihttpwhiteboardservletpattern = ConfigNodePropertyString();
	osgihttpwhiteboardcontextselect = ConfigNodePropertyString();
}

OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::~OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties()
{

}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *osgihttpwhiteboardservletpatternKey = "osgi.http.whiteboard.servlet.pattern";

    if(object.has_key(osgihttpwhiteboardservletpatternKey))
    {
        bourne::json value = object[osgihttpwhiteboardservletpatternKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardservletpattern;
		obj->fromJson(value.dump());

    }

    const char *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";

    if(object.has_key(osgihttpwhiteboardcontextselectKey))
    {
        bourne::json value = object[osgihttpwhiteboardcontextselectKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardcontextselect;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["osgihttpwhiteboardservletpattern"] = getOsgihttpwhiteboardservletpattern().toJson();






	object["osgihttpwhiteboardcontextselect"] = getOsgihttpwhiteboardcontextselect().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::getOsgihttpwhiteboardservletpattern()
{
	return osgihttpwhiteboardservletpattern;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern)
{
	this->osgihttpwhiteboardservletpattern = osgihttpwhiteboardservletpattern;
}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}



