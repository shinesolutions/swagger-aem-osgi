
/*
 * ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSitePathFilters();

	/*! \brief Set 
	 */
	void setSitePathFilters(ConfigNodePropertyArray sitePathFilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSitePackageGroup();

	/*! \brief Set 
	 */
	void setSitePackageGroup(ConfigNodePropertyString sitePackageGroup);


    private:
    ConfigNodePropertyArray fieldWhitelist;
    ConfigNodePropertyArray sitePathFilters;
    ConfigNodePropertyString sitePackageGroup;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H_ */
