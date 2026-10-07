
/*
 * ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo();
    ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo();


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
	ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo_H_ */
