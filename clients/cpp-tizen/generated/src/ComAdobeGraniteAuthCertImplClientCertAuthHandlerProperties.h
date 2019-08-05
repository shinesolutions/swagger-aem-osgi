/*
 * ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_
#define _ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_


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

class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties();
	ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties_H_ */
