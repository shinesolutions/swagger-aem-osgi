
/*
 * ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmpfilterapplyWhitelist();

	/*! \brief Set 
	 */
	void setXmpfilterapplyWhitelist(ConfigNodePropertyBoolean xmpfilterapply_whitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpfilterwhitelist();

	/*! \brief Set 
	 */
	void setXmpfilterwhitelist(ConfigNodePropertyArray xmpfilterwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmpfilterapplyBlacklist();

	/*! \brief Set 
	 */
	void setXmpfilterapplyBlacklist(ConfigNodePropertyBoolean xmpfilterapply_blacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpfilterblacklist();

	/*! \brief Set 
	 */
	void setXmpfilterblacklist(ConfigNodePropertyArray xmpfilterblacklist);


    private:
    ConfigNodePropertyBoolean xmpfilterapply_whitelist;
    ConfigNodePropertyArray xmpfilterwhitelist;
    ConfigNodePropertyBoolean xmpfilterapply_blacklist;
    ConfigNodePropertyArray xmpfilterblacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties_H_ */
