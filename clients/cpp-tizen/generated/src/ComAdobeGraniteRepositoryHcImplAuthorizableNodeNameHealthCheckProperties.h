/*
 * ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties_H_
#define _ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties();
	ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);

private:
	ConfigNodePropertyArray hctags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties_H_ */
