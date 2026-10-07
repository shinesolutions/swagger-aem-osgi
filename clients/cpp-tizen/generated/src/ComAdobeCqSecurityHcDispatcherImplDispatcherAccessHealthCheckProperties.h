/*
 * ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_
#define _ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_


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

class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();
	ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();

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
	ConfigNodePropertyString getDispatcheraddress();

	/*! \brief Set 
	 */
	void setDispatcheraddress(ConfigNodePropertyString  dispatcheraddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDispatcherfilterallowed();

	/*! \brief Set 
	 */
	void setDispatcherfilterallowed(ConfigNodePropertyArray  dispatcherfilterallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDispatcherfilterblocked();

	/*! \brief Set 
	 */
	void setDispatcherfilterblocked(ConfigNodePropertyArray  dispatcherfilterblocked);

private:
	ConfigNodePropertyArray hctags;
	ConfigNodePropertyString dispatcheraddress;
	ConfigNodePropertyArray dispatcherfilterallowed;
	ConfigNodePropertyArray dispatcherfilterblocked;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H_ */
