
/*
 * ComAdobeGraniteRepositoryServiceUserConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_


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

class ComAdobeGraniteRepositoryServiceUserConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties();
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRepositoryServiceUserConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServiceuserssimpleSubjectPopulation();

	/*! \brief Set 
	 */
	void setServiceuserssimpleSubjectPopulation(ConfigNodePropertyBoolean serviceuserssimpleSubjectPopulation);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServiceuserslist();

	/*! \brief Set 
	 */
	void setServiceuserslist(ConfigNodePropertyArray serviceuserslist);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyBoolean serviceuserssimpleSubjectPopulation;
    ConfigNodePropertyArray serviceuserslist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRepositoryServiceUserConfigurationProperties_H_ */
