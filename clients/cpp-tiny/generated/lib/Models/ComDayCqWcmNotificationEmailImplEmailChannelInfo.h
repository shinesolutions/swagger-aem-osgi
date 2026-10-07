
/*
 * ComDayCqWcmNotificationEmailImplEmailChannelInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWcmNotificationEmailImplEmailChannelProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmNotificationEmailImplEmailChannelInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmNotificationEmailImplEmailChannelInfo();
    ComDayCqWcmNotificationEmailImplEmailChannelInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmNotificationEmailImplEmailChannelInfo();


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
	ComDayCqWcmNotificationEmailImplEmailChannelProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmNotificationEmailImplEmailChannelProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWcmNotificationEmailImplEmailChannelProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelInfo_H_ */
