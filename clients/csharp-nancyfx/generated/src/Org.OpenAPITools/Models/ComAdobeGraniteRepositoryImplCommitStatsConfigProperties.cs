using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties:  IEquatable<ComAdobeGraniteRepositoryImplCommitStatsConfigProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// IntervalSeconds
        /// </summary>
        public ConfigNodePropertyInteger IntervalSeconds { get; private set; }

        /// <summary>
        /// CommitsPerIntervalThreshold
        /// </summary>
        public ConfigNodePropertyInteger CommitsPerIntervalThreshold { get; private set; }

        /// <summary>
        /// MaxLocationLength
        /// </summary>
        public ConfigNodePropertyInteger MaxLocationLength { get; private set; }

        /// <summary>
        /// MaxDetailsShown
        /// </summary>
        public ConfigNodePropertyInteger MaxDetailsShown { get; private set; }

        /// <summary>
        /// MinDetailsPercentage
        /// </summary>
        public ConfigNodePropertyInteger MinDetailsPercentage { get; private set; }

        /// <summary>
        /// ThreadMatchers
        /// </summary>
        public ConfigNodePropertyArray ThreadMatchers { get; private set; }

        /// <summary>
        /// MaxGreedyDepth
        /// </summary>
        public ConfigNodePropertyInteger MaxGreedyDepth { get; private set; }

        /// <summary>
        /// GreedyStackMatchers
        /// </summary>
        public ConfigNodePropertyString GreedyStackMatchers { get; private set; }

        /// <summary>
        /// StackFilters
        /// </summary>
        public ConfigNodePropertyArray StackFilters { get; private set; }

        /// <summary>
        /// StackMatchers
        /// </summary>
        public ConfigNodePropertyArray StackMatchers { get; private set; }

        /// <summary>
        /// StackCategorizers
        /// </summary>
        public ConfigNodePropertyArray StackCategorizers { get; private set; }

        /// <summary>
        /// StackShorteners
        /// </summary>
        public ConfigNodePropertyArray StackShorteners { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties()
        {
        }

        private ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyInteger IntervalSeconds, ConfigNodePropertyInteger CommitsPerIntervalThreshold, ConfigNodePropertyInteger MaxLocationLength, ConfigNodePropertyInteger MaxDetailsShown, ConfigNodePropertyInteger MinDetailsPercentage, ConfigNodePropertyArray ThreadMatchers, ConfigNodePropertyInteger MaxGreedyDepth, ConfigNodePropertyString GreedyStackMatchers, ConfigNodePropertyArray StackFilters, ConfigNodePropertyArray StackMatchers, ConfigNodePropertyArray StackCategorizers, ConfigNodePropertyArray StackShorteners)
        {
            
            this.Enabled = Enabled;
            
            this.IntervalSeconds = IntervalSeconds;
            
            this.CommitsPerIntervalThreshold = CommitsPerIntervalThreshold;
            
            this.MaxLocationLength = MaxLocationLength;
            
            this.MaxDetailsShown = MaxDetailsShown;
            
            this.MinDetailsPercentage = MinDetailsPercentage;
            
            this.ThreadMatchers = ThreadMatchers;
            
            this.MaxGreedyDepth = MaxGreedyDepth;
            
            this.GreedyStackMatchers = GreedyStackMatchers;
            
            this.StackFilters = StackFilters;
            
            this.StackMatchers = StackMatchers;
            
            this.StackCategorizers = StackCategorizers;
            
            this.StackShorteners = StackShorteners;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .IntervalSeconds(IntervalSeconds)
                .CommitsPerIntervalThreshold(CommitsPerIntervalThreshold)
                .MaxLocationLength(MaxLocationLength)
                .MaxDetailsShown(MaxDetailsShown)
                .MinDetailsPercentage(MinDetailsPercentage)
                .ThreadMatchers(ThreadMatchers)
                .MaxGreedyDepth(MaxGreedyDepth)
                .GreedyStackMatchers(GreedyStackMatchers)
                .StackFilters(StackFilters)
                .StackMatchers(StackMatchers)
                .StackCategorizers(StackCategorizers)
                .StackShorteners(StackShorteners);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryImplCommitStatsConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties left, ComAdobeGraniteRepositoryImplCommitStatsConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryImplCommitStatsConfigProperties left, ComAdobeGraniteRepositoryImplCommitStatsConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyInteger _IntervalSeconds;
            private ConfigNodePropertyInteger _CommitsPerIntervalThreshold;
            private ConfigNodePropertyInteger _MaxLocationLength;
            private ConfigNodePropertyInteger _MaxDetailsShown;
            private ConfigNodePropertyInteger _MinDetailsPercentage;
            private ConfigNodePropertyArray _ThreadMatchers;
            private ConfigNodePropertyInteger _MaxGreedyDepth;
            private ConfigNodePropertyString _GreedyStackMatchers;
            private ConfigNodePropertyArray _StackFilters;
            private ConfigNodePropertyArray _StackMatchers;
            private ConfigNodePropertyArray _StackCategorizers;
            private ConfigNodePropertyArray _StackShorteners;

            internal ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.IntervalSeconds property.
            /// </summary>
            /// <param name="value">IntervalSeconds</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder IntervalSeconds(ConfigNodePropertyInteger value)
            {
                _IntervalSeconds = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.CommitsPerIntervalThreshold property.
            /// </summary>
            /// <param name="value">CommitsPerIntervalThreshold</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder CommitsPerIntervalThreshold(ConfigNodePropertyInteger value)
            {
                _CommitsPerIntervalThreshold = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.MaxLocationLength property.
            /// </summary>
            /// <param name="value">MaxLocationLength</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder MaxLocationLength(ConfigNodePropertyInteger value)
            {
                _MaxLocationLength = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.MaxDetailsShown property.
            /// </summary>
            /// <param name="value">MaxDetailsShown</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder MaxDetailsShown(ConfigNodePropertyInteger value)
            {
                _MaxDetailsShown = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.MinDetailsPercentage property.
            /// </summary>
            /// <param name="value">MinDetailsPercentage</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder MinDetailsPercentage(ConfigNodePropertyInteger value)
            {
                _MinDetailsPercentage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.ThreadMatchers property.
            /// </summary>
            /// <param name="value">ThreadMatchers</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder ThreadMatchers(ConfigNodePropertyArray value)
            {
                _ThreadMatchers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.MaxGreedyDepth property.
            /// </summary>
            /// <param name="value">MaxGreedyDepth</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder MaxGreedyDepth(ConfigNodePropertyInteger value)
            {
                _MaxGreedyDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.GreedyStackMatchers property.
            /// </summary>
            /// <param name="value">GreedyStackMatchers</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder GreedyStackMatchers(ConfigNodePropertyString value)
            {
                _GreedyStackMatchers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.StackFilters property.
            /// </summary>
            /// <param name="value">StackFilters</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder StackFilters(ConfigNodePropertyArray value)
            {
                _StackFilters = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.StackMatchers property.
            /// </summary>
            /// <param name="value">StackMatchers</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder StackMatchers(ConfigNodePropertyArray value)
            {
                _StackMatchers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.StackCategorizers property.
            /// </summary>
            /// <param name="value">StackCategorizers</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder StackCategorizers(ConfigNodePropertyArray value)
            {
                _StackCategorizers = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.StackShorteners property.
            /// </summary>
            /// <param name="value">StackShorteners</param>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesBuilder StackShorteners(ConfigNodePropertyArray value)
            {
                _StackShorteners = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryImplCommitStatsConfigProperties</returns>
            public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
                    Enabled: _Enabled,
                    IntervalSeconds: _IntervalSeconds,
                    CommitsPerIntervalThreshold: _CommitsPerIntervalThreshold,
                    MaxLocationLength: _MaxLocationLength,
                    MaxDetailsShown: _MaxDetailsShown,
                    MinDetailsPercentage: _MinDetailsPercentage,
                    ThreadMatchers: _ThreadMatchers,
                    MaxGreedyDepth: _MaxGreedyDepth,
                    GreedyStackMatchers: _GreedyStackMatchers,
                    StackFilters: _StackFilters,
                    StackMatchers: _StackMatchers,
                    StackCategorizers: _StackCategorizers,
                    StackShorteners: _StackShorteners
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}