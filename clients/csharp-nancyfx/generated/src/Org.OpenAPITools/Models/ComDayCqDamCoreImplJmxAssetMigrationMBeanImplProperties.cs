using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties:  IEquatable<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties>
    { 
        /// <summary>
        /// JmxObjectname
        /// </summary>
        public ConfigNodePropertyString JmxObjectname { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties()
        {
        }

        private ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(ConfigNodePropertyString JmxObjectname)
        {
            
            this.JmxObjectname = JmxObjectname;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder</returns>
        public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder With()
        {
            return Builder()
                .JmxObjectname(JmxObjectname);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties left, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties left, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder
        {
            private ConfigNodePropertyString _JmxObjectname;

            internal ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.JmxObjectname property.
            /// </summary>
            /// <param name="value">JmxObjectname</param>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesBuilder JmxObjectname(ConfigNodePropertyString value)
            {
                _JmxObjectname = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties</returns>
            public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(
                    JmxObjectname: _JmxObjectname
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}