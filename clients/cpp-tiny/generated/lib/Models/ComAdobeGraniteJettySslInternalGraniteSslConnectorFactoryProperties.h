
/*
 * ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties();
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobegranitejettysslport();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslport(ConfigNodePropertyInteger comadobegranitejettysslport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitejettysslkeystoreuser();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslkeystoreuser(ConfigNodePropertyString comadobegranitejettysslkeystoreuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitejettysslkeystorepassword();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslkeystorepassword(ConfigNodePropertyString comadobegranitejettysslkeystorepassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitejettysslciphersuitesexcluded();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslciphersuitesexcluded(ConfigNodePropertyArray comadobegranitejettysslciphersuitesexcluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitejettysslciphersuitesincluded();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslciphersuitesincluded(ConfigNodePropertyArray comadobegranitejettysslciphersuitesincluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobegranitejettysslclientcertificate();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslclientcertificate(ConfigNodePropertyDropDown comadobegranitejettysslclientcertificate);


    private:
    ConfigNodePropertyInteger comadobegranitejettysslport;
    ConfigNodePropertyString comadobegranitejettysslkeystoreuser;
    ConfigNodePropertyString comadobegranitejettysslkeystorepassword;
    ConfigNodePropertyArray comadobegranitejettysslciphersuitesexcluded;
    ConfigNodePropertyArray comadobegranitejettysslciphersuitesincluded;
    ConfigNodePropertyDropDown comadobegranitejettysslclientcertificate;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_ */
