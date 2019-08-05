/*
 * ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_
#define _ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties();
	ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getComadobegranitejettysslport();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslport(ConfigNodePropertyInteger  comadobegranitejettysslport);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitejettysslkeystoreuser();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslkeystoreuser(ConfigNodePropertyString  comadobegranitejettysslkeystoreuser);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitejettysslkeystorepassword();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslkeystorepassword(ConfigNodePropertyString  comadobegranitejettysslkeystorepassword);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitejettysslciphersuitesexcluded();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslciphersuitesexcluded(ConfigNodePropertyArray  comadobegranitejettysslciphersuitesexcluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getComadobegranitejettysslciphersuitesincluded();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslciphersuitesincluded(ConfigNodePropertyArray  comadobegranitejettysslciphersuitesincluded);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getComadobegranitejettysslclientcertificate();

	/*! \brief Set 
	 */
	void setComadobegranitejettysslclientcertificate(ConfigNodePropertyDropDown  comadobegranitejettysslclientcertificate);

private:
	ConfigNodePropertyInteger comadobegranitejettysslport;
	ConfigNodePropertyString comadobegranitejettysslkeystoreuser;
	ConfigNodePropertyString comadobegranitejettysslkeystorepassword;
	ConfigNodePropertyArray comadobegranitejettysslciphersuitesexcluded;
	ConfigNodePropertyArray comadobegranitejettysslciphersuitesincluded;
	ConfigNodePropertyDropDown comadobegranitejettysslclientcertificate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties_H_ */
