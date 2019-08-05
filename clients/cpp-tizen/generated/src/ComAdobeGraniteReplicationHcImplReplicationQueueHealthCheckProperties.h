/*
 * ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_
#define _ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties();
	ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getNumberofretriesallowed();

	/*! \brief Set 
	 */
	void setNumberofretriesallowed(ConfigNodePropertyInteger  numberofretriesallowed);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray  hctags);

private:
	ConfigNodePropertyInteger numberofretriesallowed;
	ConfigNodePropertyArray hctags;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties_H_ */
