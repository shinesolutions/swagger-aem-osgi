
/*
 * ComDayCqTaggingImplTagGarbageCollectorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqTaggingImplTagGarbageCollectorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqTaggingImplTagGarbageCollectorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqTaggingImplTagGarbageCollectorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqTaggingImplTagGarbageCollectorProperties();
    ComDayCqTaggingImplTagGarbageCollectorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqTaggingImplTagGarbageCollectorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);


    private:
    ConfigNodePropertyString schedulerexpression;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqTaggingImplTagGarbageCollectorProperties_H_ */
