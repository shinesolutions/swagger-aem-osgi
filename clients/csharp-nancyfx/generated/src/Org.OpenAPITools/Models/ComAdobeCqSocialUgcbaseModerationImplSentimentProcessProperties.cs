using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties:  IEquatable<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties>
    { 
        /// <summary>
        /// WatchwordsPositive
        /// </summary>
        public ConfigNodePropertyArray WatchwordsPositive { get; private set; }

        /// <summary>
        /// WatchwordsNegative
        /// </summary>
        public ConfigNodePropertyArray WatchwordsNegative { get; private set; }

        /// <summary>
        /// WatchwordsPath
        /// </summary>
        public ConfigNodePropertyString WatchwordsPath { get; private set; }

        /// <summary>
        /// SentimentPath
        /// </summary>
        public ConfigNodePropertyString SentimentPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(ConfigNodePropertyArray WatchwordsPositive, ConfigNodePropertyArray WatchwordsNegative, ConfigNodePropertyString WatchwordsPath, ConfigNodePropertyString SentimentPath)
        {
            
            this.WatchwordsPositive = WatchwordsPositive;
            
            this.WatchwordsNegative = WatchwordsNegative;
            
            this.WatchwordsPath = WatchwordsPath;
            
            this.SentimentPath = SentimentPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder With()
        {
            return Builder()
                .WatchwordsPositive(WatchwordsPositive)
                .WatchwordsNegative(WatchwordsNegative)
                .WatchwordsPath(WatchwordsPath)
                .SentimentPath(SentimentPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties left, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties left, ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder
        {
            private ConfigNodePropertyArray _WatchwordsPositive;
            private ConfigNodePropertyArray _WatchwordsNegative;
            private ConfigNodePropertyString _WatchwordsPath;
            private ConfigNodePropertyString _SentimentPath;

            internal ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.WatchwordsPositive property.
            /// </summary>
            /// <param name="value">WatchwordsPositive</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder WatchwordsPositive(ConfigNodePropertyArray value)
            {
                _WatchwordsPositive = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.WatchwordsNegative property.
            /// </summary>
            /// <param name="value">WatchwordsNegative</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder WatchwordsNegative(ConfigNodePropertyArray value)
            {
                _WatchwordsNegative = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.WatchwordsPath property.
            /// </summary>
            /// <param name="value">WatchwordsPath</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder WatchwordsPath(ConfigNodePropertyString value)
            {
                _WatchwordsPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.SentimentPath property.
            /// </summary>
            /// <param name="value">SentimentPath</param>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesBuilder SentimentPath(ConfigNodePropertyString value)
            {
                _SentimentPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties</returns>
            public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
                    WatchwordsPositive: _WatchwordsPositive,
                    WatchwordsNegative: _WatchwordsNegative,
                    WatchwordsPath: _WatchwordsPath,
                    SentimentPath: _SentimentPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}