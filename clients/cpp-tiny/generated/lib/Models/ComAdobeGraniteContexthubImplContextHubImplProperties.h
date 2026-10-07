
/*
 * ComAdobeGraniteContexthubImplContextHubImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteContexthubImplContextHubImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteContexthubImplContextHubImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteContexthubImplContextHubImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteContexthubImplContextHubImplProperties();
    ComAdobeGraniteContexthubImplContextHubImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteContexthubImplContextHubImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobegranitecontexthubsilentMode();

	/*! \brief Set 
	 */
	void setComadobegranitecontexthubsilentMode(ConfigNodePropertyBoolean comadobegranitecontexthubsilent_mode);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getComadobegranitecontexthubshowUi();

	/*! \brief Set 
	 */
	void setComadobegranitecontexthubshowUi(ConfigNodePropertyBoolean comadobegranitecontexthubshow_ui);


    private:
    ConfigNodePropertyBoolean comadobegranitecontexthubsilent_mode;
    ConfigNodePropertyBoolean comadobegranitecontexthubshow_ui;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteContexthubImplContextHubImplProperties_H_ */
