

#include "OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.h"

using namespace Tiny;

OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties()
{
	osgihttpwhiteboardservletpattern = ConfigNodePropertyString();
	osgihttpwhiteboardcontextselect = ConfigNodePropertyString();
}

OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::~OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties()
{

}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::fromJson(std::string jsonObj)
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
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["osgihttpwhiteboardservletpattern"] = getOsgihttpwhiteboardservletpattern().toJson();






	object["osgihttpwhiteboardcontextselect"] = getOsgihttpwhiteboardcontextselect().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::getOsgihttpwhiteboardservletpattern()
{
	return osgihttpwhiteboardservletpattern;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern)
{
	this->osgihttpwhiteboardservletpattern = osgihttpwhiteboardservletpattern;
}

ConfigNodePropertyString
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}



