
/*
 * ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_
#define TINY_CPP_CLIENT_ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_


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

class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties();
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsManagerConfigincludeOOTBTemplates();

	/*! \brief Set 
	 */
	void setFormsManagerConfigincludeOOTBTemplates(ConfigNodePropertyBoolean formsManagerConfigincludeOOTBTemplates);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFormsManagerConfigincludeDeprecatedTemplates();

	/*! \brief Set 
	 */
	void setFormsManagerConfigincludeDeprecatedTemplates(ConfigNodePropertyBoolean formsManagerConfigincludeDeprecatedTemplates);


    private:
    ConfigNodePropertyBoolean formsManagerConfigincludeOOTBTemplates;
    ConfigNodePropertyBoolean formsManagerConfigincludeDeprecatedTemplates;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties_H_ */
