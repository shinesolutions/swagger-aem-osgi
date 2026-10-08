
/*
 * ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_


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

class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties();
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinThreadPoolSize();

	/*! \brief Set 
	 */
	void setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadPoolSize();

	/*! \brief Set 
	 */
	void setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize);


    private:
    ConfigNodePropertyInteger minThreadPoolSize;
    ConfigNodePropertyInteger maxThreadPoolSize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_ */
