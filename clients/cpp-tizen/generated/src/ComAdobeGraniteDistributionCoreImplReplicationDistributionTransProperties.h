/*
 * ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_
#define _ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();
	ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForwardrequests();

	/*! \brief Set 
	 */
	void setForwardrequests(ConfigNodePropertyBoolean  forwardrequests);

private:
	ConfigNodePropertyBoolean forwardrequests;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties_H_ */
