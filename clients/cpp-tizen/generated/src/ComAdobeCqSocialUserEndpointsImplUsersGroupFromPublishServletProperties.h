/*
 * ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_
#define _ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_


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

class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties();
	ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString  slingservletextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString  slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString  slingservletmethods);

private:
	ConfigNodePropertyString slingservletextensions;
	ConfigNodePropertyString slingservletpaths;
	ConfigNodePropertyString slingservletmethods;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties_H_ */
