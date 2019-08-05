using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties>
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
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(ConfigNodePropertyInteger Threshold, ConfigNodePropertyString JobTopicName, ConfigNodePropertyBoolean EmailEnabled)
        {
            
            this.Threshold = Threshold;
            
            this.JobTopicName = JobTopicName;
            
            this.EmailEnabled = EmailEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _Threshold;
            private ConfigNodePropertyString _JobTopicName;
            private ConfigNodePropertyBoolean _EmailEnabled;

            internal ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.Threshold property.
            /// </summary>
            /// <param name="value">Threshold</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder Threshold(ConfigNodePropertyInteger value)
            {
                _Threshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.JobTopicName property.
            /// </summary>
            /// <param name="value">JobTopicName</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder JobTopicName(ConfigNodePropertyString value)
            {
                _JobTopicName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.EmailEnabled property.
            /// </summary>
            /// <param name="value">EmailEnabled</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesBuilder EmailEnabled(ConfigNodePropertyBoolean value)
            {
                _EmailEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(
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