/*
 * ComAdobeCqProjectsImplServletProjectImageServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqProjectsImplServletProjectImageServletProperties_H_
#define _ComAdobeCqProjectsImplServletProjectImageServletProperties_H_


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

class ComAdobeCqProjectsImplServletProjectImageServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqProjectsImplServletProjectImageServletProperties();
	ComAdobeCqProjectsImplServletProjectImageServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqProjectsImplServletProjectImageServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getImagequality();

	/*! \brief Set 
	 */
	void setImagequality(ConfigNodePropertyString  imagequality);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImagesupportedresolutions();

	/*! \brief Set 
	 */
	void setImagesupportedresolutions(ConfigNodePropertyString  imagesupportedresolutions);

private:
	ConfigNodePropertyString imagequality;
	ConfigNodePropertyString imagesupportedresolutions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqProjectsImplServletProjectImageServletProperties_H_ */
