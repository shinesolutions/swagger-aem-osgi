using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties:  IEquatable<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties>
    { 
        /// <summary>
        /// LinkExpiredPrefix
        /// </summary>
        public ConfigNodePropertyString LinkExpiredPrefix { get; private set; }

        /// <summary>
        /// LinkExpiredRemove
        /// </summary>
        public ConfigNodePropertyBoolean LinkExpiredRemove { get; private set; }

        /// <summary>
        /// LinkExpiredSuffix
        /// </summary>
        public ConfigNodePropertyString LinkExpiredSuffix { get; private set; }

        /// <summary>
        /// LinkInvalidPrefix
        /// </summary>
        public ConfigNodePropertyString LinkInvalidPrefix { get; private set; }

        /// <summary>
        /// LinkInvalidRemove
        /// </summary>
        public ConfigNodePropertyBoolean LinkInvalidRemove { get; private set; }

        /// <summary>
        /// LinkInvalidSuffix
        /// </summary>
        public ConfigNodePropertyString LinkInvalidSuffix { get; private set; }

        /// <summary>
        /// LinkPredatedPrefix
        /// </summary>
        public ConfigNodePropertyString LinkPredatedPrefix { get; private set; }

        /// <summary>
        /// LinkPredatedRemove
        /// </summary>
        public ConfigNodePropertyBoolean LinkPredatedRemove { get; private set; }

        /// <summary>
        /// LinkPredatedSuffix
        /// </summary>
        public ConfigNodePropertyString LinkPredatedSuffix { get; private set; }

        /// <summary>
        /// LinkWcmmodes
        /// </summary>
        public ConfigNodePropertyArray LinkWcmmodes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties()
        {
        }

        private ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(ConfigNodePropertyString LinkExpiredPrefix, ConfigNodePropertyBoolean LinkExpiredRemove, ConfigNodePropertyString LinkExpiredSuffix, ConfigNodePropertyString LinkInvalidPrefix, ConfigNodePropertyBoolean LinkInvalidRemove, ConfigNodePropertyString LinkInvalidSuffix, ConfigNodePropertyString LinkPredatedPrefix, ConfigNodePropertyBoolean LinkPredatedRemove, ConfigNodePropertyString LinkPredatedSuffix, ConfigNodePropertyArray LinkWcmmodes)
        {
            
            this.LinkExpiredPrefix = LinkExpiredPrefix;
            
            this.LinkExpiredRemove = LinkExpiredRemove;
            
            this.LinkExpiredSuffix = LinkExpiredSuffix;
            
            this.LinkInvalidPrefix = LinkInvalidPrefix;
            
            this.LinkInvalidRemove = LinkInvalidRemove;
            
            this.LinkInvalidSuffix = LinkInvalidSuffix;
            
            this.LinkPredatedPrefix = LinkPredatedPrefix;
            
            this.LinkPredatedRemove = LinkPredatedRemove;
            
            this.LinkPredatedSuffix = LinkPredatedSuffix;
            
            this.LinkWcmmodes = LinkWcmmodes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .LinkExpiredPrefix(LinkExpiredPrefix)
                .LinkExpiredRemove(LinkExpiredRemove)
                .LinkExpiredSuffix(LinkExpiredSuffix)
                .LinkInvalidPrefix(LinkInvalidPrefix)
                .LinkInvalidRemove(LinkInvalidRemove)
                .LinkInvalidSuffix(LinkInvalidSuffix)
                .LinkPredatedPrefix(LinkPredatedPrefix)
                .LinkPredatedRemove(LinkPredatedRemove)
                .LinkPredatedSuffix(LinkPredatedSuffix)
                .LinkWcmmodes(LinkWcmmodes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties left, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties left, ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyString _LinkExpiredPrefix;
            private ConfigNodePropertyBoolean _LinkExpiredRemove;
            private ConfigNodePropertyString _LinkExpiredSuffix;
            private ConfigNodePropertyString _LinkInvalidPrefix;
            private ConfigNodePropertyBoolean _LinkInvalidRemove;
            private ConfigNodePropertyString _LinkInvalidSuffix;
            private ConfigNodePropertyString _LinkPredatedPrefix;
            private ConfigNodePropertyBoolean _LinkPredatedRemove;
            private ConfigNodePropertyString _LinkPredatedSuffix;
            private ConfigNodePropertyArray _LinkWcmmodes;

            internal ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkExpiredPrefix property.
            /// </summary>
            /// <param name="value">LinkExpiredPrefix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkExpiredPrefix(ConfigNodePropertyString value)
            {
                _LinkExpiredPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkExpiredRemove property.
            /// </summary>
            /// <param name="value">LinkExpiredRemove</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkExpiredRemove(ConfigNodePropertyBoolean value)
            {
                _LinkExpiredRemove = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkExpiredSuffix property.
            /// </summary>
            /// <param name="value">LinkExpiredSuffix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkExpiredSuffix(ConfigNodePropertyString value)
            {
                _LinkExpiredSuffix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkInvalidPrefix property.
            /// </summary>
            /// <param name="value">LinkInvalidPrefix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkInvalidPrefix(ConfigNodePropertyString value)
            {
                _LinkInvalidPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkInvalidRemove property.
            /// </summary>
            /// <param name="value">LinkInvalidRemove</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkInvalidRemove(ConfigNodePropertyBoolean value)
            {
                _LinkInvalidRemove = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkInvalidSuffix property.
            /// </summary>
            /// <param name="value">LinkInvalidSuffix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkInvalidSuffix(ConfigNodePropertyString value)
            {
                _LinkInvalidSuffix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkPredatedPrefix property.
            /// </summary>
            /// <param name="value">LinkPredatedPrefix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkPredatedPrefix(ConfigNodePropertyString value)
            {
                _LinkPredatedPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkPredatedRemove property.
            /// </summary>
            /// <param name="value">LinkPredatedRemove</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkPredatedRemove(ConfigNodePropertyBoolean value)
            {
                _LinkPredatedRemove = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkPredatedSuffix property.
            /// </summary>
            /// <param name="value">LinkPredatedSuffix</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkPredatedSuffix(ConfigNodePropertyString value)
            {
                _LinkPredatedSuffix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.LinkWcmmodes property.
            /// </summary>
            /// <param name="value">LinkWcmmodes</param>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesBuilder LinkWcmmodes(ConfigNodePropertyArray value)
            {
                _LinkWcmmodes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties</returns>
            public ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(
                    LinkExpiredPrefix: _LinkExpiredPrefix,
                    LinkExpiredRemove: _LinkExpiredRemove,
                    LinkExpiredSuffix: _LinkExpiredSuffix,
                    LinkInvalidPrefix: _LinkInvalidPrefix,
                    LinkInvalidRemove: _LinkInvalidRemove,
                    LinkInvalidSuffix: _LinkInvalidSuffix,
                    LinkPredatedPrefix: _LinkPredatedPrefix,
                    LinkPredatedRemove: _LinkPredatedRemove,
                    LinkPredatedSuffix: _LinkPredatedSuffix,
                    LinkWcmmodes: _LinkWcmmodes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}