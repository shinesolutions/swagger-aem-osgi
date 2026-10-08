
/*
 * ComDayCqWcmCoreImplVersionManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionManagerImplProperties_H_


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

class ComDayCqWcmCoreImplVersionManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplVersionManagerImplProperties();
    ComDayCqWcmCoreImplVersionManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplVersionManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionmanagercreateVersionOnActivation();

	/*! \brief Set 
	 */
	void setVersionmanagercreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagercreateVersionOnActivation);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionmanagerpurgingEnabled();

	/*! \brief Set 
	 */
	void setVersionmanagerpurgingEnabled(ConfigNodePropertyBoolean versionmanagerpurgingEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionmanagerpurgePaths();

	/*! \brief Set 
	 */
	void setVersionmanagerpurgePaths(ConfigNodePropertyArray versionmanagerpurgePaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionmanagerivPaths();

	/*! \brief Set 
	 */
	void setVersionmanagerivPaths(ConfigNodePropertyArray versionmanagerivPaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagermaxAgeDays();

	/*! \brief Set 
	 */
	void setVersionmanagermaxAgeDays(ConfigNodePropertyInteger versionmanagermaxAgeDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagermaxNumberVersions();

	/*! \brief Set 
	 */
	void setVersionmanagermaxNumberVersions(ConfigNodePropertyInteger versionmanagermaxNumberVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionmanagerminNumberVersions();

	/*! \brief Set 
	 */
	void setVersionmanagerminNumberVersions(ConfigNodePropertyInteger versionmanagerminNumberVersions);


    private:
    ConfigNodePropertyBoolean versionmanagercreateVersionOnActivation;
    ConfigNodePropertyBoolean versionmanagerpurgingEnabled;
    ConfigNodePropertyArray versionmanagerpurgePaths;
    ConfigNodePropertyArray versionmanagerivPaths;
    ConfigNodePropertyInteger versionmanagermaxAgeDays;
    ConfigNodePropertyInteger versionmanagermaxNumberVersions;
    ConfigNodePropertyInteger versionmanagerminNumberVersions;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionManagerImplProperties_H_ */
