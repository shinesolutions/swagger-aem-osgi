
/*
 * ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportagenttoworkerprefix();

	/*! \brief Set 
	 */
	void setDefaulttransportagenttoworkerprefix(ConfigNodePropertyString defaulttransportagenttoworkerprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportagenttomasterprefix();

	/*! \brief Set 
	 */
	void setDefaulttransportagenttomasterprefix(ConfigNodePropertyString defaulttransportagenttomasterprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportinputpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportinputpackage(ConfigNodePropertyString defaulttransportinputpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaulttransportoutputpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportoutputpackage(ConfigNodePropertyString defaulttransportoutputpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaulttransportreplicationsynchronous();

	/*! \brief Set 
	 */
	void setDefaulttransportreplicationsynchronous(ConfigNodePropertyBoolean defaulttransportreplicationsynchronous);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDefaulttransportcontentpackage();

	/*! \brief Set 
	 */
	void setDefaulttransportcontentpackage(ConfigNodePropertyBoolean defaulttransportcontentpackage);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingtransporterdefaultenabled();

	/*! \brief Set 
	 */
	void setOffloadingtransporterdefaultenabled(ConfigNodePropertyBoolean offloadingtransporterdefaultenabled);


    private:
    ConfigNodePropertyString defaulttransportagenttoworkerprefix;
    ConfigNodePropertyString defaulttransportagenttomasterprefix;
    ConfigNodePropertyString defaulttransportinputpackage;
    ConfigNodePropertyString defaulttransportoutputpackage;
    ConfigNodePropertyBoolean defaulttransportreplicationsynchronous;
    ConfigNodePropertyBoolean defaulttransportcontentpackage;
    ConfigNodePropertyBoolean offloadingtransporterdefaultenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_ */
