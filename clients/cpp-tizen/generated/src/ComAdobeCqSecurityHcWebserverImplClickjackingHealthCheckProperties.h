/*
 * ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_
#define _ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_


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

class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties();
	ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties();

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
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWebserveraddress();

	/*! \brief Set 
	 */
	void setWebserveraddress(ConfigNodePropertyString  webserveraddress);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString webserveraddress;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties_H_ */
