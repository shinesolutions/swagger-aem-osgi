using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
    /// </summary>
    public sealed class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties:  IEquatable<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties>
    { 
        /// <summary>
        /// MaxMemory
        /// </summary>
        public ConfigNodePropertyInteger MaxMemory { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties()
        {
        }

        private ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(ConfigNodePropertyInteger MaxMemory)
        {
            
            this.MaxMemory = MaxMemory;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder</returns>
        public static ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder</returns>
        public ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder With()
        {
            return Builder()
                .MaxMemory(MaxMemory);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamDmProcessImagePTiffManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties left, ComAdobeCqDamDmProcessImagePTiffManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties left, ComAdobeCqDamDmProcessImagePTiffManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxMemory;

            internal ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.MaxMemory property.
            /// </summary>
            /// <param name="value">MaxMemory</param>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplPropertiesBuilder MaxMemory(ConfigNodePropertyInteger value)
            {
                _MaxMemory = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamDmProcessImagePTiffManagerImplProperties</returns>
            public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(
                    MaxMemory: _MaxMemory
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}