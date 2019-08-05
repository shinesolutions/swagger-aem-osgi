/*
 * ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H_
#define _ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties();
	ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderName();

	/*! \brief Set 
	 */
	void setProviderName(ConfigNodePropertyString  providerName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForwardrequests();

	/*! \brief Set 
	 */
	void setForwardrequests(ConfigNodePropertyBoolean  forwardrequests);

private:
	ConfigNodePropertyString providerName;
	ConfigNodePropertyBoolean forwardrequests;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties_H_ */
