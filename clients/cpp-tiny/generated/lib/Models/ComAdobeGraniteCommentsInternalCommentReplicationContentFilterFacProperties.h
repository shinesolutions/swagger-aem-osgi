
/*
 * ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties();
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReplicatecommentresourceTypes();

	/*! \brief Set 
	 */
	void setReplicatecommentresourceTypes(ConfigNodePropertyArray replicatecommentresourceTypes);


    private:
    ConfigNodePropertyArray replicatecommentresourceTypes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties_H_ */
