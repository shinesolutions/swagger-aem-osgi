/*
 * ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_
#define _ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_


#include <string>
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

class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();
	ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobeaemscreensimplremoterequestTimeout();

	/*! \brief Set 
	 */
	void setComadobeaemscreensimplremoterequestTimeout(ConfigNodePropertyInteger  comadobeaemscreensimplremoterequest_timeout);

private:
	ConfigNodePropertyInteger comadobeaemscreensimplremoterequest_timeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties_H_ */
