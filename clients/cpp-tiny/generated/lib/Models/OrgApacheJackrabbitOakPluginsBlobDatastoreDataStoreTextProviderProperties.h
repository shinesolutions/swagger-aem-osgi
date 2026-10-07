
/*
 * OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_


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

class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties();
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDir();

	/*! \brief Set 
	 */
	void setDir(ConfigNodePropertyString dir);


    private:
    ConfigNodePropertyString dir;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties_H_ */
