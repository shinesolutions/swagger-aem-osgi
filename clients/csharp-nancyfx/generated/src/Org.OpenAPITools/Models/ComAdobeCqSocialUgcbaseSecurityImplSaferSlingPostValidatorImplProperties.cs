using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties:  IEquatable<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties>
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
        /// Use ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties()
        {
        }

        private ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(ConfigNodePropertyArray ParameterWhitelist, ConfigNodePropertyArray ParameterWhitelistPrefixes, ConfigNodePropertyArray BinaryParameterWhitelist, ConfigNodePropertyArray ModifierWhitelist, ConfigNodePropertyArray OperationWhitelist, ConfigNodePropertyArray OperationWhitelistPrefixes, ConfigNodePropertyArray TypehintWhitelist, ConfigNodePropertyArray ResourcetypeWhitelist)
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
        /// Returns builder of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder</returns>
        public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties left, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties left, ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ParameterWhitelist;
            private ConfigNodePropertyArray _ParameterWhitelistPrefixes;
            private ConfigNodePropertyArray _BinaryParameterWhitelist;
            private ConfigNodePropertyArray _ModifierWhitelist;
            private ConfigNodePropertyArray _OperationWhitelist;
            private ConfigNodePropertyArray _OperationWhitelistPrefixes;
            private ConfigNodePropertyArray _TypehintWhitelist;
            private ConfigNodePropertyArray _ResourcetypeWhitelist;

            internal ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.ParameterWhitelist property.
            /// </summary>
            /// <param name="value">ParameterWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ParameterWhitelist(ConfigNodePropertyArray value)
            {
                _ParameterWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.ParameterWhitelistPrefixes property.
            /// </summary>
            /// <param name="value">ParameterWhitelistPrefixes</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ParameterWhitelistPrefixes(ConfigNodePropertyArray value)
            {
                _ParameterWhitelistPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.BinaryParameterWhitelist property.
            /// </summary>
            /// <param name="value">BinaryParameterWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder BinaryParameterWhitelist(ConfigNodePropertyArray value)
            {
                _BinaryParameterWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.ModifierWhitelist property.
            /// </summary>
            /// <param name="value">ModifierWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ModifierWhitelist(ConfigNodePropertyArray value)
            {
                _ModifierWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.OperationWhitelist property.
            /// </summary>
            /// <param name="value">OperationWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder OperationWhitelist(ConfigNodePropertyArray value)
            {
                _OperationWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.OperationWhitelistPrefixes property.
            /// </summary>
            /// <param name="value">OperationWhitelistPrefixes</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder OperationWhitelistPrefixes(ConfigNodePropertyArray value)
            {
                _OperationWhitelistPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.TypehintWhitelist property.
            /// </summary>
            /// <param name="value">TypehintWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder TypehintWhitelist(ConfigNodePropertyArray value)
            {
                _TypehintWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.ResourcetypeWhitelist property.
            /// </summary>
            /// <param name="value">ResourcetypeWhitelist</param>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBuilder ResourcetypeWhitelist(ConfigNodePropertyArray value)
            {
                _ResourcetypeWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties</returns>
            public ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
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