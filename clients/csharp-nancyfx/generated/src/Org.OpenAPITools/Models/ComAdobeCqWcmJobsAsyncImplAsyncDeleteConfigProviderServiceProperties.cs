using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties>
    { 
        /// <summary>
        /// Threshold
        /// </summary>
        public ConfigNodePropertyInteger Threshold { get; private set; }

        /// <summary>
        /// JobTopicName
        /// </summary>
        public ConfigNodePropertyString JobTopicName { get; private set; }

        /// <summary>
        /// EmailEnabled
        /// </summary>
        public ConfigNodePropertyBoolean EmailEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties(ConfigNodePropertyInteger Threshold, ConfigNodePropertyString JobTopicName, ConfigNodePropertyBoolean EmailEnabled)
        {
            
            this.Threshold = Threshold;
            
            this.JobTopicName = JobTopicName;
            
            this.EmailEnabled = EmailEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder With()
        {
            return Builder()
                .Threshold(Threshold)
                .JobTopicName(JobTopicName)
                .EmailEnabled(EmailEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _Threshold;
            private ConfigNodePropertyString _JobTopicName;
            private ConfigNodePropertyBoolean _EmailEnabled;

            internal ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.Threshold property.
            /// </summary>
            /// <param name="value">Threshold</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder Threshold(ConfigNodePropertyInteger value)
            {
                _Threshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.JobTopicName property.
            /// </summary>
            /// <param name="value">JobTopicName</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder JobTopicName(ConfigNodePropertyString value)
            {
                _JobTopicName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.EmailEnabled property.
            /// </summary>
            /// <param name="value">EmailEnabled</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesBuilder EmailEnabled(ConfigNodePropertyBoolean value)
            {
                _EmailEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties(
                    Threshold: _Threshold,
                    JobTopicName: _JobTopicName,
                    EmailEnabled: _EmailEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}