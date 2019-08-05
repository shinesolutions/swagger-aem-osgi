using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingModelsImplModelAdapterFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingModelsImplModelAdapterFactoryProperties:  IEquatable<OrgApacheSlingModelsImplModelAdapterFactoryProperties>
    { 
        /// <summary>
        /// OsgiHttpWhiteboardListener
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardListener { get; private set; }

        /// <summary>
        /// OsgiHttpWhiteboardContextSelect
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; private set; }

        /// <summary>
        /// MaxRecursionDepth
        /// </summary>
        public ConfigNodePropertyInteger MaxRecursionDepth { get; private set; }

        /// <summary>
        /// CleanupJobPeriod
        /// </summary>
        public ConfigNodePropertyInteger CleanupJobPeriod { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingModelsImplModelAdapterFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingModelsImplModelAdapterFactoryProperties()
        {
        }

        private OrgApacheSlingModelsImplModelAdapterFactoryProperties(ConfigNodePropertyString OsgiHttpWhiteboardListener, ConfigNodePropertyString OsgiHttpWhiteboardContextSelect, ConfigNodePropertyInteger MaxRecursionDepth, ConfigNodePropertyInteger CleanupJobPeriod)
        {
            
            this.OsgiHttpWhiteboardListener = OsgiHttpWhiteboardListener;
            
            this.OsgiHttpWhiteboardContextSelect = OsgiHttpWhiteboardContextSelect;
            
            this.MaxRecursionDepth = MaxRecursionDepth;
            
            this.CleanupJobPeriod = CleanupJobPeriod;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingModelsImplModelAdapterFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder</returns>
        public OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder With()
        {
            return Builder()
                .OsgiHttpWhiteboardListener(OsgiHttpWhiteboardListener)
                .OsgiHttpWhiteboardContextSelect(OsgiHttpWhiteboardContextSelect)
                .MaxRecursionDepth(MaxRecursionDepth)
                .CleanupJobPeriod(CleanupJobPeriod);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingModelsImplModelAdapterFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingModelsImplModelAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsImplModelAdapterFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingModelsImplModelAdapterFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingModelsImplModelAdapterFactoryProperties left, OrgApacheSlingModelsImplModelAdapterFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingModelsImplModelAdapterFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingModelsImplModelAdapterFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingModelsImplModelAdapterFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingModelsImplModelAdapterFactoryProperties left, OrgApacheSlingModelsImplModelAdapterFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingModelsImplModelAdapterFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _OsgiHttpWhiteboardListener;
            private ConfigNodePropertyString _OsgiHttpWhiteboardContextSelect;
            private ConfigNodePropertyInteger _MaxRecursionDepth;
            private ConfigNodePropertyInteger _CleanupJobPeriod;

            internal OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryProperties.OsgiHttpWhiteboardListener property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardListener</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder OsgiHttpWhiteboardListener(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardListener = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryProperties.OsgiHttpWhiteboardContextSelect property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardContextSelect</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder OsgiHttpWhiteboardContextSelect(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardContextSelect = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryProperties.MaxRecursionDepth property.
            /// </summary>
            /// <param name="value">MaxRecursionDepth</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder MaxRecursionDepth(ConfigNodePropertyInteger value)
            {
                _MaxRecursionDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingModelsImplModelAdapterFactoryProperties.CleanupJobPeriod property.
            /// </summary>
            /// <param name="value">CleanupJobPeriod</param>
            public OrgApacheSlingModelsImplModelAdapterFactoryPropertiesBuilder CleanupJobPeriod(ConfigNodePropertyInteger value)
            {
                _CleanupJobPeriod = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingModelsImplModelAdapterFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingModelsImplModelAdapterFactoryProperties</returns>
            public OrgApacheSlingModelsImplModelAdapterFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingModelsImplModelAdapterFactoryProperties(
                    OsgiHttpWhiteboardListener: _OsgiHttpWhiteboardListener,
                    OsgiHttpWhiteboardContextSelect: _OsgiHttpWhiteboardContextSelect,
                    MaxRecursionDepth: _MaxRecursionDepth,
                    CleanupJobPeriod: _CleanupJobPeriod
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}