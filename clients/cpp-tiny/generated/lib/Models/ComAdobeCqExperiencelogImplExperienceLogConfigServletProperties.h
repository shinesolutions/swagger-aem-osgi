
/*
 * ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties();
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledForGroups();

	/*! \brief Set 
	 */
	void setDisabledForGroups(ConfigNodePropertyArray disabledForGroups);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyArray disabledForGroups;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties_H_ */
