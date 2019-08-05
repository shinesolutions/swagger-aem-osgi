/*
 * ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_
#define _ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_


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

class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties();
	ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getBrightedgeurl();

	/*! \brief Set 
	 */
	void setBrightedgeurl(ConfigNodePropertyString  brightedgeurl);

private:
	ConfigNodePropertyString brightedgeurl;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties_H_ */
