
/*
 * ComAdobeCqDtmImplServletsDTMDeployHookServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDtmImplServletsDTMDeployHookServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDtmstagingipwhitelist();

	/*! \brief Set 
	 */
	void setDtmstagingipwhitelist(ConfigNodePropertyArray dtmstagingipwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDtmproductionipwhitelist();

	/*! \brief Set 
	 */
	void setDtmproductionipwhitelist(ConfigNodePropertyArray dtmproductionipwhitelist);


    private:
    ConfigNodePropertyArray dtmstagingipwhitelist;
    ConfigNodePropertyArray dtmproductionipwhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDtmImplServletsDTMDeployHookServletProperties_H_ */
