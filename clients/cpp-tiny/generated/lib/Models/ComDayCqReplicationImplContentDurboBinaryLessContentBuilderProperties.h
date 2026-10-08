
/*
 * ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties();
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBinarythreshold();

	/*! \brief Set 
	 */
	void setBinarythreshold(ConfigNodePropertyInteger binarythreshold);


    private:
    ConfigNodePropertyInteger binarythreshold;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties_H_ */
