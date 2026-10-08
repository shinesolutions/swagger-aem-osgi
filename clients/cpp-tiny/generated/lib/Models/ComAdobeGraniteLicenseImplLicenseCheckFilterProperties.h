
/*
 * ComAdobeGraniteLicenseImplLicenseCheckFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties();
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteLicenseImplLicenseCheckFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCheckInternval();

	/*! \brief Set 
	 */
	void setCheckInternval(ConfigNodePropertyInteger checkInternval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludeIds();

	/*! \brief Set 
	 */
	void setExcludeIds(ConfigNodePropertyArray excludeIds);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEncryptPing();

	/*! \brief Set 
	 */
	void setEncryptPing(ConfigNodePropertyBoolean encryptPing);


    private:
    ConfigNodePropertyInteger checkInternval;
    ConfigNodePropertyArray excludeIds;
    ConfigNodePropertyBoolean encryptPing;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteLicenseImplLicenseCheckFilterProperties_H_ */
