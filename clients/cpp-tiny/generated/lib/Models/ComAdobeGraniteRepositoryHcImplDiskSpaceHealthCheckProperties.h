
/*
 * ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();


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
	ConfigNodePropertyInteger getDiskspacewarnthreshold();

	/*! \brief Set 
	 */
	void setDiskspacewarnthreshold(ConfigNodePropertyInteger diskspacewarnthreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getDiskspaceerrorthreshold();

	/*! \brief Set 
	 */
	void setDiskspaceerrorthreshold(ConfigNodePropertyInteger diskspaceerrorthreshold);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyInteger diskspacewarnthreshold;
    ConfigNodePropertyInteger diskspaceerrorthreshold;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties_H_ */
