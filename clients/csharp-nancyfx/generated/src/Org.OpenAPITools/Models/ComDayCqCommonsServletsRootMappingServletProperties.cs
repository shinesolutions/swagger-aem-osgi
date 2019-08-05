using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCommonsServletsRootMappingServletProperties
    /// </summary>
    public sealed class ComDayCqCommonsServletsRootMappingServletProperties:  IEquatable<ComDayCqCommonsServletsRootMappingServletProperties>
    { 
        /// <summary>
        /// RootmappingTarget
        /// </summary>
        public ConfigNodePropertyString RootmappingTarget { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCommonsServletsRootMappingServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCommonsServletsRootMappingServletProperties()
        {
        }

        private ComDayCqCommonsServletsRootMappingServletProperties(ConfigNodePropertyString RootmappingTarget)
        {
            
            this.RootmappingTarget = RootmappingTarget;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCommonsServletsRootMappingServletProperties.
        /// </summary>
        /// <returns>ComDayCqCommonsServletsRootMappingServletPropertiesBuilder</returns>
        public static ComDayCqCommonsServletsRootMappingServletPropertiesBuilder Builder()
        {
            return new ComDayCqCommonsServletsRootMappingServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCommonsServletsRootMappingServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCommonsServletsRootMappingServletPropertiesBuilder</returns>
        public ComDayCqCommonsServletsRootMappingServletPropertiesBuilder With()
        {
            return Builder()
                .RootmappingTarget(RootmappingTarget);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqCommonsServletsRootMappingServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCommonsServletsRootMappingServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsServletsRootMappingServletProperties</param>
        /// <param name="right">Compared (ComDayCqCommonsServletsRootMappingServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCommonsServletsRootMappingServletProperties left, ComDayCqCommonsServletsRootMappingServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCommonsServletsRootMappingServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsServletsRootMappingServletProperties</param>
        /// <param name="right">Compared (ComDayCqCommonsServletsRootMappingServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCommonsServletsRootMappingServletProperties left, ComDayCqCommonsServletsRootMappingServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCommonsServletsRootMappingServletProperties.
        /// </summary>
        public sealed class ComDayCqCommonsServletsRootMappingServletPropertiesBuilder
        {
            private ConfigNodePropertyString _RootmappingTarget;

            internal ComDayCqCommonsServletsRootMappingServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsServletsRootMappingServletProperties.RootmappingTarget property.
            /// </summary>
            /// <param name="value">RootmappingTarget</param>
            public ComDayCqCommonsServletsRootMappingServletPropertiesBuilder RootmappingTarget(ConfigNodePropertyString value)
            {
                _RootmappingTarget = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCommonsServletsRootMappingServletProperties.
            /// </summary>
            /// <returns>ComDayCqCommonsServletsRootMappingServletProperties</returns>
            public ComDayCqCommonsServletsRootMappingServletProperties Build()
            {
                Validate();
                return new ComDayCqCommonsServletsRootMappingServletProperties(
                    RootmappingTarget: _RootmappingTarget
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}