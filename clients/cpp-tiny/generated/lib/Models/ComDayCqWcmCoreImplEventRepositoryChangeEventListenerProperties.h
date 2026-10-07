
/*
 * ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_


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

class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties();
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPaths();

	/*! \brief Set 
	 */
	void setPaths(ConfigNodePropertyArray paths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludedPaths();

	/*! \brief Set 
	 */
	void setExcludedPaths(ConfigNodePropertyArray excludedPaths);


    private:
    ConfigNodePropertyArray paths;
    ConfigNodePropertyArray excludedPaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties_H_ */
