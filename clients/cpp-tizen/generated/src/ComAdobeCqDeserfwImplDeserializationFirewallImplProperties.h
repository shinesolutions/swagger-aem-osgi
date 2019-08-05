/*
 * ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_
#define _ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_


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

class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDeserfwImplDeserializationFirewallImplProperties();
	ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDeserfwImplDeserializationFirewallImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFirewalldeserializationwhitelist();

	/*! \brief Set 
	 */
	void setFirewalldeserializationwhitelist(ConfigNodePropertyArray  firewalldeserializationwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFirewalldeserializationblacklist();

	/*! \brief Set 
	 */
	void setFirewalldeserializationblacklist(ConfigNodePropertyArray  firewalldeserializationblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFirewalldeserializationdiagnostics();

	/*! \brief Set 
	 */
	void setFirewalldeserializationdiagnostics(ConfigNodePropertyString  firewalldeserializationdiagnostics);

private:
	ConfigNodePropertyArray firewalldeserializationwhitelist;
	ConfigNodePropertyArray firewalldeserializationblacklist;
	ConfigNodePropertyString firewalldeserializationdiagnostics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_ */
