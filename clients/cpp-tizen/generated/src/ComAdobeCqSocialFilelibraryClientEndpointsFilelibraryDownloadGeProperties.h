/*
 * ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties_H_
#define _ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties_H_


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

class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties();
	ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString  slingservletselectors);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString  slingservletextensions);

private:
	ConfigNodePropertyString slingservletselectors;
	ConfigNodePropertyString slingservletextensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties_H_ */
