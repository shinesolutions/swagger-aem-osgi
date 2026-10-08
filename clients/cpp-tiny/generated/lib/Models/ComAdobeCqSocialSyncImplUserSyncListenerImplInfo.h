
/*
 * ComAdobeCqSocialSyncImplUserSyncListenerImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplUserSyncListenerImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplUserSyncListenerImplInfo();
    ComAdobeCqSocialSyncImplUserSyncListenerImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplUserSyncListenerImplInfo();


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
	ComAdobeCqSocialSyncImplUserSyncListenerImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialSyncImplUserSyncListenerImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplInfo_H_ */
