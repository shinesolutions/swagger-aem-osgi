using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties>
    { 
        /// <summary>
        /// SchedulerPeriod
        /// </summary>
        public ConfigNodePropertyInteger SchedulerPeriod { get; private set; }

        /// <summary>
        /// SchedulerConcurrent
        /// </summary>
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; private set; }

        /// <summary>
        /// ServiceBadLinkToleranceInterval
        /// </summary>
        public ConfigNodePropertyInteger ServiceBadLinkToleranceInterval { get; private set; }

        /// <summary>
        /// ServiceCheckOverridePatterns
        /// </summary>
        public ConfigNodePropertyArray ServiceCheckOverridePatterns { get; private set; }

        /// <summary>
        /// ServiceCacheBrokenInternalLinks
        /// </summary>
        public ConfigNodePropertyBoolean ServiceCacheBrokenInternalLinks { get; private set; }

        /// <summary>
        /// ServiceSpecialLinkPrefix
        /// </summary>
        public ConfigNodePropertyArray ServiceSpecialLinkPrefix { get; private set; }

        /// <summary>
        /// ServiceSpecialLinkPatterns
        /// </summary>
        public ConfigNodePropertyArray ServiceSpecialLinkPatterns { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(ConfigNodePropertyInteger SchedulerPeriod, ConfigNodePropertyBoolean SchedulerConcurrent, ConfigNodePropertyInteger ServiceBadLinkToleranceInterval, ConfigNodePropertyArray ServiceCheckOverridePatterns, ConfigNodePropertyBoolean ServiceCacheBrokenInternalLinks, ConfigNodePropertyArray ServiceSpecialLinkPrefix, ConfigNodePropertyArray ServiceSpecialLinkPatterns)
        {
            
            this.SchedulerPeriod = SchedulerPeriod;
            
            this.SchedulerConcurrent = SchedulerConcurrent;
            
            this.ServiceBadLinkToleranceInterval = ServiceBadLinkToleranceInterval;
            
            this.ServiceCheckOverridePatterns = ServiceCheckOverridePatterns;
            
            this.ServiceCacheBrokenInternalLinks = ServiceCacheBrokenInternalLinks;
            
            this.ServiceSpecialLinkPrefix = ServiceSpecialLinkPrefix;
            
            this.ServiceSpecialLinkPatterns = ServiceSpecialLinkPatterns;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder With()
        {
            return Builder()
                .SchedulerPeriod(SchedulerPeriod)
                .SchedulerConcurrent(SchedulerConcurrent)
                .ServiceBadLinkToleranceInterval(ServiceBadLinkToleranceInterval)
                .ServiceCheckOverridePatterns(ServiceCheckOverridePatterns)
                .ServiceCacheBrokenInternalLinks(ServiceCacheBrokenInternalLinks)
                .ServiceSpecialLinkPrefix(ServiceSpecialLinkPrefix)
                .ServiceSpecialLinkPatterns(ServiceSpecialLinkPatterns);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SchedulerPeriod;
            private ConfigNodePropertyBoolean _SchedulerConcurrent;
            private ConfigNodePropertyInteger _ServiceBadLinkToleranceInterval;
            private ConfigNodePropertyArray _ServiceCheckOverridePatterns;
            private ConfigNodePropertyBoolean _ServiceCacheBrokenInternalLinks;
            private ConfigNodePropertyArray _ServiceSpecialLinkPrefix;
            private ConfigNodePropertyArray _ServiceSpecialLinkPatterns;

            internal ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.SchedulerPeriod property.
            /// </summary>
            /// <param name="value">SchedulerPeriod</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder SchedulerPeriod(ConfigNodePropertyInteger value)
            {
                _SchedulerPeriod = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.SchedulerConcurrent property.
            /// </summary>
            /// <param name="value">SchedulerConcurrent</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder SchedulerConcurrent(ConfigNodePropertyBoolean value)
            {
                _SchedulerConcurrent = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.ServiceBadLinkToleranceInterval property.
            /// </summary>
            /// <param name="value">ServiceBadLinkToleranceInterval</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder ServiceBadLinkToleranceInterval(ConfigNodePropertyInteger value)
            {
                _ServiceBadLinkToleranceInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.ServiceCheckOverridePatterns property.
            /// </summary>
            /// <param name="value">ServiceCheckOverridePatterns</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder ServiceCheckOverridePatterns(ConfigNodePropertyArray value)
            {
                _ServiceCheckOverridePatterns = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.ServiceCacheBrokenInternalLinks property.
            /// </summary>
            /// <param name="value">ServiceCacheBrokenInternalLinks</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder ServiceCacheBrokenInternalLinks(ConfigNodePropertyBoolean value)
            {
                _ServiceCacheBrokenInternalLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.ServiceSpecialLinkPrefix property.
            /// </summary>
            /// <param name="value">ServiceSpecialLinkPrefix</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder ServiceSpecialLinkPrefix(ConfigNodePropertyArray value)
            {
                _ServiceSpecialLinkPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.ServiceSpecialLinkPatterns property.
            /// </summary>
            /// <param name="value">ServiceSpecialLinkPatterns</param>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesBuilder ServiceSpecialLinkPatterns(ConfigNodePropertyArray value)
            {
                _ServiceSpecialLinkPatterns = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties</returns>
            public ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(
                    SchedulerPeriod: _SchedulerPeriod,
                    SchedulerConcurrent: _SchedulerConcurrent,
                    ServiceBadLinkToleranceInterval: _ServiceBadLinkToleranceInterval,
                    ServiceCheckOverridePatterns: _ServiceCheckOverridePatterns,
                    ServiceCacheBrokenInternalLinks: _ServiceCacheBrokenInternalLinks,
                    ServiceSpecialLinkPrefix: _ServiceSpecialLinkPrefix,
                    ServiceSpecialLinkPatterns: _ServiceSpecialLinkPatterns
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}