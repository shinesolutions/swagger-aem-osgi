
/*
 * ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_


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

class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getRootpath();

	/*! \brief Set 
	 */
	void setRootpath(ConfigNodePropertyString rootpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFixinconsistencies();

	/*! \brief Set 
	 */
	void setFixinconsistencies(ConfigNodePropertyBoolean fixinconsistencies);


    private:
    ConfigNodePropertyString rootpath;
    ConfigNodePropertyBoolean fixinconsistencies;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties_H_ */
