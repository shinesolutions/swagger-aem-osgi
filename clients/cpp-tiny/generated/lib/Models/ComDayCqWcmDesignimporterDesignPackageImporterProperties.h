
/*
 * ComDayCqWcmDesignimporterDesignPackageImporterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_


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

class ComDayCqWcmDesignimporterDesignPackageImporterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterDesignPackageImporterProperties();
    ComDayCqWcmDesignimporterDesignPackageImporterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterDesignPackageImporterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtractfilter();

	/*! \brief Set 
	 */
	void setExtractfilter(ConfigNodePropertyArray extractfilter);


    private:
    ConfigNodePropertyArray extractfilter;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_ */
