using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties:  IEquatable<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties>
    { 
        /// <summary>
        /// ParameterWhitelist
        /// </summary>
        public ConfigNodePropertyArray ParameterWhitelist { get; private set; }

        /// <summary>
        /// ParameterWhitelistPrefixes
        /// </summary>
        public ConfigNodePropertyArray ParameterWhitelistPrefixes { get; private set; }

        /// <summary>
        /// BinaryParameterWhitelist
        /// </summary>
        public ConfigNodePropertyArray BinaryParameterWhitelist { get; private set; }

        /// <summary>
        /// ModifierWhitelist
        /// </summary>
        public ConfigNodePropertyArray ModifierWhitelist { get; private set; }

        /// <summary>
        /// OperationWhitelist
        /// </summary>
        public ConfigNodePropertyArray OperationWhitelist { get; private set; }

        /// <summary>
        /// OperationWhitelistPrefixes
        /// </summary>
        public ConfigNodePropertyArray OperationWhitelistPrefixes { get; private set; }

        /// <summary>
        /// TypehintWhitelist
        /// </summary>
        public ConfigNodePropertyArray TypehintWhitelist { get; private set; }

        /// <summary>
        /// ResourcetypeWhitelist
        /// </summary>
        public ConfigNodePropertyArray ResourcetypeWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties()
        {
        }

        private ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties(ConfigNodePropertyArray ParameterWhitelist, ConfigNodePropertyArray ParameterWhitelistPrefixes, ConfigNodePropertyArray BinaryParameterWhitelist, ConfigNodePropertyArray ModifierWhitelist, ConfigNodePropertyArray OperationWhitelist, ConfigNodePropertyArray OperationWhitelistPrefixes, ConfigNodePropertyArray TypehintWhitelist, ConfigNodePropertyArray ResourcetypeWhitelist)
        {
            
            this.ParameterWhitelist = ParameterWhitelist;
            
            this.ParameterWhitelistPrefixes = ParameterWhitelistPrefixes;
            
            this.BinaryParameterWhitelist = BinaryParameterWhitelist;
            
            this.ModifierWhitelist = ModifierWhitelist;
            
            this.OperationWhitelist = OperationWhitelist;
            
            this.OperationWhitelistPrefixes = OperationWhitelistPrefixes;
            
            this.TypehintWhitelist = TypehintWhitelist;
            
            this.ResourcetypeWhitelist = ResourcetypeWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder</returns>
        public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder With()
        {
            return Builder()
                .ParameterWhitelist(ParameterWhitelist)
                .ParameterWhitelistPrefixes(ParameterWhitelistPrefixes)
                .BinaryParameterWhitelist(BinaryParameterWhitelist)
                .ModifierWhitelist(ModifierWhitelist)
                .OperationWhitelist(OperationWhitelist)
                .OperationWhitelistPrefixes(OperationWhitelistPrefixes)
                .TypehintWhitelist(TypehintWhitelist)
                .ResourcetypeWhitelist(ResourcetypeWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties left, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties left, ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ParameterWhitelist;
            private ConfigNodePropertyArray _ParameterWhitelistPrefixes;
            private ConfigNodePropertyArray _BinaryParameterWhitelist;
            private ConfigNodePropertyArray _ModifierWhitelist;
            private ConfigNodePropertyArray _OperationWhitelist;
            private ConfigNodePropertyArray _OperationWhitelistPrefixes;
            private ConfigNodePropertyArray _TypehintWhitelist;
            private ConfigNodePropertyArray _ResourcetypeWhitelist;

            internal ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.ParameterWhitelist property.
            /// </summary>
            /// <param name="value">ParameterWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ParameterWhitelist(ConfigNodePropertyArray value)
            {
                _ParameterWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.ParameterWhitelistPrefixes property.
            /// </summary>
            /// <param name="value">ParameterWhitelistPrefixes</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ParameterWhitelistPrefixes(ConfigNodePropertyArray value)
            {
                _ParameterWhitelistPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.BinaryParameterWhitelist property.
            /// </summary>
            /// <param name="value">BinaryParameterWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder BinaryParameterWhitelist(ConfigNodePropertyArray value)
            {
                _BinaryParameterWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.ModifierWhitelist property.
            /// </summary>
            /// <param name="value">ModifierWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ModifierWhitelist(ConfigNodePropertyArray value)
            {
                _ModifierWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.OperationWhitelist property.
            /// </summary>
            /// <param name="value">OperationWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder OperationWhitelist(ConfigNodePropertyArray value)
            {
                _OperationWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.OperationWhitelistPrefixes property.
            /// </summary>
            /// <param name="value">OperationWhitelistPrefixes</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder OperationWhitelistPrefixes(ConfigNodePropertyArray value)
            {
                _OperationWhitelistPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.TypehintWhitelist property.
            /// </summary>
            /// <param name="value">TypehintWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder TypehintWhitelist(ConfigNodePropertyArray value)
            {
                _TypehintWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.ResourcetypeWhitelist property.
            /// </summary>
            /// <param name="value">ResourcetypeWhitelist</param>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ResourcetypeWhitelist(ConfigNodePropertyArray value)
            {
                _ResourcetypeWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</returns>
            public ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties(
                    ParameterWhitelist: _ParameterWhitelist,
                    ParameterWhitelistPrefixes: _ParameterWhitelistPrefixes,
                    BinaryParameterWhitelist: _BinaryParameterWhitelist,
                    ModifierWhitelist: _ModifierWhitelist,
                    OperationWhitelist: _OperationWhitelist,
                    OperationWhitelistPrefixes: _OperationWhitelistPrefixes,
                    TypehintWhitelist: _TypehintWhitelist,
                    ResourcetypeWhitelist: _ResourcetypeWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}