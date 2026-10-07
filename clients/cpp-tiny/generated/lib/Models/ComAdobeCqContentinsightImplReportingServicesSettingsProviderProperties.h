
/*
 * ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties();
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getReportingservicesurl();

	/*! \brief Set 
	 */
	void setReportingservicesurl(ConfigNodePropertyString reportingservicesurl);


    private:
    ConfigNodePropertyString reportingservicesurl;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties_H_ */
