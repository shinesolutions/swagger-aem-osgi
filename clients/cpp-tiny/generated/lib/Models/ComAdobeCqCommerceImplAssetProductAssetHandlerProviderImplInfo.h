
/*
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo();
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo();


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
	ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo_H_ */
