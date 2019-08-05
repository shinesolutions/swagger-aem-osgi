using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties:  IEquatable<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// CheckpathPrefix
        /// </summary>
        public ConfigNodePropertyString CheckpathPrefix { get; private set; }

        /// <summary>
        /// JcrPath
        /// </summary>
        public ConfigNodePropertyString JcrPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties()
        {
        }

        private OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(ConfigNodePropertyString Path, ConfigNodePropertyString CheckpathPrefix, ConfigNodePropertyString JcrPath)
        {
            
            this.Path = Path;
            
            this.CheckpathPrefix = CheckpathPrefix;
            
            this.JcrPath = JcrPath;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder</returns>
        public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
                .CheckpathPrefix(CheckpathPrefix)
                .JcrPath(JcrPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties left, OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties left, OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyString _CheckpathPrefix;
            private ConfigNodePropertyString _JcrPath;

            internal OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.CheckpathPrefix property.
            /// </summary>
            /// <param name="value">CheckpathPrefix</param>
            public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder CheckpathPrefix(ConfigNodePropertyString value)
            {
                _CheckpathPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.JcrPath property.
            /// </summary>
            /// <param name="value">JcrPath</param>
            public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder JcrPath(ConfigNodePropertyString value)
            {
                _JcrPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</returns>
            public OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
                    Path: _Path,
                    CheckpathPrefix: _CheckpathPrefix,
                    JcrPath: _JcrPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}