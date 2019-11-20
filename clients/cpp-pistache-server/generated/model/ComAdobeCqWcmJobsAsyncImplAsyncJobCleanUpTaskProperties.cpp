/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{
    m_Scheduler_expressionIsSet = false;
    m_Job_purge_thresholdIsSet = false;
    m_Job_purge_max_jobsIsSet = false;
    
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{
}

void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Scheduler_expressionIsSet)
    {
        val["scheduler.expression"] = ModelBase::toJson(m_Scheduler_expression);
    }
    if(m_Job_purge_thresholdIsSet)
    {
        val["job.purge.threshold"] = ModelBase::toJson(m_Job_purge_threshold);
    }
    if(m_Job_purge_max_jobsIsSet)
    {
        val["job.purge.max.jobs"] = ModelBase::toJson(m_Job_purge_max_jobs);
    }
    

    return val;
}

void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::fromJson(nlohmann::json& val)
{
    if(val.find("scheduler.expression") != val.end())
    {
        if(!val["scheduler.expression"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["scheduler.expression"]);
            setSchedulerExpression( newItem );
        }
        
    }
    if(val.find("job.purge.threshold") != val.end())
    {
        if(!val["job.purge.threshold"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["job.purge.threshold"]);
            setJobPurgeThreshold( newItem );
        }
        
    }
    if(val.find("job.purge.max.jobs") != val.end())
    {
        if(!val["job.purge.max.jobs"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["job.purge.max.jobs"]);
            setJobPurgeMaxJobs( newItem );
        }
        
    }
    
}


ConfigNodePropertyString ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getSchedulerExpression() const
{
    return m_Scheduler_expression;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setSchedulerExpression(ConfigNodePropertyString const& value)
{
    m_Scheduler_expression = value;
    m_Scheduler_expressionIsSet = true;
}
bool ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::schedulerExpressionIsSet() const
{
    return m_Scheduler_expressionIsSet;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::unsetScheduler_expression()
{
    m_Scheduler_expressionIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobPurgeThreshold() const
{
    return m_Job_purge_threshold;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobPurgeThreshold(ConfigNodePropertyInteger const& value)
{
    m_Job_purge_threshold = value;
    m_Job_purge_thresholdIsSet = true;
}
bool ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::jobPurgeThresholdIsSet() const
{
    return m_Job_purge_thresholdIsSet;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::unsetJob_purge_threshold()
{
    m_Job_purge_thresholdIsSet = false;
}
ConfigNodePropertyInteger ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobPurgeMaxJobs() const
{
    return m_Job_purge_max_jobs;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobPurgeMaxJobs(ConfigNodePropertyInteger const& value)
{
    m_Job_purge_max_jobs = value;
    m_Job_purge_max_jobsIsSet = true;
}
bool ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::jobPurgeMaxJobsIsSet() const
{
    return m_Job_purge_max_jobsIsSet;
}
void ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::unsetJob_purge_max_jobs()
{
    m_Job_purge_max_jobsIsSet = false;
}

}
}
}
}
