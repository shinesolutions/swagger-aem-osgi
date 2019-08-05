/*
 * ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_
#define _ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties();
	ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyArray  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString  slingservletextensions);

private:
	ConfigNodePropertyArray slingservletselectors;
	ConfigNodePropertyString slingservletextensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties_H_ */
