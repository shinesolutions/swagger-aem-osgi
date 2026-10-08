
/*
 * OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo();
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo_H_ */
