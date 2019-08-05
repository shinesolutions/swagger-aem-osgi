using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties:  IEquatable<ComAdobeGraniteWorkflowCoreJobJobHandlerProperties>
    { 
        /// <summary>
        /// JobTopics
        /// </summary>
        public ConfigNodePropertyArray JobTopics { get; private set; }

        /// <summary>
        /// AllowSelfProcessTermination
        /// </summary>
        public ConfigNodePropertyBoolean AllowSelfProcessTermination { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(ConfigNodePropertyArray JobTopics, ConfigNodePropertyBoolean AllowSelfProcessTermination)
        {
            
            this.JobTopics = JobTopics;
            
            this.AllowSelfProcessTermination = AllowSelfProcessTermination;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder With()
        {
            return Builder()
                .JobTopics(JobTopics)
                .AllowSelfProcessTermination(AllowSelfProcessTermination);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreJobJobHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties left, ComAdobeGraniteWorkflowCoreJobJobHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties left, ComAdobeGraniteWorkflowCoreJobJobHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder
        {
            private ConfigNodePropertyArray _JobTopics;
            private ConfigNodePropertyBoolean _AllowSelfProcessTermination;

            internal ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.JobTopics property.
            /// </summary>
            /// <param name="value">JobTopics</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder JobTopics(ConfigNodePropertyArray value)
            {
                _JobTopics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.AllowSelfProcessTermination property.
            /// </summary>
            /// <param name="value">AllowSelfProcessTermination</param>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerPropertiesBuilder AllowSelfProcessTermination(ConfigNodePropertyBoolean value)
            {
                _AllowSelfProcessTermination = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJobJobHandlerProperties</returns>
            public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(
                    JobTopics: _JobTopics,
                    AllowSelfProcessTermination: _AllowSelfProcessTermination
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}