
/*
 * ComDayCqReplicationContentStaticContentBuilderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationContentStaticContentBuilderProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationContentStaticContentBuilderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationContentStaticContentBuilderProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationContentStaticContentBuilderProperties();
    ComDayCqReplicationContentStaticContentBuilderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationContentStaticContentBuilderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getHost();

	/*! \brief Set 
	 */
	void setHost(ConfigNodePropertyString host);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPort();

	/*! \brief Set 
	 */
	void setPort(ConfigNodePropertyInteger port);


    private:
    ConfigNodePropertyString host;
    ConfigNodePropertyInteger port;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationContentStaticContentBuilderProperties_H_ */
