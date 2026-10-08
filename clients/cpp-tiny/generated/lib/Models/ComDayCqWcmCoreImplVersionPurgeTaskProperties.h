
/*
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_


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

class ComDayCqWcmCoreImplVersionPurgeTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplVersionPurgeTaskProperties();
    ComDayCqWcmCoreImplVersionPurgeTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplVersionPurgeTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getVersionpurgepaths();

	/*! \brief Set 
	 */
	void setVersionpurgepaths(ConfigNodePropertyArray versionpurgepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getVersionpurgerecursive();

	/*! \brief Set 
	 */
	void setVersionpurgerecursive(ConfigNodePropertyBoolean versionpurgerecursive);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgemaxVersions();

	/*! \brief Set 
	 */
	void setVersionpurgemaxVersions(ConfigNodePropertyInteger versionpurgemaxVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgeminVersions();

	/*! \brief Set 
	 */
	void setVersionpurgeminVersions(ConfigNodePropertyInteger versionpurgeminVersions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getVersionpurgemaxAgeDays();

	/*! \brief Set 
	 */
	void setVersionpurgemaxAgeDays(ConfigNodePropertyInteger versionpurgemaxAgeDays);


    private:
    ConfigNodePropertyArray versionpurgepaths;
    ConfigNodePropertyBoolean versionpurgerecursive;
    ConfigNodePropertyInteger versionpurgemaxVersions;
    ConfigNodePropertyInteger versionpurgeminVersions;
    ConfigNodePropertyInteger versionpurgemaxAgeDays;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplVersionPurgeTaskProperties_H_ */
