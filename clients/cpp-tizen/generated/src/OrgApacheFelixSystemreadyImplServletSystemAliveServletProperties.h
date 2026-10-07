/*
 * OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_
#define _OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties();
	OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardservletpattern();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString  osgihttpwhiteboardservletpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect);

private:
	ConfigNodePropertyString osgihttpwhiteboardservletpattern;
	ConfigNodePropertyString osgihttpwhiteboardcontextselect;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_ */
