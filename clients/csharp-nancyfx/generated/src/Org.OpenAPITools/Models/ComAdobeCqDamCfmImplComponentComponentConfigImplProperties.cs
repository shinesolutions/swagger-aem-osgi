using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties:  IEquatable<ComAdobeCqDamCfmImplComponentComponentConfigImplProperties>
    { 
        /// <summary>
        /// DamCfmComponentResourceType
        /// </summary>
        public ConfigNodePropertyString DamCfmComponentResourceType { get; private set; }

        /// <summary>
        /// DamCfmComponentFileReferenceProp
        /// </summary>
        public ConfigNodePropertyString DamCfmComponentFileReferenceProp { get; private set; }

        /// <summary>
        /// DamCfmComponentElementsProp
        /// </summary>
        public ConfigNodePropertyString DamCfmComponentElementsProp { get; private set; }

        /// <summary>
        /// DamCfmComponentVariationProp
        /// </summary>
        public ConfigNodePropertyString DamCfmComponentVariationProp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties()
        {
        }

        private ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(ConfigNodePropertyString DamCfmComponentResourceType, ConfigNodePropertyString DamCfmComponentFileReferenceProp, ConfigNodePropertyString DamCfmComponentElementsProp, ConfigNodePropertyString DamCfmComponentVariationProp)
        {
            
            this.DamCfmComponentResourceType = DamCfmComponentResourceType;
            
            this.DamCfmComponentFileReferenceProp = DamCfmComponentFileReferenceProp;
            
            this.DamCfmComponentElementsProp = DamCfmComponentElementsProp;
            
            this.DamCfmComponentVariationProp = DamCfmComponentVariationProp;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder</returns>
        public static ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder</returns>
        public ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder With()
        {
            return Builder()
                .DamCfmComponentResourceType(DamCfmComponentResourceType)
                .DamCfmComponentFileReferenceProp(DamCfmComponentFileReferenceProp)
                .DamCfmComponentElementsProp(DamCfmComponentElementsProp)
                .DamCfmComponentVariationProp(DamCfmComponentVariationProp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamCfmImplComponentComponentConfigImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties left, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties left, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder
        {
            private ConfigNodePropertyString _DamCfmComponentResourceType;
            private ConfigNodePropertyString _DamCfmComponentFileReferenceProp;
            private ConfigNodePropertyString _DamCfmComponentElementsProp;
            private ConfigNodePropertyString _DamCfmComponentVariationProp;

            internal ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.DamCfmComponentResourceType property.
            /// </summary>
            /// <param name="value">DamCfmComponentResourceType</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder DamCfmComponentResourceType(ConfigNodePropertyString value)
            {
                _DamCfmComponentResourceType = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.DamCfmComponentFileReferenceProp property.
            /// </summary>
            /// <param name="value">DamCfmComponentFileReferenceProp</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder DamCfmComponentFileReferenceProp(ConfigNodePropertyString value)
            {
                _DamCfmComponentFileReferenceProp = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.DamCfmComponentElementsProp property.
            /// </summary>
            /// <param name="value">DamCfmComponentElementsProp</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder DamCfmComponentElementsProp(ConfigNodePropertyString value)
            {
                _DamCfmComponentElementsProp = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.DamCfmComponentVariationProp property.
            /// </summary>
            /// <param name="value">DamCfmComponentVariationProp</param>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplPropertiesBuilder DamCfmComponentVariationProp(ConfigNodePropertyString value)
            {
                _DamCfmComponentVariationProp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplComponentComponentConfigImplProperties</returns>
            public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(
                    DamCfmComponentResourceType: _DamCfmComponentResourceType,
                    DamCfmComponentFileReferenceProp: _DamCfmComponentFileReferenceProp,
                    DamCfmComponentElementsProp: _DamCfmComponentElementsProp,
                    DamCfmComponentVariationProp: _DamCfmComponentVariationProp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}