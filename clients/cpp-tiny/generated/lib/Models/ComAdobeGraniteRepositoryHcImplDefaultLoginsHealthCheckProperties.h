
/*
 * ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_


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

class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties();
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAccountlogins();

	/*! \brief Set 
	 */
	void setAccountlogins(ConfigNodePropertyArray accountlogins);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getConsolelogins();

	/*! \brief Set 
	 */
	void setConsolelogins(ConfigNodePropertyArray consolelogins);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyArray accountlogins;
    ConfigNodePropertyArray consolelogins;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties_H_ */
