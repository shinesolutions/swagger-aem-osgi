
/*
 * OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties();
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueryLimitInMemory();

	/*! \brief Set 
	 */
	void setQueryLimitInMemory(ConfigNodePropertyInteger queryLimitInMemory);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueryLimitReads();

	/*! \brief Set 
	 */
	void setQueryLimitReads(ConfigNodePropertyInteger queryLimitReads);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getQueryFailTraversal();

	/*! \brief Set 
	 */
	void setQueryFailTraversal(ConfigNodePropertyBoolean queryFailTraversal);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getFastQuerySize();

	/*! \brief Set 
	 */
	void setFastQuerySize(ConfigNodePropertyBoolean fastQuerySize);


    private:
    ConfigNodePropertyInteger queryLimitInMemory;
    ConfigNodePropertyInteger queryLimitReads;
    ConfigNodePropertyBoolean queryFailTraversal;
    ConfigNodePropertyBoolean fastQuerySize;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties_H_ */
