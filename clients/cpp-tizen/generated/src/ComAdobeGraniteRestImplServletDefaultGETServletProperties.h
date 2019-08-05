/*
 * ComAdobeGraniteRestImplServletDefaultGETServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_
#define _ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteRestImplServletDefaultGETServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRestImplServletDefaultGETServletProperties();
	ComAdobeGraniteRestImplServletDefaultGETServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRestImplServletDefaultGETServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDefaultlimit();

	/*! \brief Set 
	 */
	void setDefaultlimit(ConfigNodePropertyInteger  defaultlimit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUseabsoluteuri();

	/*! \brief Set 
	 */
	void setUseabsoluteuri(ConfigNodePropertyBoolean  useabsoluteuri);

private:
	ConfigNodePropertyInteger defaultlimit;
	ConfigNodePropertyBoolean useabsoluteuri;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRestImplServletDefaultGETServletProperties_H_ */
