/*
 * ComAdobeGraniteCsrfImplCSRFServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteCsrfImplCSRFServletProperties_H_
#define _ComAdobeGraniteCsrfImplCSRFServletProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteCsrfImplCSRFServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteCsrfImplCSRFServletProperties();
	ComAdobeGraniteCsrfImplCSRFServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteCsrfImplCSRFServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCsrftokenexpiresin();

	/*! \brief Set 
	 */
	void setCsrftokenexpiresin(ConfigNodePropertyInteger  csrftokenexpiresin);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyString  slingauthrequirements);

private:
	ConfigNodePropertyInteger csrftokenexpiresin;
	ConfigNodePropertyString slingauthrequirements;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteCsrfImplCSRFServletProperties_H_ */
