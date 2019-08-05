using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties>
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
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(ConfigNodePropertyInteger Threshold, ConfigNodePropertyString JobTopicName, ConfigNodePropertyBoolean EmailEnabled)
        {
            
            this.Threshold = Threshold;
            
            this.JobTopicName = JobTopicName;
            
            this.EmailEnabled = EmailEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties left, ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder
        {
            private ConfigNodePropertyInteger _Threshold;
            private ConfigNodePropertyString _JobTopicName;
            private ConfigNodePropertyBoolean _EmailEnabled;

            internal ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.Threshold property.
            /// </summary>
            /// <param name="value">Threshold</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder Threshold(ConfigNodePropertyInteger value)
            {
                _Threshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.JobTopicName property.
            /// </summary>
            /// <param name="value">JobTopicName</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder JobTopicName(ConfigNodePropertyString value)
            {
                _JobTopicName = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.EmailEnabled property.
            /// </summary>
            /// <param name="value">EmailEnabled</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesBuilder EmailEnabled(ConfigNodePropertyBoolean value)
            {
                _EmailEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(
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