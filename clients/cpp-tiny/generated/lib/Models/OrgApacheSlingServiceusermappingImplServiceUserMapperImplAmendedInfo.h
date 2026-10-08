
/*
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo();
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo();


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
	OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo_H_ */
