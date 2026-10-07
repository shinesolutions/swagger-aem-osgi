
/*
 * ComDayCqReplicationImplTransportHttpInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplTransportHttpInfo_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplTransportHttpInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqReplicationImplTransportHttpProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplTransportHttpInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplTransportHttpInfo();
    ComDayCqReplicationImplTransportHttpInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplTransportHttpInfo();


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
	ComDayCqReplicationImplTransportHttpProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqReplicationImplTransportHttpProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqReplicationImplTransportHttpProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplTransportHttpInfo_H_ */
