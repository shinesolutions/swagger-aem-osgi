
/*
 * ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDeserfwImplDeserializationFirewallImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties();
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDeserfwImplDeserializationFirewallImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFirewalldeserializationwhitelist();

	/*! \brief Set 
	 */
	void setFirewalldeserializationwhitelist(ConfigNodePropertyArray firewalldeserializationwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFirewalldeserializationblacklist();

	/*! \brief Set 
	 */
	void setFirewalldeserializationblacklist(ConfigNodePropertyArray firewalldeserializationblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getFirewalldeserializationdiagnostics();

	/*! \brief Set 
	 */
	void setFirewalldeserializationdiagnostics(ConfigNodePropertyString firewalldeserializationdiagnostics);


    private:
    ConfigNodePropertyArray firewalldeserializationwhitelist;
    ConfigNodePropertyArray firewalldeserializationblacklist;
    ConfigNodePropertyString firewalldeserializationdiagnostics;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDeserfwImplDeserializationFirewallImplProperties_H_ */
